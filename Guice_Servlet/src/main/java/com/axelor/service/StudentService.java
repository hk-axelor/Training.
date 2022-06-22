package com.axelor.service;

import com.axelor.service.impl.StudentServiceImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(StudentServiceImpl.class)
public interface StudentService {
	String authenticate(String studentName, String password);

}
