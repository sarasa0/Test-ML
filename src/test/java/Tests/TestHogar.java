package Tests;

import Steps.HeaderSteps;
import Steps.Hogar.ClimatizacionSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class TestHogar extends BaseTest {

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Test
    public void testHogar (){
        HeaderSteps header = new HeaderSteps();
        header.clickClimatizacion();
        ClimatizacionSteps clima = new ClimatizacionSteps();
        Assert.assertEquals("Climatización",clima.getSectionTitle());
        Assert.assertNotNull("no hay resultados",clima.getResults());
        Log.info("Asserts correctos");
    }
}
