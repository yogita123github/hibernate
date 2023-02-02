package com.onetoone.hibernate2.Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int sId;
    private String sName;
    
    @OneToOne(cascade=CascadeType.ALL, mappedBy="student")
    private Laptop laptop;
    
    
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
    
}
