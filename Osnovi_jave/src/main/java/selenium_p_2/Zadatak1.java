package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://cms.demo.katalon.com/my-account/");
        driver.findElement(By.id("rememberme")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
