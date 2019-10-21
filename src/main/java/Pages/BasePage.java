package Pages;

import Driver.DriverManager;
import Utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = null;
    private WebDriverWait wait;
    private By titlePage;


    protected BasePage() {
        driver = DriverManager.getDriverInstance();
        wait = new WebDriverWait(driver, 6);
    }

    public WebElement get(By element) {
        return get(element, true);
    }

    public WebElement get(By element, boolean mustWait) {
        int maxTries = 1;
        for (int tries = 1; tries <= maxTries; tries++) {
            try {
                if (mustWait) return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
                else return driver.findElement(element);
            } catch (TimeoutException e) {
                //tiene que entrar en este catch si no encuentra el elemento
                Log.exception("No se encontro el elemento " + element.toString(), e);
            }
        }
        return null;
    }

    /**
     * este metodo deberia servir para llevar el mouse a un webElement.
     * incluso si es necesario hacer scroll
     *
     * @param element
     */
    public boolean moveToElement(By element) {
        Log.info("moviendome al elemento " + element.toString());
        try {
            WebElement toElement = get(element);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", toElement); // workaround for scrolling using geckodriver
            Actions builder = new Actions(driver);
            builder.moveToElement(toElement).build().perform();
            return true;
        } catch (Exception e) {
            Log.exception("Ocurrio un error al desplazarse al elemento: " + element.toString(), e);
            return false;
        }
    }

    public boolean clickElement (By element) {
        try {
            get(element).click();
            return true;
        } catch (Exception e) {
            Log.exception("Ocurrio un error al cliquear el elemento: " + element.toString(), e);
            return false;
        }
    }

    public boolean exist(By elementBy) {
        return exist(elementBy, false);
    }

    public boolean exist(By elementBy, boolean wait) {
        try {
            Log.info("Chequeando existencia del elemento " + elementBy.toString());
            return get(elementBy, wait) != null;
        } catch (Exception e) {
            return false;
        }
    }

    public String getText(By elementBy) {
        Log.info("Obteniendo texto del elemento " + elementBy.toString());
        String text = get(elementBy).getText();
        Log.info("Texto Obtenido: '" + text + "'");
        return text;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean isTitleDisplayed() {
        return exist(titlePage);
    }

    public By setTitle(By titlePage) {
        return this.titlePage = titlePage;
    }

    public void waitSeconds (double seconds){
        try {
            Thread.sleep((long) (seconds * 1000L));
        } catch (InterruptedException e) {
        }
    }

}
