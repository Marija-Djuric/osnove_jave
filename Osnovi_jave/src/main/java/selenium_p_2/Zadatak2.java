package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.ebay.com/");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByVisibleText("Crafts");

        Thread.sleep(2000);
        driver.quit();
}}