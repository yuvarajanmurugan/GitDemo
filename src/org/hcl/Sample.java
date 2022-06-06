package org.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvarajan\\eclipse-workspace\\Pyramid\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://pyramidcore.pyramidci.com/");
	
}
}
