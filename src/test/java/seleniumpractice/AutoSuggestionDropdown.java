package seleniumpractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.testng.annotations.Test;

public class AutoSuggestionDropdown {



    public WebDriver driver;

    @Test
    public void autoDropdown() throws InterruptedException {

        driver= new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath(" //span[text()='From']")).click();
        WebElement form=driver.findElement(By.xpath(" //*[@placeholder='From']"));
        form.click();
        form.sendKeys("Mumbai");
        Thread.sleep(1000);
        form.sendKeys(Keys.ARROW_DOWN);  // It will select first dropdown option
        Thread.sleep(1000);
        form.sendKeys(Keys.ENTER);    // it will press enter after selecting the options





    }
}
