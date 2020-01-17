package amdocs.monitoring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import amdocs.monitoring.entity.Student;
import amdocs.monitoring.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;

	public void save(@RequestBody Student student) {
		student.getCourses().parallelStream().forEach(c-> c.setStudent(student));
		repository.save(student);
	}
	

	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	public Student get(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
}
