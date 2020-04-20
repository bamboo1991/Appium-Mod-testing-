package com.techtorial.eCommerce;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ecommerce_Intro {
    AndroidDriver<AndroidElement> driver;
    DesiredCapabilities desiredCapabilities;
    URL application;
    Ecommerce_Page page;


    @Before
    public void setup() throws MalformedURLException {
        File path = new File("src\\test\\resources\\ecommerceApp.apk");
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ari");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
        application = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(application, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void test1() {
        page = new Ecommerce_Page(driver);
        page.countrySelection.click();
        page.bolivia.click();
        page.nameField.sendKeys("Ariet");
        driver.hideKeyboard();
        page.genderF.click();
        page.shopBtn.click();

    }

    @Test
    public void NegativeTest() {
        page = new Ecommerce_Page(driver);
        page.shopBtn.click();
        AndroidElement toastMessage = driver.findElement(By.xpath("//android.widget.Toast"));
        Assert.assertTrue(toastMessage.isDisplayed());
    }

    @Test
    public void jordanShoes() {
        cartPage cartPage = new cartPage(driver);
        Buying_page page = new Buying_page(driver);
//        page.countrySelection.click();
//        page.bolivia.click();
        page.nameField.sendKeys("Ariet");
        driver.hideKeyboard();
        page.genderM.click();
        page.shopBtn.click();
        page.jordanRetro.click();
        cartPage.addToCard.click();
        cartPage.appBar.click();
        cartPage.futureEmail.click();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofSeconds(2))
                .withElement(ElementOption.element(cartPage.terms))).perform();

        cartPage.closeBtn.click();

        cartPage.proceedToWeb.click();



    }
}
