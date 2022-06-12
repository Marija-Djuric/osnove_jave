package selenium_d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class d_2 {
    //Napisati program koji ucitava stranicu https://geodata.solutions/
    //Bira proizvoljan Country, State i City
    //Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
    //I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
    //Izabrerit Country, State i City tako da imate podatke da selektujete!
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url="https://geodata.solutions/";
        driver.navigate().to(url);

        Select one=new Select(driver.findElement(By.name("country")));
        List<WebElement>countries=one.getOptions();
        if (elementExist(driver,By.xpath("//select[(@name='country')]/option"))) {
        Random random=new Random();
        int x= random.nextInt(countries.size());
        one.selectByIndex(x);
            Thread.sleep(1000);
        }
        Select two=new Select(driver.findElement(By.name("state")));
        List<WebElement>states=two.getOptions();
        if (elementExist(driver,By.xpath("//select[(@name='state')]/option"))) {
        Random random1=new Random();
        int y= random1.nextInt(states.size());
        two.selectByIndex(y);
            Thread.sleep(1000);
        }
        Select three=new Select(driver.findElement(By.name("city")));
        List<WebElement>cities=three.getOptions();
        if (elementExist(driver,By.xpath("//select[(@name='city')]/option"))) {
        Random random2=new Random();
        int z= random2.nextInt(cities.size());
        three.selectByIndex(z);
            Thread.sleep(1000);
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