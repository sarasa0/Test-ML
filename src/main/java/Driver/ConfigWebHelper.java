package Driver;

import java.io.File;

public class ConfigWebHelper {

    public static String getBrowserName() {
        return System.getProperty("browserName");
    }

    public static int getAppDefaultWait() {
        return Integer.parseInt(System.getProperty("appDefaultWait"));
    }

    /**
     * obtiene el path del webdriver
     *
     * @param browserName el navegador a buscar
     * @return
     */
    public static String getDriverPath(String browserName) {

        String driverName = System.getProperty(browserName + "DriverName");
        String osName = "windows";
        String arch = System.getProperty("os.arch");//architecture - amd64 - x86
        return getProjectPath() + File.separator + System.getProperty("driverFolderBase") + File.separator
                + osName + File.separator + arch + File.separator + driverName;
    }

    private static String getProjectPath() {
        return System.getProperty("user.dir").replaceAll(
                File.separator + System.getProperty("rootProject.name"), "");
    }

}
