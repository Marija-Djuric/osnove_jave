package selenium_d14_06_2022;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Zadatak1 {
    private WebDriver driver;
    private String baseUrl="https://s.bootsnipp.com";

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
        String newUrl = baseUrl + "/iframe/K5yrx/";
        driver.get(newUrl);

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not ok.");

    }
    @Test(priority = 10)
    public void editRow() throws InterruptedException {
        String firstName = "Milos";
        String lastName = "Milosevic";
        String middleName = "Jovan";

        driver
                .findElement(By.xpath("//*[@data-target='#edit']"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[@id='edit']/div[2]")));
        driver
                .findElement(By.id("fn"))
                .clear();
        driver
                .findElement(By.id("fn"))
                .sendKeys(firstName);
        driver
                .findElement(By.id("ln"))
                .clear();
        driver
                .findElement(By.id("ln"))
                .sendKeys(lastName);
        driver
                .findElement(By.id("mn"))
                .clear();
        driver
                .findElement(By.id("mn"))
                .sendKeys(middleName);
        driver
                .findElement(By.id("up"))
                .click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated
                (By.xpath("//*[@id='edit']/div[2]")));

        Assert.assertEquals(driver.findElement(By.id("f1")).getText(),
                "Milos",
                "[ERROR]First name should be Milos.");

        Assert.assertEquals(driver.findElement(By.id("l1")).getText(),
                "Milosevic",
                "[ERROR]Last name should be Milosevic.");

        Assert.assertEquals(driver.findElement(By.id("m1")).getText(),
                "Jovan",
                "[ERROR]Middle name should be Jovan.");
    }
    @Test(priority = 20)
    public void deleteRow() throws InterruptedException {
        String firstName = "Ivan";
        String lastName = "Ivanovic";
        String middleName = "Milan";

        driver
                .findElement(By.xpath("//*[@data-target='#delete']"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[@id='delete']/div[2]")));

        driver
                .findElement(By.id("del"))
                .click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated
                (By.xpath("//*[@id='delete']/div[2]")));

        Assert.assertTrue(elementExist(driver,By.id("d1")),
                "[ERROR] Number of rows is not reduced");
    }
    @Test(priority = 30)
    public void takeAScreenshot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot.png");
        FileHandler.copy(srcFile,destFile);
    }
    @AfterMethod
    public void afterMethod() {
    }
    @AfterClass
    public void afterClass() {
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
  





