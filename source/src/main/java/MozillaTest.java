import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Лешка on 01.12.2016.
 */
public class MozillaTest {
    public static void main(String[] args) {
        String property=System.getProperty("user.dir") + "/driver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", property);
        WebDriver firefoxdriver = new FirefoxDriver();
        firefoxdriver.get("http://www.bing.com/");
        firefoxdriver.quit();
    }
}
