package com.in28minutes.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class BiscuitTest {
	@Test 
	  public void testEquals() { 
	    Biscuit theBiscuit = new Biscuit(); 
	    Biscuit myBiscuit = new Biscuit(); 
	    assertThat(theBiscuit, equalTo(myBiscuit)); 
	  } 

}