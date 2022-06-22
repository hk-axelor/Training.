package com.axelor.studentdb;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "students")
	private Set<Subject> subject = new HashSet<Subject>();
	
	@ManyToOne
	StdSchool school = new StdSchool();
	
	@OneToOne
	private Book book;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public StdSchool getSchool() {
		return school;
	}

	public void setSchool(StdSchool school) {
		this.school = school;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
	public Set<Subject> getSubject() {
		return subject;
	}
	
	public void setSubject(Subject sub) {
		this.subject.add(sub);
	}
	
	
}
