package com.learnings.aman.springbootquick.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id){
		List <Course> topics = new ArrayList<>();
		courseRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Course> getCourse(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void add(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void update(Course course) {
		courseRepository.save(course);
	}

	public void delete(String id) {
		courseRepository.deleteById(id);
	}
}
