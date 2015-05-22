package com.gumjoe.teddyalive.universalTest;
 
import junit.framework.Assert;
import org.junit.Test;
 
public class UniversalTest {
 
	@Test
	public void test() {
 
		Assert.assertEquals(App.main, "Welcome");
 
	}
 
}
