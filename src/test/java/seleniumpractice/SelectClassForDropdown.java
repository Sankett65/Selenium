package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClassForDropdown {

    public WebDriver driver;

    @Test
    public void select() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        WebElement day = driver.findElement(By.id("day"));

        Select select = new Select(day);

        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByValue("1");

        select.selectByVisibleText("3");








    }

}
