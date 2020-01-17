package amdocs.monitoring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import amdocs.monitoring.entity.Course;
import amdocs.monitoring.repository.CourseRepository;

public class CourseService {
	@Autowired
	CourseRepository repository;

	public void save(@RequestBody Course course) {
		repository.save(course);
	}
	

	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	public Course get(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
}
