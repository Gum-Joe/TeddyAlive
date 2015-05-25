package com.gumjoe.universalutils;
 
import junit.framework.Assert;
import org.junit.Test;
import java.io.*;
 
public class clonetest {
 
	@Test
	public void testPrintclone() {
                File bin = new File( "./bin" );
		Assert.assertEquals(universalutils.clone("https://github.com/Gum-Joe/TeddyAlive.git", "master" , bin), "Cloning into ./bin");
 
	}
 
}
