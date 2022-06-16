package selenium_d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zadatak1 {
    //Napisati program koji ima:
    //Podesava:
    //implicitno cekanje za trazenje elemenata od 10s
    //implicitno cekanje za ucitavanje stranice od 10s
    //eksplicitno cekanje podeseno na 10s
    //Podaci:
    //Potrebno je u projektu ukljuciti 4 slike.
    //Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
    //Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
    //Koraci:
    //Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
    //Maksimizuje prozor
    //Selektuje Image - Front klikom na tu karticu u dnu ekrana
    //Klik na add photo iz levog navigacionog menia
    //Upload slike. Upload preko File objekta koristeci getAbsolutePath
    //Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
    //Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
    //Ceka da dijalog bude vidljiv
    //Klik na Use One Side Only dugme
    //Ponoviti proces za Left, Right i Back
    //Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
    //Kliknuti na Add To Cart dugme
    //Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
    //Xpath: //*[@action='error']
    //Zatvorite pretrazivac
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.navigate().to(url);

        String slika1 = "src/main/resources/front_MIlos_Milosevic.jpg";
        String slika2 = "src/main/resources/back_Milica_Milic.jpg";
        String slika3 = "src/main/resources/left_Jovan_Jovanovic.jpg";
        String slika4 = "src/main/resources/right_Ivana_Ivic.jpg";

        ArrayList<String> niz = new ArrayList();
        niz.add(slika1);
        niz.add(slika2);
        niz.add(slika3);
        niz.add(slika4);

        for (int i = 0; i < niz.size(); i++) {

            File file = new File((niz.get(i)));

            driver.
                    findElement(By.xpath("//*[@alt='image "+ (i+1) +"']"))
                    .click();

            driver.
                    findElement(By.xpath("//*[contains(text(),'+ Add photo')]"))
                    .click();

            driver
                .findElement(By.id("imageUpload"))
                .sendKeys(file.getAbsolutePath());

        wait.until(ExpectedConditions
                .numberOfElementsToBe(By.className("haLJiC"),(i+1)));

        driver
                .findElement(By.xpath("//*[contains(@class,'kAzmBp')]/div[last()]/div/img"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dxCajp")));

        driver
                .findElement(By.xpath("//*[contains(text(),'Use One Side Only')]"))
                .click();
}
        List<WebElement>confetti=driver.findElements(By.className("fajlzv"));
        Random random = new Random();
        int x = random.nextInt(5);
        confetti.get(x).click();

        driver.findElement(By.className("jtbzvh")).click();
            if(elementExist(driver,By.xpath("//*[@action='error']"))) {
                System.out.println("Message exist");
            } else {
                System.out.println("Message does not exist");
            }
        driver.quit();
}
        public static boolean elementExist(WebDriver driver, By by) {
           try  {
               driver.findElement(by);
           } catch (Exception e) {
              return false;
          }   return true;
    }
}