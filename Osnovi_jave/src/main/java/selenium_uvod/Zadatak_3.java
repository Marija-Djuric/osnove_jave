package selenium_uvod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ArrayList<String>nizStranica=new ArrayList<>();
        nizStranica.add("https://google.com/");
        nizStranica.add("https://youtube.com/");
        nizStranica.add("https://www.ebay.com/");
        nizStranica.add("https://www.kupujemprodajem.com/");

        for (int i = 0; i < nizStranica.size(); i++) {
            driver.get(nizStranica.get(i));
            System.out.println(driver.getTitle());
        }
        driver.quit();
}
}