package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.repository.CourseRepo;

@Service
public class CourseService {
	@Autowired
	CourseRepo courseRepo;

	public Courses getCourse(Long id) {
		return courseRepo.findById(id).get();
	}

	public List<Courses> getAllCourses() {
		return courseRepo.findAll();
	}

	public Courses saveCourse(Courses course) {
		return courseRepo.save(course);
	}

	public Courses updateCourse(Courses course, Long id) {

		Courses c = getCourse(id);

		c.setTitle(course.getTitle());
		c.setDescription(course.getDescription());
		return courseRepo.save(c);
	}

	public String deleteCourse(Long id) {
		// TODO Auto-generated method stub
		Courses c = getCourse(id);
		courseRepo.delete(c);
		return "deleted";
	}
}
