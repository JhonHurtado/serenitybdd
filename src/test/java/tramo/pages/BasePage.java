package tramo.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    public void click(String locator) {
        find(locator).click();
    }

    public void write(String locator, String text) {
        find(locator).sendKeys(text);
    }

    //buscar elemento
    public boolean displayedElement(String locator) {
        return find(locator).isDisplayed();
    }



}
