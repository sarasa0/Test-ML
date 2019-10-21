package Tests;

import Steps.Belleza.BellezaYCuidadoSteps;
import Steps.Belleza.Perfumes.PerfumesSteps;
import Steps.HeaderSteps;
import Test.BaseTest;
import Utils.Log;
import Watcher.ReportAggregatorTestWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class TestBelleza extends BaseTest {

    @Rule
    public ReportAggregatorTestWatcher myTestWatcher = new ReportAggregatorTestWatcher();

    @Test
    public void testBelleza () {
        HeaderSteps header = new HeaderSteps();
        header.clickBelleza();
        BellezaYCuidadoSteps bell = new BellezaYCuidadoSteps();
        Assert.assertEquals("TUS PREFERIDOS",bell.getSectionTitle());
        bell.clickPerfumes();
        PerfumesSteps perf = new PerfumesSteps();
        Assert.assertEquals("Perfumes Nuevo",perf.getSectionTitle());
        Assert.assertNotNull("no hay resultados",perf.getResults());
        Log.info("Asserts correctos");
    }
}
