package practice;

import com.cybertek.tests.day05_xpath_css_isdisplayed.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MerriamWebster {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "https://www.merriam-webster.com/";
        driver.get(url);

        


        List<WebElement> links = driver.findElements(By.tagName("script"));
        System.out.println(links.size());
        int emptyLinks = 0;
        int hasText = 0;
        for(WebElement eachLink: links){
            if(eachLink.getAttribute("src").isEmpty()){
                emptyLinks++;
            }else
                hasText++;
        }
        System.out.println("empty :" +  emptyLinks);
        System.out.println("has text :" + hasText);



    }

}
