package com.example.day1.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		System.out.println("Switched to child frame");
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement btn= driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a"));
		btn.click();
		
	}

}
