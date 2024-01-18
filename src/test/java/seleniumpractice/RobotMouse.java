package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class RobotMouse {

    public WebDriver driver;
    @Test
    public void mouse() throws AWTException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Robot r = new Robot();
        r.mouseMove(500, 500);

    }
}
