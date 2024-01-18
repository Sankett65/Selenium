package seleniumpractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Autoit {



    public WebDriver driver;
    @Test
    public void file() throws IOException, InterruptedException {

        driver= new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();

        WebElement elemen=driver.findElement(By.xpath("//span[text()='Choose Files']"));


        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();

        Thread.sleep(3000);

        Runtime.getRuntime().exec("D:\\Autoit\\AutoIt.exe");
        Thread.sleep(10000);

      //  driver.findElement(By.xpath("//*[starts-with(@class,'sc-1jl3o92-0 ')]")).click();

        driver.findElement(By.xpath("//div[text()='.docx' or text()='(.docx)']")).click();
        driver.findElement(By.xpath("//span[text()='Choose option' or text()='Convert']")).click();


       // driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button[2]")).click();


        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
       // driver.findElement(By.xpath("//*[@class='r5zwp6-2 gMrRSQ']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[text()='Download']")).click();


    }



}
