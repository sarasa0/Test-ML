package Steps.Vehiculos;

import Pages.Vehiculos.VehiculosSearchPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class VehiculosSearchSteps extends BaseSteps<VehiculosSearchPage> {

    public VehiculosSearchSteps(){
        super (new VehiculosSearchPage());
        verify();
    }

    public void verify() {
        Assert.assertTrue("Title is not displayed", page.isTitleDisplayed());
    }

    public void clickBuscar(){
        Assert.assertTrue(page.clickBuscar());
    }
}
