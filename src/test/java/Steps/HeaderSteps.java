package Steps;

import Pages.HeaderPage;
import org.junit.Assert;

public class HeaderSteps extends BaseSteps<HeaderPage> {

    public HeaderSteps(){
        super (new HeaderPage());
    }

    public void clickClimatizacion(){
        page.hoverCategorias();
        page.hoverHogar();
        Assert.assertTrue(page.clickClimatizacion());
    }

    public void clickCelulares(){
        page.hoverCategorias();
        page.hoverTecnologia();
        Assert.assertTrue(page.clickCelulares());
    }

    public void clickTextil(){
        page.hoverCategorias();
        page.hoverHerramientas();
        Assert.assertTrue(page.clickTextil());
    }

    public void clickCuarto(){
        page.hoverCategorias();
        page.hoverJuguetes();
        Assert.assertTrue(page.clickCuarto());
    }

    public void clickBelleza(){
        page.hoverCategorias();
        Assert.assertTrue(page.clickBelleza());
    }

    public void clickVehiculos(){
        page.hoverCategorias();
        Assert.assertTrue(page.clickVehiculos());
    }
}
