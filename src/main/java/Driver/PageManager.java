package Driver;

import Utils.Log;
import org.openqa.selenium.WebDriver;

public class PageManager {

    public static void getPage(String url) {
        Log.info("Getting the page " + url);
        WebDriver driver = DriverManager.getDriverInstance();
        driver.get(url);

    }
}
