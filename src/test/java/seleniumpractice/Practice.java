package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Practice {



    public WebDriver driver;

    @Test
    public void demo() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<String> list= new ArrayList<>();
        list.add("jadhav.jadhav.sanket@gmail.com");
        list.add("sanket@gmail.com");
        list.add("sanket.jadhav@gmail.com");
        list.add("swapnil@gmail.com");

        for (int i =0;i<list.size();i++) {

            WebElement email=driver.findElement(By.name("email"));
            email.sendKeys(list.get(i));
            Thread.sleep(2000);
            email.clear();

        }
    }

}
