package Tests;

import Steps.HeaderSteps;
import Steps.Tecnologia.CelularesSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class TestTecnologia extends BaseTest {

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Test
    public void testTecnologia() {
        HeaderSteps header = new HeaderSteps();
        header.clickCelulares();
        CelularesSteps celu = new CelularesSteps();
        Assert.assertEquals("Celulares y Smartphones", celu.getSectionTitle());
        Assert.assertNotNull("no hay resultados", celu.getResults());
        Log.info("Asserts correctos");
    }
}
