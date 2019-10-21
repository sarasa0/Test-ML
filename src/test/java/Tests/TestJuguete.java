package Tests;

import Steps.HeaderSteps;
import Steps.Juguetes.CuartoDeBebeSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class TestJuguete extends BaseTest {

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Test
    public void testJuguete() {
        HeaderSteps header = new HeaderSteps();
        header.clickCuarto();
        CuartoDeBebeSteps cuarto = new CuartoDeBebeSteps();
        Assert.assertEquals("Cuarto del Bebé", cuarto.getSectionTitle());
        Assert.assertNotNull("no hay resultados", cuarto.getResults());
        Log.info("Asserts correctos");
    }
}
