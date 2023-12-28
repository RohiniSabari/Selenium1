package com.hrms.testscript;
	import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

	import com.hrms.lib.General;
	public class Tc_003 {

	
		
			//public static void main(String args[])throws Exception {
		@Test
		public void test1() {
			DOMConfigurator.configure("log4j.xml");
				General gc=new General();
				gc.openapp();
				
				gc.login();
				gc.enterframe();
				
				
				gc.delete();
				gc.exitframe();
				gc.logout();
				gc.closeapp();
			}
			}



