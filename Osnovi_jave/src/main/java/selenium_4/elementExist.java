package selenium_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class elementExist {
    public static boolean elementExist(WebDriver driver, By by) {
        try {
            driver.findElement(by);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
