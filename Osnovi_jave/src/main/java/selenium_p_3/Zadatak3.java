package selenium_p_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
    //Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
    //Probajte upload razlicitih fajlova, npr:
    //fajl velciine 20mb => mozete da ga napravite tako sto zipujete grupu nekih fajlova, slika …
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://www.file.io/";
        driver.navigate().to(url);

        File word = new File ("src/main/resources/right_Ivana_Ivic.jpg");
        driver.findElement(By.xpath("//label[(@for='upload-button')]"))
                .sendKeys(word.getAbsolutePath());

        Thread.sleep(2000);

        driver.quit();
}
}