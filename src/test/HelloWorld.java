package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		
		
		 WebDriver driver = new FirefoxDriver();
	        String baseUrl = "http://newtours.demoaut.com";
	        String expectedTitle = "Welcome: Mercury Tours";
	        //driver.get(baseUrl);
	        driver.navigate().to(baseUrl);
	        driver.navigate().back();
	        driver.wait(10);
	      
	        driver.navigate().refresh();
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.close();
	        
	        
		
	}

}
