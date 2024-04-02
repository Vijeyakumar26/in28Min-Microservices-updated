package com.minutes.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minutes.beans.Course;

@RestController
public class CourseController {
	
	@GetMapping(path = "/courses")
	public List<Course> getCourses(){		
		return Arrays.asList(
				new Course(1,"AWS","Ranga"),
				new Course(2,"AWS","Karnam")
				);
	}
}
