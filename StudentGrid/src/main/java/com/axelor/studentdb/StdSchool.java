package com.axelor.studentdb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StdSchool {
	@Id
	private int id;
	private String sclname;
	

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSclname() {
		return sclname;
	}
	public void setSclname(String sclname) {
		this.sclname = sclname;
	}
	
	public List<Student> getS() {
		return s;
	}
	public void setS(List<Student> s) {
		this.s = s;
	}
	
	@OneToMany(mappedBy = "school")
	private List<Student> s = new ArrayList<Student>();



}
