package Steps;

import Pages.BasePage;
import Utils.Log;
import org.openqa.selenium.By;

public class BaseSteps<T extends BasePage> {

    protected T page;

    protected BaseSteps(T page) {
        this.page = page;
    }

    protected void click(By element) {
        page.clickElement(element);
    }

}
