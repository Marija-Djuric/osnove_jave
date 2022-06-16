package selenium_p_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Zadatak1 {
    //Napisati program koji:
    //Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
    //Implicitno cekanje za trazenje elemenata je maksimalno 10s
    //Implicitno cekanje za ucitavanje stranice je 5s
    //Ucitava stranicu https://docs.katalon.com/
    //Maksimizuje prozor
    //Od html elementa cita data-theme atribut.
    //Korisni linkovi za citanje vrednosti atributa link1 i link2
    //Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
    //Klikce na dugme za zamenu tema
    //Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
    //Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati precice preko Actions objekta
    //Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
    //Zatvara pretrazivac
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        String url = "https://docs.katalon.com/";
        driver.navigate().to(url);


        String theme=driver.findElement((By.xpath("html")))
                           .getAttribute("data-theme");

        if (theme.equals("light")) {
            System.out.println("Theme is light");
        } else {
            System.out.println("Theme is dark");
        }

        driver.findElement(By.className("toggleButton_rCf9")).click();
        theme=driver.findElement((By.xpath("html")))
                .getAttribute("data-theme");

        if(theme.equals("dark")) {
            System.out.println("Theme is dark");
        } else {
            System.out.println("Theme is light");
        }

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        String search = driver.findElement((By.xpath("//input[(@id='autocomplete-0-input')]")))
                .getAttribute("type");

        if (search.equals("search")) {
            System.out.println("Vrednost je search");
        } else {
            System.out.println("Vrednost nije search");

        driver.quit();
}}}

