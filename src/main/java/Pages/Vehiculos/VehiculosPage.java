package Pages.Vehiculos;

import Pages.BasePage;
import org.openqa.selenium.By;

public class VehiculosPage extends BasePage {
    public VehiculosPage() {
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By filtroCapital = By.xpath("//span[@class='filter-name'][contains(text(),'Capital Federal')]");
    private By precioPrimerPublicacion = By.xpath("//section[@id='results-section']//ol[@id='searchResults']/li[1]//span[@class='price__fraction']");
    private By descripcionPrimerPublicacion = By.xpath("//section[@id='results-section']//ol[@id='searchResults']/li[1]//span[@class='main-title']");

    public boolean clickFiltro(){
        exist(filtroCapital);
        return clickElement(filtroCapital);
    }

    public boolean clickPublicacion(){
        exist(precioPrimerPublicacion);
        return clickElement(precioPrimerPublicacion);
    }

    public String getPrecioPublicacion(){
        exist(precioPrimerPublicacion);
        return getText(precioPrimerPublicacion);
    }

    public String getDescripcionPublicacion(){
        exist(descripcionPrimerPublicacion);
        return getText(descripcionPrimerPublicacion);
    }

}
