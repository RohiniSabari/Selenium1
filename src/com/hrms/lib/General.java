package com.hrms.lib;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	
	public void openapp() {
		driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Open app");
	Reporter.log("open app");
	Log.info("open app");
}
public void closeapp() {
	driver.close();
	System.out.println("close app");
	Reporter.log("close app");
	Log.info("close app");
}
public void login() {
	driver.findElement(By.name(txtuser)).sendKeys(user);
	driver.findElement(By.name(txtpwd)).sendKeys(pwd);
	driver.findElement(By.name(loginbtn)).click();
	System.out.println("login completed");
	Reporter.log("login completed");
	Log.info("login");
}
public void logout() {
	driver.findElement(By.linkText(logoutbtn)).click();
	Reporter.log("logout completed");
	Log.info("Logout");
	
}
public void editemp() {
driver.findElement(By.linkText("Ali Syed")).click();


driver.findElement(By.name("EditMain")).click();
	driver.findElement(By.name("txtEmpFirstName")).clear();
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Praveen");
	driver.findElement(By.name("txtEmpLastName")).clear();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Kailash");
	driver.findElement(By.name("EditMain")).click();
	System.out.println("New Emp edited and saved");
	Reporter.log("new emp edited and saved");
	Log.info("edited and saved");
}

public void delete() {
Select st=new Select(driver.findElement(By.name(searchby)));
st.selectByVisibleText("Emp. ID");

driver.findElement(By.name("loc_name")).sendKeys("0760");
driver.findElement(By.xpath("//input[@value='Search']")).click();
driver.findElement(By.name("chkLocID[]")).click();

driver.findElement(By.xpath("//input[@value='Delete']")).click();
Reporter.log("emp deleted");
Log.info("deleted");
}


public void enterframe() {
	driver.switchTo().frame(frame);
	System.out.println("Frame entered");
	Log.info("frame entered");
	
	}
public void addemployee() {
	driver.findElement(By.xpath(addemp)).click();
		driver.findElement(By.name(empfn1)).sendKeys(empfn);
	driver.findElement(By.name(empfn2)).sendKeys(empln);
	driver.findElement(By.name("photofile")).sendKeys("C:\\Users\\email\\Downloads\\Download-Desert-Picture-Free-620x465.jpg");
	driver.findElement(By.id(savebtn)).click();
	System.out.println("Emp added");
	Reporter.log("emp added");
	Log.info("emp added");
}
public void exitframe() {
	driver.switchTo().defaultContent();
	System.out.println("Frame exit");
	Log.info("Frame exit");
}

}
