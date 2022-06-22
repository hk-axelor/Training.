package com.axelor.main;

import com.axelor.module.AppModule;
import com.axelor.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQUARE_REQ = "SQUARE";

	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals(SQUARE_REQ)) {
			
// Without using Guice			
    /*		DrawShape d = new DrawSquare();
			SquareRequest request = new  SquareRequest(d);
			request.makeRequest();
			*/
			
// Using Guice
	
/*	Injector injector = Guice.createInjector(new AppModule());    // initializing the injector
	DrawShape d = injector.getInstance(DrawShape.class); */
/*	SquareRequest request = new  SquareRequest(d); */
			
			
	 	

// SINGLETON
	
/*	SquareRequest request1 = injector.getInstance(SquareRequest.class);
	request1.makeRequest();
	
	SquareRequest request2 = injector.getInstance(SquareRequest.class);
	request2.makeRequest();
	
	boolean areSquareRequestEqual = request1 == request2;
	System.out.println("were Square Requests equal :" +areSquareRequestEqual);
*/				
		
	Injector injector = Guice.createInjector(new AppModule()); 
	SquareRequest request = injector.getInstance(SquareRequest.class);
	request.makeRequest();	
		
		
		
		
		
		}
		
	}
	
	public static void main(String[] args) {
		
		sendRequest(SQUARE_REQ);
		

	}

	

}
