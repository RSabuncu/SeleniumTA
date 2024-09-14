package nl.valori.pageobjects;

public class HomePage extends AbstractPageObjectModel{

    public void navigateTo() {
        getDriver().get("https://www.valori.nl");
    }

}
