package Driver;

import Utils.Constants;
import Utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static WebDriver getDriverInstance() {
        if (driver == null) {
            createDriver();
            Log.info("DriverWeb for " + capabilities.getBrowserName() + " has been created.");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) driver.quit();
        driver = null;
    }

    private static DesiredCapabilities getCapabilities() {
        capabilities.setBrowserName(ConfigWebHelper.getBrowserName());
        return capabilities;
    }

    private static WebDriver createDriver() {
        DesiredCapabilities desiredCapabilities = getCapabilities();
        Log.info("Creating a new instance of " + desiredCapabilities.getBrowserName() + " DriverWeb");

        switch (desiredCapabilities.getBrowserName()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", ConfigWebHelper.getDriverPath("chrome"));
                DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("incognito");
                chromeOptions.addArguments("start-maximized");
                chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                chromeCapabilities.setCapability("pageLoadStrategy", "none");

                driver = new ChromeDriver(chromeCapabilities);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", ConfigWebHelper.getDriverPath("firefox"));
                DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                firefoxCapabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
                driver = new FirefoxDriver(firefoxCapabilities);
                driver.manage().window().maximize();
                break;
            default:
                Log.warn("Browser: " + desiredCapabilities.getBrowserName() + ", no es soportado.");
                break;
        }
        driver.manage().timeouts().pageLoadTimeout(Constants.SELENIUM_TIMEOPUT_LOAD_PAGE, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.SELENIUM_IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        return driver;

    }
}
