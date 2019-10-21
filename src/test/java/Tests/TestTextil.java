package Tests;

import Steps.HeaderSteps;
import Steps.Herramientas.TextilSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class TestTextil extends BaseTest {

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Test
    public void testTextil() {
        HeaderSteps header = new HeaderSteps();
        header.clickTextil();
        TextilSteps textil = new TextilSteps();
        Assert.assertEquals("Industria Textil", textil.getSectionTitle());
        Assert.assertNotNull("no hay resultados", textil.getResults());
        Log.info("Asserts correctos");
    }
}
