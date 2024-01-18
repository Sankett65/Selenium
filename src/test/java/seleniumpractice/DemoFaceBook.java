package seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoFaceBook {


    public WebDriver driver;


    @Test
    public void sc() throws IOException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");

        TakesScreenshot takesScreenshot= (TakesScreenshot)driver;
        File SFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DFile = new File("D:\\Selenium\\ScreenShots\\"+sdf.format(d)+".png");
        FileHandler.copy(SFile,DFile);
    }


    @Test
    public void facebook() throws InterruptedException, IOException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("8451098400");
        driver.findElement(By.name("pass")).sendKeys("Happy12345");
        driver.findElement(By.name("login")).click();
        sc();
//            driver.close();
        // To create a Account

       driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(3000);

       driver.findElement(By.name("firstname")).sendKeys("Happy");
       sc();
       Thread.sleep(1000);
       driver.findElement(By.name("lastname")).sendKeys("Jadhav");
       sc();
       Thread.sleep(1000);
       driver.findElement(By.name("reg_email__")).sendKeys("8451098400");
       sc();
       Thread.sleep(1000);
       driver.findElement(By.id("password_step_input")).sendKeys("Happy12345");
       sc();
       Thread.sleep(1000);
       driver.findElement(By.name("birthday_day")).sendKeys("3");
       sc();
       Thread.sleep(1000);
       driver.findElement(By.name("birthday_month")).sendKeys("Sep");
       sc();
       Thread.sleep(1000);

       WebElement element=driver.findElement(By.id("year"));
       element.sendKeys("2001");
       Thread.sleep(1000);

       WebElement element1=driver.findElement(By.xpath("//label[text()='Male']"));
       element1.click();
       sc();

       Thread.sleep(1000);
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(9000);
       driver.findElement(By.linkText("No, Create New Account")).click();
       Thread.sleep(5000);

        driver.stop();

    }

}
