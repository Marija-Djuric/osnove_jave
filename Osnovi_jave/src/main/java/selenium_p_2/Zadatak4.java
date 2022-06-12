package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url="https://demoqa.com/login";
        driver.navigate().to(url);
        String user = "itbootcamp";
        String lozinka = "ITBootcamp2021!";

        driver.findElement(By.id("userName")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys((lozinka));
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
        if (elementExist(driver, By.xpath("//button[text()='Log out')]"))) {
            driver.
                    findElement(By.xpath("//button[text()='Log out')]"))
                    .click();
        } else {
            System.out.println("Neuspesan login.");
    }
        driver.quit();
}
    public static boolean elementExist(WebDriver driver, By by) {
        try  {
            driver.findElement(by);
        } catch (Exception e) {
            return false;
        }  return true;
    }
}