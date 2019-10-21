package Steps.Herramientas;

import Pages.Herramientas.TextilPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class TextilSteps extends BaseSteps<TextilPage> {

    public TextilSteps(){
        super (new TextilPage());
        verify();
    }

    public void verify() {
        Assert.assertTrue("Title is not displayed", page.isTitleDisplayed());
    }

    public String getSectionTitle() {
        return page.getSectionTitle();
    }

    public String getResults() {
        return page.getResults();
    }

}
