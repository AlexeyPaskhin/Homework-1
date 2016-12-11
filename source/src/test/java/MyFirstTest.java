import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Лешка on 30.11.2016.
 */
public class MyFirstTest {
    public static void main(String[] args) {
//        System.getProperty("driver.chrome");
//        String property = System.getProperty("driver.path");
//        System.setProperty("webdriver.chrome.driver", property);


        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("https://www.bing.com/");
//        By by = By.className("b_searchbox");
//        WebElement element = firefoxdriver.findElement(by);
//
        firefoxdriver.close();

//        WebDriver driver1= new ChromeDriver();
    }
//    protected void iniDriver{
//        Path driverExecutablePath = Paths.get(System.getProperty("driver.path"), "geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver", driverExecutablePath.toString());
//        driver = new FirefoxDriver();
//    }
}
