package Test;


import Driver.DriverManager;
import Driver.PageManager;
import Utils.Log;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setup(){
        Log.info("------------------Test Started------------------");
        PageManager.getPage("http://www.MercadoLibre.com.ar");
    }

    @After
    public void clear() {
        //comment this line to keep the browser between tests in the same class instead of closing it
        //DriverManager.closeDriver();
        Log.info("------------------Test Finished------------------");
    }

    @AfterClass
    public static void close() {
        DriverManager.closeDriver();
    }
}
