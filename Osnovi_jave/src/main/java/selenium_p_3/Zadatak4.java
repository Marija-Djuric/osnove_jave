package selenium_p_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak4 {
    //Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV i ceka da se
    // ucita progress bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String url = "https://s.bootsnipp.com/iframe/klDWV";
        driver.navigate().to(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.className("percentage"),"100%"));
            System.out.println("Ucitana je");

        Thread.sleep(2000);

        driver.quit();
}
}