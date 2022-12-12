package commun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Set;

public class ClassMere {

    public WebDriver driver;
    @BeforeMethod
    public void monBefore() {
        //System.setProperty("https://www.saucedemo.com/");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();



    }
    @AfterMethod
    public void mnAfter() {
     //   driver.quit();
    }


}


