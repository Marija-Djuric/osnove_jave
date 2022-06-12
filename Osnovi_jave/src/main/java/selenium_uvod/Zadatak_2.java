package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to(" https://demoqa.com/login");
        driver.
                findElement(By.xpath("//*[@id='userName']"))
                .sendKeys("itbootcamp");
        driver.
                findElement(By.xpath("//*[@placeholder='Password']"))
                .sendKeys("ITBootcamp2021!");
        driver.
                findElement(By.xpath("//form[@id='userForm']/div[4]/div/button"))
                .click();

       Thread.sleep(5000);

        driver.
                findElement(By.xpath("//button[text()='Log out')]"))
                .click();

        driver.quit();
}
}