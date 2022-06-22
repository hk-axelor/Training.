package com.axelor.listener;

import javax.servlet.annotation.WebListener;

import com.axelor.servlet.ActionServlet;
import com.axelor.servlet.GuiceServlet;
import com.axelor.servlet.LoginServlet;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

@WebListener
public class GuiceListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			protected void configureServlets() {
			//	serve("/").with(GuiceServlet.class);
			//	serve("/GuiceServlet").with(GuiceServlet.class);
				serve("/guice").with(GuiceServlet.class);
				serve("/login").with(LoginServlet.class);
				serve("/authenticate").with(ActionServlet.class);
				
			}
		});
	}

}
