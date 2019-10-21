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
        Assert.assertTrue("no fue posible hacer click sobre 'climatizacion'",page.clickClimatizacion());
    }

    public void clickCelulares(){
        page.hoverCategorias();
        page.hoverTecnologia();
        Assert.assertTrue("no fue posible hacer click sobre 'celulares'",page.clickCelulares());
    }

    public void clickTextil(){
        page.hoverCategorias();
        page.hoverHerramientas();
        Assert.assertTrue("no fue posible hacer click sobre 'textil'",page.clickTextil());
    }

    public void clickCuarto(){
        page.hoverCategorias();
        page.hoverJuguetes();
        Assert.assertTrue("no fue posible hacer click sobre 'cuarto de bebe'",page.clickCuarto());
    }

    public void clickBelleza(){
        page.hoverCategorias();
        Assert.assertTrue("no fue posible hacer click sobre 'belleza'",page.clickBelleza());
    }

    public void clickVehiculos(){
        page.hoverCategorias();
        Assert.assertTrue("no fue posible hacer click sobre 'vehiculos'",page.clickVehiculos());
    }
}
