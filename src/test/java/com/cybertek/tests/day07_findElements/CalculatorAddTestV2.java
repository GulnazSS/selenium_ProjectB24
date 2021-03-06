package com.cybertek.tests.day07_findElements;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTestV2 {

        public static void main(String[] args) throws InterruptedException {
            String appUrl = "https://www.calculator.net";
            int num1 = 8, num2 = 9;
            int expectedResult = num1 + num2;

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get(appUrl);
            System.out.println("//span[.='"+ num1 +"']"); // span[.='7']
            System.out.println("//span[.='"+ num2 +"']");
            WebElement num1Elem = driver.findElement(By.xpath("//span[.=' " + num1 +"']"));
            WebElement num2Elem = driver.findElement(By.xpath("//span[.='"+ num2 +"']"));
            WebElement plus = driver.findElement(By.xpath("//span[.='+']"));
            WebElement equals = driver.findElement(By.xpath("//span[.='=']"));

            num1Elem.click();
            plus.click();
            num2Elem.click();
            equals.click();
            WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
            System.out.println("Result = " + result.getText());

        }
    }

