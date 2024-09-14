package nl.valori;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedObjects {

    private SharedObjects() {
    }

//    private static Browser browser;
//    private static Page page;
//
//    public static Page getPage() {
//        if (page == null) {
//            try (Playwright playwright = Playwright.create()) {
//                browser = playwright.chromium().launch();
//                page = browser.newPage();
//            }
//            return page;
//        }
//
//        return page;
//    }


    static WebDriver driver;
    public static WebDriver getChromeDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        }

        return driver;
    }

}
