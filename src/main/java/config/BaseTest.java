package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest(alwaysRun = true)
    public void configuration() {
        Configuration.timeout = 10000; // очікування поки шукає елемент
        Configuration.screenshots = false; // скріншоти при помилці
        Configuration.savePageSource = false; // html відтворення при помилці
        Configuration.pageLoadTimeout = 10000; // очікування для відриття url (...)
    }

    @BeforeMethod
    public void setUp() {
        Selenide.open("https://www.google.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanWebDriver() {
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }
}
