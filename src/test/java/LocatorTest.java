import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTest {

    private WebDriver webDriver;

    @Before
    public void init() {
        WebDriverManager.chromedriver()
                .setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void locatorTest() {
        webDriver.navigate().to("https://github.com/");
        WebElement webElement = webDriver.findElement(By.name("user_email"));
        webElement.sendKeys("test");
//        List<WebElement> list = webDriver.findElements(By.id("user_email"));
//        list.get(0).sendKeys("test");
//        System.out.println(list.size());
//        webDriver.findElement(By.className(".btn-mktg.btn-primary-mktg.width-full.width-sm-auto")).click();
//        webDriver.findElement(By.xpath("//button[contains(@class, \"btn-mktg\")]")).click();
        webDriver.findElement(By.cssSelector("form .btn-mktg")).click();
    }

}
