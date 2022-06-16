package selenium_p_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.time.Duration;

public class Zadatak2 {
    //Napisati program testira upload funkcionalnost: Koristan link https://www.guru99.com/upload-download-file-selenium-webdriver.html
    //Ucitava stranicu https://crop-circle.imageonline.co/#circlecropresult
    //Uploadujte sliku na sajt
    //Kliknite na dugme Crop Circle
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://crop-circle.imageonline.co/#circlecropresult";
        driver.navigate().to(url);

        new Actions(driver)
                .scrollToElement(driver.findElement(By.id("photobutton")))
                .perform();

        File slika = new File("src/main/resources/right_Ivana_Ivic.jpg");
        driver.findElement(By.xpath("//input[(@type='file')]"))
                .sendKeys(slika.getAbsolutePath());

        Thread.sleep(2000);

        driver.quit();
}
}