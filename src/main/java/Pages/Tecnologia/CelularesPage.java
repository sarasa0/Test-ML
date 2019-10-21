package Pages.Tecnologia;

import Pages.BasePage;
import org.openqa.selenium.By;

public class CelularesPage extends BasePage {

    public CelularesPage(){
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//h1[contains(text(),'Celulares')]");
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
