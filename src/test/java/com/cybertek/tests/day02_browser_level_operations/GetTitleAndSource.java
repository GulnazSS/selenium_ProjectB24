package com.cybertek.tests.day02_browser_level_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndSource {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
     //  System.setProperty("webdriver.chrome.driver","/Users" )
        String url = "https://www.etsy.com";
        WebDriver driver = new ChromeDriver();
        driver.get("url");
    }
}
