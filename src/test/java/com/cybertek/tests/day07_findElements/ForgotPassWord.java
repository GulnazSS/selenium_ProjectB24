package com.cybertek.tests.day07_findElements;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForgotPassWord {
    public static void main(String[] args) {
        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);
     // find  all links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("count of links = " + links.size());
        //print count of link:
        System.out.println("count of links = " + links.size());

        //print text of first one
        System.out.println("first link = " + links.get(0).getText());

        //print text of second one
        System.out.println("second link = " + links.get(1).getText());

    }
}
