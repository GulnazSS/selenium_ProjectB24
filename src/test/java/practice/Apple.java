package practice;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Apple {
    /*
    1. Open Chrome browser
2. Go to https://www.apple.com
3. Click to iPhone
4. Print out the texts of all links
5. Print out how many link is missing text
6. Print out how many link has text
7. Print out how many total link
     */

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "https://www.apple.com";
        driver.manage().window().maximize();

        driver.get(url);
        //  <a class="ac-gn-link ac-gn-link-iphone" href="/iphone/" data-analytics-title="iphone"><span class="ac-gn-link-text">iPhone</span></a>

        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            System.out.println("Text of all links: " + links.get(i).getText());

        }

        int missingText = 0;
        int hasText = 0;
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).getText().isEmpty()) {
                missingText++;
            }else {
                hasText++;
            }

        }


        System.out.println("missing text: " + missingText);
        System.out.println("all text: " + links.size());
        System.out.println("has text: " +  hasText);













    }
}
