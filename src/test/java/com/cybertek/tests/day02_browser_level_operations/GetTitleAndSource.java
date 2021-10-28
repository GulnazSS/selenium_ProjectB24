package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        String url = "https://www.etsy.com";
        WebDriver driver = new ChromeDriver();
        driver.get("url");
    }
}
