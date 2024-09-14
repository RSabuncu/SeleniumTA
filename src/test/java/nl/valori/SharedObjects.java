package nl.valori;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedObjects {

    private SharedObjects() {
    }

    static WebDriver driver;
    public static WebDriver getChromeDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        }

        return driver;
    }

}
