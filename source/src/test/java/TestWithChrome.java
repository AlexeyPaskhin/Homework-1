import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Лешка on 30.11.2016.
 */
public class TestWithChrome {
    public static void main(String[] args) {
    String property = System.getProperty("user.dir") +"/driver/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver1= new ChromeDriver();
        WebDriver.Options options = driver1.manage();
        options.window().maximize();
        driver1.get("https://www.bing.com/");
        WebElement field = driver1.findElement(By.className("b_searchbox"));
        field.sendKeys("automation");
        WebElement go = driver1.findElement(By.name("go"));
        go.click();

        String a = driver1.getTitle();
        System.out.println("Название страницы: "+a);
        List<WebElement> list = driver1.findElements(By.className("b_title"));
        int count = 1;
        System.out.println("Заголовки отображаемых результатов поиска:");
        for (WebElement el:list) {
            WebElement h2 = el.findElement(By.tagName("h2"));
            String title = h2.getText();
            System.out.println(count + ". " + title);
            count ++;
        }
        WebElement news = driver1.findElement(By.name("ans_news"));
        WebElement nTiltle = news.findElement(By.tagName("h2"));
        System.out.println("Заголовок встроенного новостного блока: " + nTiltle.getText());
        driver1.close();
//        public WebDriver getDriver(){
//            String driverPath = System.getProperty("driver.executable");
//            if (driverPath==null)
//                throw new SkipException("Path to ChromeDriver is not specified");
//
//            System.setProperty("webdriver.chrome.driver", driverPath);
//            return new ChromeDriver();
//        }


    }
}
