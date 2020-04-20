package com.techtorial.BuyingShoes;

import com.techtorial.utils.androidMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainRunnerPage {
    AndroidDriver<AndroidElement> driver;
    DesiredCapabilities desiredCapabilities;


    @Before
    public void setup() throws MalformedURLException {
        desiredCapabilities = androidMethods.setUDesiredCapabilities("ecommerceApp" );
        driver = androidMethods.getAndroidDriver(desiredCapabilities);
    }

    @Test
    public void firstCall() {
        Shoes_page shoesPage = new Shoes_page(driver);
        loginPage loginPage = new loginPage(driver);
        cardPage cardPage = new cardPage(driver);
        loginPage.countrySelection.click();
        loginPage.agtentina.click();
        loginPage.enterName.sendKeys("Ariet" );
        driver.hideKeyboard();
        loginPage.loginBtn.click();

        List<String> shoes = new ArrayList<>();
        shoes.add(shoesPage.jordan4Retro.getText());
        shoesPage.AddToCart.click();
        shoes.add(shoesPage.jordan1Retro.getText());
        shoesPage.AddToCart.click();
        shoes.add(shoesPage.blazerMid77.getText());
        shoes.add(shoesPage.allStar.getText());
        shoes.add(shoesPage.Jordan9Retro.getText());
        shoesPage.AddToCart.click();
        shoes.add(shoesPage.jordan6Rings.getText());
        shoesPage.AddToCart.click();
        shoes.add(shoesPage.liftOff.getText());
        shoes.add(shoesPage.pg3.getText());
        shoes.add(shoesPage.sfbJungle.getText());



        cardPage.cardBtn.click();
        String actual = "211";
        String expectedAmmount= cardPage.expectedAmount.getText();
        Assert.assertEquals(expectedAmmount,actual);
        System.out.println(cardPage.expectedAmount.getText());

    }


}















