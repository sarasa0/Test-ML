import Steps.Suites.TestSuite1;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

//TODO CREAR UN EJECUTOR DE TESTS PARA EL FAT JAR
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
        core.run(TestSuite1.class);
    }


    private static void assignProperty(String key, String defaultValue) {
        if (System.getProperty(key) == null) {
            System.setProperty(key, defaultValue);
        }
    }

}