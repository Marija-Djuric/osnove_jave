package selenium_p_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url="https://demoqa.com/modal-dialogs";
        driver.navigate().to(url);
        driver.findElement(By.id("showLargeModal")).click();

        if (elementExist(driver, By.className("modal-body"))) {
            System.out.println("Poruka je prikazana");
        } else {
            System.out.println("Poruka nije prikazana");
        }
        Thread.sleep(2000);
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