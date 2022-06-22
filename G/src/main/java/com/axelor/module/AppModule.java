package com.axelor.module;

//import com.axelor.annotations.ColorValue;
//import com.axelor.annotations.EdgeValue;
// import com.axelor.requests.SquareRequestSubclass;
import com.axelor.services.DrawShape;
import com.axelor.services.DrawSquare;
import com.google.inject.AbstractModule;
//import com.google.inject.Scopes;

public class AppModule extends AbstractModule {
	
	@Override
	protected void configure() {
		
		
		bind(DrawShape.class).to(DrawSquare.class);
/*      bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
		bind(SquareRequest.class).to(SquareRequestSubclass.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
		bind(SquareRequest.class).in(Scopes.SINGLETON);
		*/
	}

}
