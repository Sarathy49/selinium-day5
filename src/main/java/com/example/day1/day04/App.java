package com.example.day1.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
//    intializing the webdriver
      WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
     
      //Launching the url
      driver.get(url);
      //maximize the window screen
      driver.manage().window().maximize();
      //Navigating down
      JavascriptExecutor js =  (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,800)", args);
      //find the first name
      driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("manopalaniraja");
      //find the last name
      driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("A");
       //find the email and send email
      driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("manopalaniraja2154@gmail.com");
      //finding the password
      driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("mano@2102");
 
      //Subcribe
      driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
     
      Thread.sleep(5000);
      //terms and conditons
      driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
      //Button
      driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
      Thread.sleep(5000);
     
     
    }
}