package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/hi")
	public String say() {
		return "Hello";
	}

	@GetMapping("/{id}")
	public ResponseEntity<Courses> getCourse(@PathVariable Long id) {
		return ResponseEntity.ok(courseService.getCourse(id));
	}
	
	@PostMapping("/save")
	public ResponseEntity<Courses> getCourse(@RequestBody Courses course) {
		return ResponseEntity.ok(courseService.saveCourse(course));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Courses> >getAllCourses() {
		System.out.println("called all courses");
		return ResponseEntity.ok(courseService.getAllCourses());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Courses> updateCourse(@RequestBody Courses course, @PathVariable Long id) {
		return ResponseEntity.ok(courseService.updateCourse(course,id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
		return ResponseEntity.ok(courseService.deleteCourse(id));
	}
	/*
	 * git init git add README.md git commit -m "first commit" git branch -M main
	 * git remote add origin https://github.com/prasanthilab/courses-rest-api.git
	 * git push -u origin main
	 */
	//
}
