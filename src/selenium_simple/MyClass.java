package selenium_simple;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

import org.openqa.selenium.*;



public class MyClass {
	
	static Scanner wczytywanieZklawiatury = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		//String baseUrl = wczytajZklawiatury();
		String baseUrl = "http://newtours.demoaut.com";
		
		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
		final FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("xpinstall.signatures.required", false);
		
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		
		
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
		driver.get(baseUrl);
		
		
		
        
		actualTitle = driver.getTitle();
		
		
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Firefox
        //driver.close();
        driver.quit();
        // exit the program explicitly
        System.exit(0);
	      
	}
	
	public static String wczytajZklawiatury() {
		return wczytywanieZklawiatury.nextLine().trim();
	}

}
