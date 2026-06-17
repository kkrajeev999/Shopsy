package test;

import baseclass.BaseClassTest;
import org.testng.annotations.Test;
import pages.WomenClothingLinkPage;

public class WomenClothingLinkTest extends BaseClassTest {

    @Test(priority = 1)
    public void clickWomenClothingLinkTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.moveWomenClothingLink();
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void clickEthnicWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickEthnicWear();
        Thread.sleep(2000);
        System.out.println("Ethnic wear list displayed successfully");

    }

    @Test(priority = 3)
    public void clickWesterWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickWesterWear();
        Thread.sleep(2000);
        System.out.println("Wester wear list displayed successfully");

    }

    @Test(priority = 4)
    public void clickWinterWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickWinterWear();
        Thread.sleep(2000);
        System.out.println("Winter wear list displayed successfully");

    }

    @Test(priority = 5)
    public void clickInnerWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickInnerWear();
        Thread.sleep(2000);
        System.out.println("Inner wear list displayed successfully");

    }
}

