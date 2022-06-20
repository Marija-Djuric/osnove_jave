package selenium_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.lang.reflect.Method;

public class Zadatak1 {
    //Kreirati klasu KatalonLoginTests za testove
    //Base url: https://cms.demo.katalon.com
    //Test #1: Visit login page from Nav bar
    //Koraci:
    //Ucitati home stranicu
    //Kliknuti na My account link
    //Verifikovati da je naslov stranice My account – Katalon Shop
    //Verifikovati da se u url-u stranice javlja /my-account
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske
    //Test #2: Check input types
    //Koraci:
    //Ucitati /my-account stranicu
    //Verifikovati da  polje za unos email-a za atribu type ima vrednost text
    //Verifikovati da polje za unos lozinke za atribut type ima vrednost password
    //Verifikovati da checkbox Remember me za atribut type ima vrednost checkbox
    //Verifikovati da je Remember me checkbox decekiran. Koristan link kako naci informaciu
    // da li je checkbox cekiran ili ne.
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske
    //(ZA VEZBANJE)
    //Test #3: Display error when credentials are wrong
    //Podaci:
    //email: invalidemail@gmail.com
    //password: invalid123
    //Koraci:
    //Ucitati /my-account stranicu
    //Unesite email
    //Unesite password
    //Kliknite na login dugme
    //Verifikovati da postoji element koji prikazuje gresku
    //Verifikovati da je prikazana greska ERROR: Invalid email address
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske
    //Verifikovati da smo idalje na login stranici posle greske, tako sto proveravamo da se
    // url-u javlja /my-account

        private WebDriver driver;
        private String baseUrl="https://cms.demo.katalon.com";

        @BeforeClass
        public void beforeClass() {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        @BeforeMethod
        public void beforeMethod() {
            driver.get(baseUrl);
        }
        @Test(priority = 10)
        public void visitLoginPageFromNavBar() throws InterruptedException {
 //           driver
            //           .findElement(By.xpath("//*[contains(text(),'My account')]"))
   //                    .click();
            driver
                    .findElement(By.linkText("MY ACCOUNT"))
                    .click();
            Assert.assertEquals(driver.getTitle(),"My account – Katalon Shop",
                    "[ERROR]Page title does not contain 'My account - Katalon Shop'.");
            Assert.assertTrue(driver.getCurrentUrl().contains("/my-account"),
                    "[ERROR] URL does not contain '/my-account'");
        }
        @Test(priority = 20)
        public void checkInputTypes() throws InterruptedException {
            driver.get(baseUrl+"/my-account/");
            Assert.assertEquals(
                    driver.findElement(By.id("username"))
                    .getAttribute("type"),
                    "text",
                    "[ERROR] Email input does not have valid type.");
            Assert.assertEquals(
                    driver.findElement(By.id("password"))
                    .getAttribute("type"),
                    "password",
                    "[ERROR] Password input does not have valid type.");
            Assert.assertEquals(
                    driver.findElement(By.id("rememberme"))
                    .getAttribute("type"),
                    "checkbox",
                    "[ERROR] Remember me chackbox does not have valid type.");
            Assert.assertFalse(
                    driver.findElement(By.id("rememberme")).isSelected(),
                    "Remember me should be unchacked.");
        }
        @Test(priority = 30)
        public void displayErrorWhenCredentialsAreWrong() throws InterruptedException {
            driver.get(baseUrl+"/my-account/");
            driver
                    .findElement(By.id("username"))
                    .sendKeys("invalidemail@gmail.com1");
            driver
                    .findElement(By.id("password"))
                    .sendKeys("invalid123");
            driver
                    .findElement(By.xpath("//*[@name='login']"))
                    .click();
            Assert.assertTrue(
                    elementExist(driver,By.className("woocommerce-error")),
                    "[ERROR] Element for error does not exist.");
            Assert.assertEquals(
                    driver.findElement(By.className("woocommerce-error")).getText(),
                    "ERROR: Invalid email address. Lost your password?",
                    "[ERROR] displayed message is not ok");
            Assert.assertTrue(
                    driver.getCurrentUrl().contains("/my-account"),
                    "[ERROR] you are not on the page My account");
        }
        @AfterMethod
        public void afterMethod() {
        }
        @AfterClass
        public void afterClass() {
            driver.quit();
        }
    public static boolean elementExist(WebDriver driver, By by) {
        try {
            driver.findElement(by);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
