package Steps.Belleza;

import Pages.Belleza.BellezaYCuidadoPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class BellezaYCuidadoSteps extends BaseSteps<BellezaYCuidadoPage> {

    public BellezaYCuidadoSteps(){
        super (new BellezaYCuidadoPage());
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

    public void clickPerfumes(){
        Assert.assertTrue(page.clickPerfumes());
    }
}
