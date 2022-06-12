package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com/");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        List<WebElement> select=s.getOptions();
        Random random = new Random();
        int x = random.nextInt(select.size());
        s.selectByIndex(x);
        Thread.sleep(3000);
        driver.quit();
}
}