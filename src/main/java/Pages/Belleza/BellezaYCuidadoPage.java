package Pages.Belleza;

import Pages.BasePage;
import org.openqa.selenium.By;

public class BellezaYCuidadoPage extends BasePage {

    public BellezaYCuidadoPage(){
        setTitle(title);
    }

    private By title = By.xpath("//title");
    private By sectionTitle = By.xpath("//p[contains(text(),'Tus preferidos')]");
    private By sectionResults = By.xpath("//div[@class='quantity-results']");
    private By perfumesLink = By.xpath("//h3[contains(text(),'Fragancias')]");

    public String getTitleText() {
        return getTitle();
    }

    public String getSectionTitle(){
        return getText(sectionTitle);
    }

    public String getResults() {
        return getText(sectionResults);
    }

    public boolean clickPerfumes(){
        exist(perfumesLink);
        moveToElement(perfumesLink);
        return clickElement(perfumesLink);
    }

}
