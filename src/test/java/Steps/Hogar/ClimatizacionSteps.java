package Steps.Hogar;

import Pages.hogar.ClimatizacionPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class ClimatizacionSteps extends BaseSteps<ClimatizacionPage> {

    public ClimatizacionSteps(){
        super (new ClimatizacionPage());
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
