package selenium_uvod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak_5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url="https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);
        List<WebElement> kolone=
                driver.findElements(By.xpath("//div[@id='lorem']//td[1]"));
        System.out.println("Kolona: ");
        for (int i = 0; i < kolone.size(); i++) {
            System.out.println(kolone.get(i).getText());
            Thread.sleep(1000);
        }
        List<WebElement> redovi=
                driver.findElements(By.xpath("//div[@id='lorem']//tbody/tr[1]"));
        for (int i = 0; i < redovi.size(); i++) {
            System.out.println("Red: "+redovi.get(i).getText());
            Thread.sleep(5000);
        }
        driver.quit();
}
}