package Pages;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {

    private By title = By.xpath("//title");

    private By categorias = By.xpath("//header//a[contains(text(),'Categor')]"); // this needs to be hovered over for the others to appear, they are otherwise hidden

    private By hogarYelectro = By.xpath("//header//a[contains(text(),'Hogar y Electrodom')]"); //this needs to be selected for climatizacion to appear, otherwise it is hidden
    private By climatizacion = By.xpath("//header//div[@class='nav-categs-detail__body']//a[contains(text(),'Climatizaci')]");

    private By tecnologia = By.xpath("//header//a[contains(text(),'Tecnología')]");
    private By celularesYSmartphones = By.xpath("//header//div[@class='nav-categs-detail__body']//a[contains(text(),'Celulares y Smartphones')]");

    private By herramientasEIndustria = By.xpath("//header//a[contains(text(),'Herramientas')]");
    private By industriaTextil = By.xpath("//header//div[@class='nav-categs-detail__body']//a[contains(text(),'Textil')]");

    private By juguetesYBebe = By.xpath("//header//a[contains(text(),'Juguetes')]");
    private By cuartoDeBebe = By.xpath("//header//div[@class='nav-categs-detail__body']//a[contains(text(),'Cuarto')]");

    private By bellezaYCuidado = By.xpath("//header//a[contains(text(),'Belleza')]"); // esta categoria no tiene un detalle como las otras

    private By vehiculos = By.xpath("//header//a[contains(text(),'Veh')]");

    public HeaderPage() {
        setTitle(title);
    }

    public boolean hoverCategorias() {
        exist(categorias, true);
        return moveToElement(categorias);
    }

    public boolean hoverHogar() {
        exist(hogarYelectro);
        return moveToElement(hogarYelectro);
    }

    public boolean hoverTecnologia(){
        exist(tecnologia);
        return moveToElement(tecnologia);
    }

    public boolean hoverHerramientas(){
        exist(herramientasEIndustria);
        return moveToElement(herramientasEIndustria);
    }

    public boolean hoverJuguetes(){
        exist(juguetesYBebe);
        return moveToElement(juguetesYBebe);
    }

    public boolean clickClimatizacion() {
        exist(climatizacion);
        return clickElement(climatizacion);
    }

    public boolean clickCelulares(){
        exist(celularesYSmartphones);
        return clickElement(celularesYSmartphones);
    }

    public boolean clickTextil(){
        exist(industriaTextil);
        return clickElement(industriaTextil);
    }

    public boolean clickCuarto(){
        exist(cuartoDeBebe);
        return clickElement(cuartoDeBebe);
    }

    public boolean clickBelleza(){
        exist(bellezaYCuidado);
        return clickElement(bellezaYCuidado);
    }
    public boolean clickVehiculos(){
        exist(vehiculos);
        return clickElement(vehiculos);
    }
}
