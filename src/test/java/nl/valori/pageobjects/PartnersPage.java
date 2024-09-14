package nl.valori.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PartnersPage extends AbstractPageObjectModel {

    List<String> partners;

    public void navigateTo() {
        getDriver().get("https://www.valori.nl/partners");
    }

    public List<String> getPartners() {
        partners = new ArrayList<>();

        List<WebElement> trs = getDriver().findElements(By.xpath("//table/tbody/tr[position() mod 2 = 1]"));

        trs.forEach(tr -> {
            List<WebElement> tds = tr.findElements(By.xpath("td[position() mod 2 = 1]/p[position()=1]"));
            tds.forEach(td -> {
                partners.add(td.getText());
            });
        });

        return partners;
    }

}


