package Steps.Vehiculos;

import Pages.Vehiculos.VehiculosPage;
import Steps.BaseSteps;
import org.junit.Assert;

public class VehiculosSteps extends BaseSteps<VehiculosPage> {

    public VehiculosSteps(){
        super(new VehiculosPage());
        verify();
    }

    public void verify() {
        Assert.assertTrue("Title is not displayed", page.isTitleDisplayed());
    }

    public void clickFiltro(){
        Assert.assertTrue(page.clickFiltro());
    }
    public void clickPublicacion() {Assert.assertTrue(page.clickPublicacion());}
    public String getPrecioPublicacion(){
        return page.getPrecioPublicacion();
    }

    public String getDescripcionPublicacion(){
        return page.getDescripcionPublicacion();
    }


}
