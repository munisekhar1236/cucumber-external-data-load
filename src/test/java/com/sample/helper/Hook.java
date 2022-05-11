package com.sample.helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
	 @Before("dataFile")
	    public void before() {
	    	System.out.println("Before data file");
	    }
	    
	    @After("dataFile")
	    public void after() {
	    	System.out.println("After data file");
	    }

}
