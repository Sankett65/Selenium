package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class ScreenShot {

    public WebDriver driver;
    @Test
    public void sc() throws IOException {

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");

        driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("jadhav.jadhav.sanket@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File SFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DFile = new File("D:\\Selenium\\ScreenShots\\"+sdf.format(d)+".png");
        FileHandler.copy(SFile,DFile);

    }

}
