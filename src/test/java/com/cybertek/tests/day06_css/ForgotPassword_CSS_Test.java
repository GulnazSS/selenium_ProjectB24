package com.cybertek.tests.day06_css;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_CSS_Test {
    public static void main(String[] args) {
        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get(appUrl);

        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("student1@gmail.com");
        //Thread.sleep(1234);
         emailField.clear();
         emailField.sendKeys("student2@gmail.com");

    }
}
