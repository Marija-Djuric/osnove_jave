package selenium_4;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class test_NG {
    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BEFORE METHOD");
    }

    @Test
    public void googleTitleTest(){
       System.out.println("TITLE TEST");

        Assert.assertEquals(driver.getTitle(), "Google");
    }
    @Test
    public void googleUrlTest() {
        System.out.println("URL TEST");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("AFTER CLASS");
    }
}
