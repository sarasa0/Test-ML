package Pages.Herramientas;

import Pages.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;

public class TextilPage extends BasePage {

    public TextilPage (){
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//h1[contains(text(),'Textil')]");
    private By sectionResults = By.xpath("//div[@class='quantity-results']");

    public String getTitleText() {
        return getTitle();
    }

    public String getSectionTitle(){
        return getText(sectionTitle);
    }

    public String getResults() {
        return getText(sectionResults);
    }

}
