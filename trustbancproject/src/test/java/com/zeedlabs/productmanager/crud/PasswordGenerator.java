package com.zeedlabs.productmanager.crud;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	
	public static void main (String[] args) {
	BCryptPasswordEncoder passwordEncoder = new  BCryptPasswordEncoder();
String rawPassword = "Pass123$$";
String encodedPassword = passwordEncoder.encode(rawPassword);

System.out.println(encodedPassword);
}
 }
