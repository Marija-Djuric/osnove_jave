package selenium_d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class d_1 {
    //Napisati program koji:
    //Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
    //Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
    //POMOC: Brisite elemente odozdo.
    //(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://s.bootsnipp.com/iframe/Dq2X";
        driver.navigate().to(url);

        List<WebElement>close=driver.findElements(By.className("close"));

        for (int i = close.size()-1; i >= 0; i--) {

            if (elementExist(driver,By.xpath("//div[last()]/button[@type='button']"))) {
                driver.findElement(By.xpath("//div[last()]/button[@type='button']")).click();
                System.out.println("Element je obrisan");
            }else {
                System.out.println("Element nije obrisan");
            }
            Thread.sleep(2000);
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