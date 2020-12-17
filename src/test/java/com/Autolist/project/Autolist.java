package com.Autolist.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autolist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium Projects//Autolist_Project//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.autolist.com/");
		System.out.println("The Title of the website is"+driver.getTitle());
		System.out.println(driver.findElements(By.xpath("//button[contains(@class,'search-by-type')]")).size());
		System.out.println(driver.findElements(By.tagName("a")).size());
		List <WebElement> All_Links = driver.findElements(By.tagName("a"));
		//System.out.println(SearchByTypeOptions);
		List All_Links_Names = new ArrayList();
		for(WebElement e:All_Links)
		{
			All_Links_Names.add(e.getText());
		}
		System.out.println(All_Links_Names);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		driver.close();
	}

}
