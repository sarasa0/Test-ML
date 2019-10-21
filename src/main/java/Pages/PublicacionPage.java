package Pages;

import org.openqa.selenium.By;

public class PublicacionPage extends BasePage {

    public PublicacionPage() {
        setTitle(title);
    }
    private By title = By.xpath("//title");
    private By precio = By.xpath("//fieldset//span[@class='price-tag-fraction']");
    private By objetoPublicado = By.xpath("//h1[@class='item-title__primary ']");

    public String getPublicacionTitle () {
        return getText(objetoPublicado);
    }

    public String getPrecio () {
        return getText(precio);
    }
}
