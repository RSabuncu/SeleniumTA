package nl.valori.stepdefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.nl.Dan;
import io.cucumber.java.nl.En;
import io.cucumber.java.nl.Gegeven;
import nl.valori.SharedObjects;
import nl.valori.pageobjects.HomePage;
import nl.valori.pageobjects.PartnersPage;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValoriStepDefs {

    private PartnersPage partnersPage;
    private HomePage homePage;

    public ValoriStepDefs(PartnersPage partnersPage, HomePage homePage) {
        this.partnersPage = partnersPage;
        this.homePage = homePage;
    }

    @Gegeven("medewerker opent de browser en navigeert naar de home pagina van Valori")
    public void opentsiteValori() {
        homePage.navigateTo();
    }

    @Gegeven("medewerker opent de browser en navigeert naar de partners pagina van Valori")
    public void danNavigeertMedewerkerNaarPaginaPartners() {
        partnersPage.navigateTo();
    }

    @En("controleert medewerker de titel van de partners pagina")
    public void controleertMedewerkerDeTitelVanDePagina() {
        System.out.println(String.format("Title of the page is -> %s", partnersPage.getTitle()));
        assertThat(partnersPage.getTitle()).isEqualTo("Partners - Valori");
    }

    @En("controleert medewerker de titel van de home pagina")
    public void controleertMedewerkerDeTitaaelVanDePagina() {
        System.out.println(String.format("Title of the page is -> %s", homePage.getTitle()));
        assertThat(homePage.getTitle()).isEqualTo("Nummer 1 in QA en Testen - Valori");
    }

    @Dan("haalt medewerkers de partners op")
    public void haalDePartnersOp() {
        System.out.println("Partners -> ");
        List<String> partners = partnersPage.getPartners();

        partners.forEach(System.out::println);
    }

    @AfterAll
    public static void cleanUp() {
        SharedObjects.getChromeDriver().close();
    }
}
