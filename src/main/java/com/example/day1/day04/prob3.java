package com.example.day1.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prob3 {
	public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
    WebElement dragg =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    WebElement dropp =driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(dragg, dropp).build().perform();
        Thread.sleep(5000);
        //switching to parent
        driver.switchTo().defaultContent();
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a"));
        		btn.click();
//        driver.quit();
        
        
    }

}
