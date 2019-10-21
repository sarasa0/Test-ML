import Suites.TestSuite1;
import Suites.TestSuite2;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {

    public static void main(String[] args) {
        // Web
        //assignProperty("browserName", "firefox")
        assignProperty("browserName", "chrome");
        assignProperty("appDefaultWait", "60");
        assignProperty("testFilesPath", "\\testFiles");
        assignProperty("firefoxDriverName", "geckodriver.exe");
        assignProperty("chromeDriverName", "chromedriver.exe");
        assignProperty("driverFolderBase", "SeleniumDrivers");

        JUnitCore core = new JUnitCore();
        core.addListener(new TextListener(System.out));
        core.run(TestSuite1.class, TestSuite2.class);
    }


    private static void assignProperty(String key, String defaultValue) {
        if (System.getProperty(key) == null) {
            System.setProperty(key, defaultValue);
        }
    }

}