package Steps.Juguetes;

import Pages.Juguetes.CuartoDeBebePage;
import Steps.BaseSteps;
import org.junit.Assert;

public class CuartoDeBebeSteps extends BaseSteps<CuartoDeBebePage> {

    public CuartoDeBebeSteps(){
        super (new CuartoDeBebePage());
        verify();
    }

    public void verify() {
        Assert.assertTrue("Title is not displayed", page.isTitleDisplayed());
    }

    public String getTitle(){
        return page.getTitleText();
    }

    public String getSectionTitle() {
        return page.getSectionTitle();
    }

    public String getResults() {
        return page.getResults();
    }
}
