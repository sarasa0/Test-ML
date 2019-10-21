package Pages.hogar;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ClimatizacionPage extends BasePage {

    public ClimatizacionPage() {
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//h1[contains(text(),'Clima')]");
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
