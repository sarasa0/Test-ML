package Steps;

import Pages.PublicacionPage;
import org.junit.Assert;

public class PublicacionSteps extends BaseSteps<PublicacionPage> {

    public PublicacionSteps(){
        super (new PublicacionPage());
        verify();
    }

    public void verify() {
        Assert.assertTrue("Title is not displayed", page.isTitleDisplayed());
    }

    public String getPrecio () {
        return page.getPrecio();
    }
    public String getPublicacionTitle(){
        return page.getPublicacionTitle();
    }
}
