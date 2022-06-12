package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url="file:///C:/Users/Startit_5/Downloads/Zadatak6.html";
        driver.navigate().to(url);

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("showInBtn")).click();
            driver.findElement(By.id("id-"+i));
        }
        driver.quit();
}
}
