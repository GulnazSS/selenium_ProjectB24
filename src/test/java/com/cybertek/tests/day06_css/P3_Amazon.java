package com.cybertek.tests.day06_css;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P3_Amazon {


    public static void main(String[] args) {
        String appUrl= "https://www.amazon.com";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

    driver.get(appUrl );
// TYPE WOODEN SPOON
        WebElement searchField = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchButton = driver.findElement(By.cssSelector("input[value='Go']"));

        searchField.sendKeys("wooden spoon");
        searchButton.click();


        //CLEAR THE SEARCH INPUT BOX THEN SEARCH FIR "iphone 13 case"
        searchField = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        searchField = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
        searchField.clear();
        searchField.sendKeys("iphone");
       searchButton.click();



    }
}
