package com.tqatest;

import org.openqa.selenium.WebDriver;

public class test1 {
	static WebDriver driver;
	String URL= "http://toolsqa.com/automation-practice-form/";
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver.get("http://toolsqa.com/automation-practice-form/");

	}

}
