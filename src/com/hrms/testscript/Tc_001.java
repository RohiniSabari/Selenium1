package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tc_001 {
//public static void main(String args[]) {
	
	@Test
	public void test()throws Exception{
		DOMConfigurator.configure("log4j.xml");
	General gc=new General();
	gc.openapp();
	
	gc.login();

	

	gc.logout();
	gc.closeapp();
}
}
