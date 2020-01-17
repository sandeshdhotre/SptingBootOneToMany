package amdocs.monitoring.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private Integer couseId;
	
	private String courseName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Student student;

}
