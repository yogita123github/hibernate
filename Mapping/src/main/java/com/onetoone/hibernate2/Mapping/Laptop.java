package com.onetoone.hibernate2.Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lId;
	private String laptop_Brand;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getLaptop_Brand() {
		return laptop_Brand;
	}
	public void setLaptop_Brand(String laptop_Brand) {
		this.laptop_Brand = laptop_Brand;
	}
	

}
