package test;

import baseclass.BaseClassTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WomenClothingLinkPage;
import utilities.ExtentListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Listeners(ExtentListener.class)
public class WomenClothingLinkTest extends BaseClassTest {
    SoftAssert softAssert = new SoftAssert();

    @Test (groups ={"Sanity"})
    public void clickWomenClothingLinkTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.moveWomenClothingLink();

    }

    @Test (groups ={"Sanity"})
    public void clickEthnicWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickEthnicWear();
        Thread.sleep(2000);
        System.out.println("Ethnic wear list displayed successfully");
        //SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed("Ethnic Wear"), "Ethnic Wear option is not displayed");
        assert womenClothingLinkPage.isOptionDisplayed("Women Clothing") : "Women Clothing link is not displayed";
        Thread.sleep(2000);
        List<String> ethnicWearOptions = Arrays.asList(  "Sarees",
                "Lehenga Cholis",
                "Blouses",
                "Dupattas",
                "Patiala Salwar",
                "Kurtas",
                "Sharara Pants",
                "Ethnic Sets",
                "Petticoats",
                "Leggings",
                "Dhoti",
                "Jeggings");
        for(String ethnicWear : ethnicWearOptions) {
            softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed(ethnicWear), "Option '" + ethnicWear + "' is not displayed");
        }
        System.out.println("Ethnic Wear options verified successfully");

        softAssert.assertAll();


    }
    @Test (groups ={"Sanity"})
    public void clickWesterWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickWesterWear();
        Thread.sleep(2000);
        System.out.println("Wester wear list displayed successfully");
        //Assert.assertTrue(womenClothingLinkPage.isOptionDisplayed("Wester Wear"), "Wester Wear option is not displayed");
        List<String> westernWearOptions = Arrays.asList(
                "Skirts",
                "Waistcoats",
                "T-Shirts",
                "Shirts",
                "Jeans",
                "Shorts",
                "Top",
                "Trousers",
                "Jumpsuits",
                "Gowns",
                "Dungarees",
                "Dresses"
        );
        for(String westernWear : westernWearOptions) {
          softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed(westernWear), "Option '" + westernWear + "' is not displayed");
        }
        System.out.println("Wester Wear options verified successfully");
        softAssert.assertAll();
    }

    @Test (groups ={"Sanity"})
    public void clickWinterWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickWinterWear();
        Thread.sleep(2000);
        System.out.println("Winter wear list displayed successfully");
        List<String>winterWearOptions = Arrays.asList(
                "Jackets",
                "Ponchos",
                "Sweaters",
                "Shrugs",
                "Sweatshirts"
        );
        for (String winterWear : winterWearOptions){
            softAssert.assertTrue(womenClothingLinkPage.isOptionDisplayed(winterWear), "Option '" + winterWear + "' is not displayed");
        }
        System.out.println("Winter wear options verified successfully");
        softAssert.assertAll();

    }

    @Test (groups ={"Sanity","Regression"})
    public void clickInnerWearTest() throws InterruptedException {
        WomenClothingLinkPage womenClothingLinkPage = new WomenClothingLinkPage(driver);
        womenClothingLinkPage.clickInnerWear();
        Thread.sleep(2000);
        System.out.println("Inner wear list displayed successfully");

    }
}

