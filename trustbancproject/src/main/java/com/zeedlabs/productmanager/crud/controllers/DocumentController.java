package com.zeedlabs.productmanager.crud.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zeedlabs.productmanager.crud.FileUploadUtil;
import com.zeedlabs.productmanager.crud.entity.Documents;
import com.zeedlabs.productmanager.crud.repository.DocumentRepository;

@Controller
public class DocumentController {

	@Autowired
	private DocumentRepository repo;

	@GetMapping("/documents")

	public String showDocumentForm(Model model) {
		Documents doc = new Documents();
		model.addAttribute("doc", doc);

		
		return "document_form";
	}

	  @PostMapping("/documents") public String handleFormSubmit( @ModelAttribute
	  ("doc") Documents doc,
	  
	  @RequestParam("profilePictureFile") MultipartFile multipartFile1,
	  
	  @RequestParam("photoIdFile") MultipartFile multipartFile2,
	  
	  @RequestParam("documentFile") MultipartFile multipartFile3) throws
	  IOException {
	  
	  String profilePictureFileName =
	  StringUtils.cleanPath(multipartFile1.getOriginalFilename()); String
	  photoIdFileName =
	  StringUtils.cleanPath(multipartFile2.getOriginalFilename()); String
	  documentFileName =
	  StringUtils.cleanPath(multipartFile3.getOriginalFilename());
	  doc.setProfilepicture(profilePictureFileName);
	  doc.setPhotoid(photoIdFileName); doc.setDocument(documentFileName);
	  
	  Documents savedCandidate = repo.save(doc); String uploadDir = "customers/" +
	  savedCandidate.getId();
	  
	  FileUploadUtil.saveFile(uploadDir, profilePictureFileName, multipartFile1);
	  FileUploadUtil.saveFile(uploadDir, photoIdFileName, multipartFile2);
	  FileUploadUtil.saveFile(uploadDir, documentFileName, multipartFile3);
	  
	  return "document_form";
	  }
 }