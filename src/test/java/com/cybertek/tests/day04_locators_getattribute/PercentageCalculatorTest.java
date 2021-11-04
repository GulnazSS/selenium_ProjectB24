package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {
    public static void main(String[] args) {
        // set up the driver for the browser type using WebDriver manager
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        String url = "https://www.calculator.net";
        driver.get(url);
        // click on Per-l C-r
        driver.findElement(By.linkText("Percentage Calculator")).click();

        // Verify current title is "P-e
        String expectedTitle = "Percentage Calculator";
        String actualTitle = driver.getTitle();

        System.out.println("Current title = " + driver.getTitle());

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS: Title verification successful");
        }else {
            System.out.println("FAIL: Title verification failed");
        }
       // enter 20%
        driver.findElement(By.name("cpar1")).sendKeys("20");

        // Enter THE 120000
        driver.findElement(By.id("crap2")).sendKeys("120000" + Keys.ENTER);

        // locate the result and assign to variable then print
        String result = driver.findElement(By.className("h2result")).getText();
        System.out.println("result = " + result);

       if(result.endsWith("Result: 240000")){
           System.out.println("PASS: calculation is correct" );
       }else {
           System.out.println("FAIL ");
       }
       driver.quit();
    }
}
