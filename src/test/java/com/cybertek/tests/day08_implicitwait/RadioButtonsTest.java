package com.cybertek.tests.day08_implicitwait;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsTest {
    public static void main(String[] args) {
        String url = "http://practice.cybertekschool.com/radio_buttons";
        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement red = driver.findElement(By.id("red"));
        if(!red.isSelected()){
            red.click();
        }

    }
}
