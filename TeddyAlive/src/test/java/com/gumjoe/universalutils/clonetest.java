package com.gumjoe.universalutils;
 
import junit.framework.Assert;
import org.junit.Test;
import java.io.*;
 
public class clonetest {
 
	@Test
	public static testPrintclone() {
                File bin = new File( "./bin" );
		assertEquals("Cloning into ./bin", universalutils.clone("https://github.com/Gum-Joe/TeddyAlive.git", "master" , bin));
 
	}
 
}
