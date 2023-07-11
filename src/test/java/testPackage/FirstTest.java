package testPackage;

//import org.testng.annotations.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

//    @BeforeTest(alwaysRun = true)                          in baseTest
//    public void setUp() {
//        Configuration.timeout = 10000; // очікування поки шукає елемент
//        Configuration.screenshots = false; // скріншоти при помилці
//        Configuration.savePageSource = false; // html відтворення при помилці
//        Configuration.pageLoadTimeout = 10000; // очікування для відриття url (...)
//    }

    @Test(description = "First_test", priority = 2, dependsOnMethods = "test2") //не відпрацьовувати якщо вказаний тест впав
    public void test() throws InterruptedException {
        Selenide.open("https://www.google.com/");
        Thread.sleep(5000);

        System.out.println("Success.First_test");
    }

    @Test(priority = 1) // приорітет виконання тестів
    public void test2() {
        System.out.println("test 2");
    }

//    @AfterMethod(alwaysRun = true)        in baseTest
//    public void tearDown() {
////        Selenide.clearBrowserCookies();
////        Selenide.refresh();
//        Selenide.open("about:blank");
//    }

    //----------------------------------------------------------------


//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("before class");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("before test");
//    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("before method");
//    }
//
//    @Test
//    public void test() {
//        System.out.println("Success.First_test");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("after method");
//    }
//
//    @Test
//    public void test2() {
//        System.out.println("test 2");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("after class");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("after test");
//    }
}
