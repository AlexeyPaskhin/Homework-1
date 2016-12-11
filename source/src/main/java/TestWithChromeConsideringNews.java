import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
/**
 * Created by Лешка on 02.12.2016.
 */
public class TestWithChromeConsideringNews {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver1 = new ChromeDriver();
        WebDriver.Options options = driver1.manage();
        options.window().maximize();
        driver1.get("https://www.bing.com/");
        WebElement field = driver1.findElement(By.className("b_searchbox"));
        field.sendKeys("automation");
        WebElement go = driver1.findElement(By.name("go"));
        go.click();

        String a = driver1.getTitle();
        System.out.println("Название страницы: " + a);
        WebElement areaOfTitles = driver1.findElement(By.id("b_results"));
        List<WebElement> list = areaOfTitles.findElements(By.tagName("li"));
        int count = 1;
        System.out.println("Заголовки отображаемых результатов поиска:");
        for (WebElement el : list) {
            WebElement h2 = el.findElement(By.tagName("h2"));
            String title = h2.getText();
            System.out.println(count + ". " + title);
            count++;
        }
        driver1.close();
    }
}
