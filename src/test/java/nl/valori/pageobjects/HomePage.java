package nl.valori.pageobjects;

import nl.valori.SharedObjects;

public class HomePage extends AbstractPageObjectModel{

    public void navigateTo() {
        getDriver().get(SharedObjects.url + "/");
    }

}
