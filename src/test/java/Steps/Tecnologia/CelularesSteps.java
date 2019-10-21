package Steps.Tecnologia;

import Pages.Herramientas.TextilPage;
import Pages.Tecnologia.CelularesPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class CelularesSteps extends BaseSteps<CelularesPage> {

    public CelularesSteps(){
        super (new CelularesPage());
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
