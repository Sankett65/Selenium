package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementdemo {

    WebDriver driver;
    @Test
    public void webele() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       WebElement email= driver.findElement(By.name("email"));
       email.sendKeys("8451098400");

       email.clear();

        System.out.println(email.getTagName());  //input

       WebElement pass= driver.findElement(By.name("pass"));

       pass.sendKeys("Happy12345");

        System.out.println(pass.isDisplayed());//true

        System.out.println(pass.isEnabled());//true

        String password=pass.getText();
        System.out.println(password);
        
    }
}
