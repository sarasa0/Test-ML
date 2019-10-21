package Steps.Belleza.Perfumes;

import Pages.Belleza.Perfumes.PerfumesPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class PerfumesSteps extends BaseSteps<PerfumesPage> {

    public PerfumesSteps(){
        super(new PerfumesPage());
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
