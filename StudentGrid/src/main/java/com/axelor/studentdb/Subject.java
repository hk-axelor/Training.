package com.axelor.studentdb;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int subid;
	private String subname;
	
	@ManyToMany
	private Set<Student> students = new HashSet<Student>();
	
	
	
	public int getSubid() {
		return subid;
	}



	public void setSubid(int subid) {
		this.subid = subid;
	}



	public String getSubname() {
		return subname;
	}



	public void setSubname(String subname) {
		this.subname = subname;
	}



	public Set<Student> getS() {
		return students;
	}



	public void setS(Student s) {
		this.students.add(s);
	}



	public void removestud(Student s)
	{
		this.students.remove(s);
	}
	
}
