package nl.valori.pageobjects;

import nl.valori.SharedObjects;
import org.openqa.selenium.WebDriver;

public class AbstractPageObjectModel {

    public WebDriver getDriver(){
        return SharedObjects.getChromeDriver();
    }

    public String getTitle(){
        return getDriver().getTitle();
    }

}
