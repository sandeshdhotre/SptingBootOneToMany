package amdocs.monitoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import amdocs.monitoring.entity.Course;
import amdocs.monitoring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	public List<Course> findCourseByStudentId(Integer id);
}
