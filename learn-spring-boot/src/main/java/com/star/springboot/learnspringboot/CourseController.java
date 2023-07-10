package com.star.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Java", "Teacher"),
				new Course(2, "Python", "Teacher"),
				new Course(3, "C#", "Teacher"),
				new Course(4, "CSS", "Teacher")
				);
	}
	
	
}
