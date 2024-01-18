package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssLocators {

    WebDriver driver;

    @Test
    public void cssLocator() throws InterruptedException {
        driver= new ChromeDriver();

        driver.get("https://www.facebook.com");


        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Sanket");

        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456789");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);

     //   driver.findElement(By.cssSelector("a[href='/about/privacy/update']")).click();

        // Combining attribute id and herf
     //   driver.findElement(By.cssSelector("a#privacy-link[href='/about/privacy/update']")).click();


        driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("Sankettttttt");            // Start with (^)

     //   driver.findElement(By.cssSelector("input[name$='email__']")).sendKeys("Sanket@gmail.com");     //Ends with ($)


        driver.findElement(By.cssSelector("input[class*='58mg _5dba _']")).clear();                              //Middle with (*)
        driver.findElement(By.cssSelector("input[class*='58mg _5dba _']")).sendKeys("Happy");         //Middle with (*)


        driver.findElement(By.cssSelector("input[id^='u_2_g_']")).sendKeys("sanket@gmail.com");









    }

}
