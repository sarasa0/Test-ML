package Pages.Belleza.Perfumes;

import Pages.BasePage;
import org.openqa.selenium.By;

public class PerfumesPage extends BasePage {

    public PerfumesPage(){
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//h1[contains(text(),'Perfumes')]");
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
