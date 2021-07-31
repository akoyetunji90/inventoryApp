package com.zeedlabs.oneToManyExample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeedlabs.oneToManyExample.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
 List<Course> findByInstructorId(Long instructorId);
 Optional<Course> findByIdAndInstructorId(Long id, Long instructorId);
}