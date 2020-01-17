package amdocs.monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import amdocs.monitoring.entity.Course;

public interface CourseRepository  extends JpaRepository<Course ,Integer> {

}
