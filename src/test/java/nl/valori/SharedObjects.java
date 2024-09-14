package nl.valori;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedObjects {

    public static String url = "https://www.valori.nl";
    private static WebDriver driver;

    private SharedObjects() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        }

        return driver;
    }

}
