package com.axelor.service;

import com.axelor.service.impl.GuiceServiceImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {
	String sayHello();

}
