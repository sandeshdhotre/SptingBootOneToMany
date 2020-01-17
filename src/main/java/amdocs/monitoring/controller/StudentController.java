package amdocs.monitoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import amdocs.monitoring.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	amdocs.monitoring.service.StudentService studentService;

	@RequestMapping(value="/",method = RequestMethod.POST)
	public void save(@RequestBody Student student) {
		studentService.save(student);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		studentService.delete(id);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Student get(@PathVariable("id") Integer id) {
		return studentService.get(id);
	}
}
