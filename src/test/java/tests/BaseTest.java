package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {

        //driver.quit();
    }
}