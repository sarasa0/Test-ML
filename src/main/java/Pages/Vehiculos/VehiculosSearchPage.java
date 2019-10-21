package Pages.Vehiculos;

import Pages.BasePage;
import org.openqa.selenium.By;

public class VehiculosSearchPage extends BasePage {

    public VehiculosSearchPage() {
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//h1[contains(text(),'Autos, motos y otros')]");
    private By botonBuscar = By.xpath("//form//button[@class='ch-btn nav-search-classi-submit']");


    public String getTitleText() {
        return getTitle();
    }

    public String getSectionTitle(){
        return getText(sectionTitle);
    }

    public boolean clickBuscar(){
        exist(botonBuscar);
        waitSeconds(5);
        moveToElement(botonBuscar);
        return clickElement(botonBuscar);
    }

}
