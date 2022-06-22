package com.axelor.requests;



import javax.inject.Inject;


import com.axelor.services.DrawShape;

public class SquareRequest {
	

	
// 1-constructor injection : to inject Dependency	
	
    /*	@Inject
	    public SquareRequest(DrawShape d) {
		  this.d = d;
	}
     */		
	
// 2-method injection	

	/*	@Inject
		public void setDrawShape(DrawShape d) {
			this.d = d;
		}
	*/
	
// 3-feild injection		
		@Inject
		DrawShape d;
	
	
	public void makeRequest() {
		d.draw();
	}
	
	

	

    
}
