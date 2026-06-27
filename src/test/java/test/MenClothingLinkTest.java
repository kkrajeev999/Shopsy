package test;

import baseclass.BaseClassTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MenClothingLinkPage;

import utilities.ExtentListener;

import java.util.Arrays;
import java.util.List;


@Listeners(ExtentListener.class)
public class MenClothingLinkTest extends BaseClassTest {
    SoftAssert softAssert = new SoftAssert();


    @Test (groups = {"Regression"})

    public void clickMenClothingLinkTest() throws InterruptedException {
        MenClothingLinkPage menClothingLinkPage = new MenClothingLinkPage(driver);
        menClothingLinkPage.moveMenClothingLink();

    }


    @Test (groups = {"Regression"})

    public void clickEthnicWearTest() throws InterruptedException {
        MenClothingLinkPage menClothingLinkPage = new MenClothingLinkPage(driver);
        menClothingLinkPage.clickEthnicWear();
        Thread.sleep(2000);
        System.out.println("Ethnic wear list displayed successfully");
        //SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(menClothingLinkPage.isOptionDisplayed("Ethnic Wear"), "Ethnic Wear option is not displayed");
        assert menClothingLinkPage.isOptionDisplayed("Women Clothing") : "Women Clothing link is not displayed";
        Thread.sleep(2000);
        List<String> ethnicWearOptions = Arrays.asList(
                "Sherwani",
                "Dhotis",
                "Kurtas",
                "Harem Pants",
                "Ethnic Bottom",
                "All Ethnic Wear",
                "Ethnic Wear",
                "Sherwani",
                "Dhotis",
                "Kurtas",
                "Harem Pants",
                "Ethnic Bottom",
                "All Ethnic Wear");
        for(String ethnicWear : ethnicWearOptions) {
            softAssert.assertTrue(menClothingLinkPage.isOptionDisplayed(ethnicWear), "Option '" + ethnicWear + "' is not displayed");
        }
        System.out.println("Ethnic Wear options verified successfully");

        softAssert.assertAll();


    }

    @Test (groups = {"Regression"})

    public void clickWesterWearTest() throws InterruptedException {
        MenClothingLinkPage womenClothingLinkPage = new MenClothingLinkPage(driver);
        womenClothingLinkPage.clickWesterWear();
        Thread.sleep(2000);
        System.out.println("Wester wear list displayed successfully");
        //Assert.assertTrue(womenClothingLinkPage.isOptionDisplayed("Wester Wear"), "Wester Wear option is not displayed");
        List<String> westernWearOptions = Arrays.asList(
                "Western Wear",
                "Jeans",
                "T-Shirts",
                "Jackets",
                "Sweatshirts",
                "Shrugs",
                "Shorts",
                "Cargo Pants",
                "Co-ord Sets",
                "Topwear",
                "Sweaters"
        );
        for(String westernWear : westernWearOptions) {
          softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed(westernWear), "Option '" + westernWear + "' is not displayed");
        }
        System.out.println("Wester Wear options verified successfully");
        softAssert.assertAll();
    }


    @Test (groups = {"Regression"})

    public void clickWinterWearTest() throws InterruptedException {
        MenClothingLinkPage womenClothingLinkPage = new MenClothingLinkPage(driver);
        womenClothingLinkPage.clickWinterWear();
        Thread.sleep(2000);
        System.out.println("Winter wear list displayed successfully");
        List<String>winterWearOptions = Arrays.asList(
                "Western Wear",
                "Jeans",
                "T-Shirts",
                "Jackets",
                "Sweatshirts",
                "Shrugs",
                "Shorts",
                "Cargo Pants",
                "Co-ord Sets",
                "Topwear",
                "Sweaters"
        );
        for (String winterWear : winterWearOptions){
            softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed(winterWear), "Option '" + winterWear + "' is not displayed");
        }
        System.out.println("Winter wear options verified successfully");
        softAssert.assertAll();

    }


    @Test (groups = {"Regression"})

    public void clickInnerWearTest() throws InterruptedException {
        MenClothingLinkPage womenClothingLinkPage = new MenClothingLinkPage(driver);
        womenClothingLinkPage.clickInnerWear();
        Thread.sleep(2000);
        System.out.println("Inner wear list displayed successfully");

    }
}

