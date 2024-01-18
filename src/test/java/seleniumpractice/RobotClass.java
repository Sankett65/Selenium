package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {

     public WebDriver driver;

     @Test
    public void robotClass() throws AWTException, InterruptedException {

         driver = new ChromeDriver();
         driver.get("https://www.facebook.com");
         driver.manage().window().maximize();
         Thread.sleep(2000);

         Robot r = new Robot();

         r.keyPress(KeyEvent.VK_S);
         r.keyRelease(KeyEvent.VK_S);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_A);
         r.keyRelease(KeyEvent.VK_A);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_N);
         r.keyRelease(KeyEvent.VK_N);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_K);
         r.keyRelease(KeyEvent.VK_K);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_E);
         r.keyRelease(KeyEvent.VK_E);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_T);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_SPACE);
         r.keyRelease(KeyEvent.VK_SPACE);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_J);
         r.keyRelease(KeyEvent.VK_J);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_A);
         r.keyRelease(KeyEvent.VK_A);
         Thread.sleep(500);


         r.keyPress(KeyEvent.VK_D);
         r.keyRelease(KeyEvent.VK_D);
         Thread.sleep(500);


         r.keyPress(KeyEvent.VK_H);
         r.keyRelease(KeyEvent.VK_H);
         Thread.sleep(500);


         r.keyPress(KeyEvent.VK_A);
         r.keyRelease(KeyEvent.VK_A);
         Thread.sleep(500);


         r.keyPress(KeyEvent.VK_V);
         r.keyRelease(KeyEvent.VK_V);
         Thread.sleep(500);

         r.keyPress(KeyEvent.VK_SHIFT);
         r.keyPress(KeyEvent.VK_4);

         r.keyRelease(KeyEvent.VK_SHIFT);
          r.keyRelease(KeyEvent.VK_4);

//          r.keyPress(KeyEvent.VK_COPY);


         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_A);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_A);

         Thread.sleep(1000);

         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_C);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_C);

         Thread.sleep(1000);

         r.keyPress(KeyEvent.VK_TAB);
         r.keyRelease(KeyEvent.VK_TAB);
         Thread.sleep(1000);

         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_V);

         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_V);

         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@class='_9lsb _9ls8']")).click();

         Thread.sleep(2000);
         driver.close();


     }
}
