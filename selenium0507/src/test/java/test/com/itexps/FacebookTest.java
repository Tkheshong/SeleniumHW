/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author tkhes
 */
public class FacebookTest {

    private WebDriver driver;
    private String baseUrl;

    public FacebookTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod

    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.setProperty("webdriver.edge.driver", "C:\\Data\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        System.setProperty("webdriver.gecko.driver", "C:\\Data\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testFacebook() throws Exception {

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("email")).sendKeys("abc");
        Thread.sleep(3000);
        driver.findElement(By.id("pass")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pass")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("pass")).sendKeys("abc123");
        Thread.sleep(3000);
        driver.close();
    }

}
