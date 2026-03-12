package utils;

import java.io.File;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String name) {

        try {

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File("C:\\JAVA\\Kannan.png");

            FileUtils.copyFile(src, dest);

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}