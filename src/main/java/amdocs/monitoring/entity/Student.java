package amdocs.monitoring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue
	public Integer studentId;
	public String name;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	public List<Course> courses;

}
