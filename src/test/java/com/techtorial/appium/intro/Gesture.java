package com.techtorial.appium.intro;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Gesture {

    private AndroidDriver<AndroidElement> driver;
    URL application;
    DesiredCapabilities desiredCapabilities;

    @Before
    public void setUp() throws MalformedURLException {


        File apkFile = new File("src\\test\\resources\\ApiDemos-debug.apk");
        desiredCapabilities = new DesiredCapabilities();
        //device name to connect
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ari");
        //platform to use
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //automation name
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
        //setting the server URL TO CONNECT TO
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        application = new URL("http://localhost:4723/wd/hub");
        //instantiating driver
        driver = new AndroidDriver(application, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void tapGesture() {
        ////android.widget.TextView[@content-desc="Media"]
        //AndroidElement element = driver.findElementsByAndroidUIAutomator("text(\"Media\")");

        TouchAction touchAction = new TouchAction(driver);
        //  touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();

    }

    @Test
    public void tapViews() {
        AndroidElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();


        AndroidElement expandible = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandible))).perform();

        AndroidElement customAdapter = driver.findElementByAccessibilityId("1.Custom Adapter");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();

        AndroidElement catName = driver.findElement(By.xpath("//android.widget.TextView[@text='Cat Name']"));
        Assert.assertEquals("Cat Names", catName.getText());
    }

    @Test
    public void longPress() {
        TouchAction touchAction = new TouchAction(driver);

        AndroidElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();

        AndroidElement expandible = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandible))).perform();

        AndroidElement customAdapter = driver.findElementByAccessibilityId("1. Custom Adapter");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();

        AndroidElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
        touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofSeconds(3))
                .withElement(ElementOption.element(peopleNames))).perform();

        AndroidElement sampleMenu = driver.findElementByAndroidUIAutomator("text(\"Sample menu\")");
        Assert.assertEquals("Failed to verify ", "Sample menu", sampleMenu.getText());
        Assert.assertTrue("Sample Menu is not displayed", sampleMenu.isDisplayed());

    }

    @Test
    public void fishName() {
        TouchAction touchAction = new TouchAction(driver);

        AndroidElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();

        AndroidElement expandible = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandible))).perform();

        AndroidElement customAdapter = driver.findElementByAccessibilityId("1. Custom Adapter");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();


        AndroidElement FishNames = driver.findElementByAndroidUIAutomator("text(\"Fish Names\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(FishNames))).perform();
        List<AndroidElement> fishes = new ArrayList<>();
        AndroidElement Golby = driver.findElementByAndroidUIAutomator("text(\"Goldy\")");
        AndroidElement Bubble = driver.findElementByAndroidUIAutomator("text(\"Bubbles\")");
        fishes.add(Golby);
        fishes.add(Bubble);

        for (AndroidElement element : fishes) {
            Assert.assertTrue(element.isDisplayed());
        }
        touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofSeconds(3))
                .withElement(ElementOption.element(FishNames))).perform();
        AndroidElement sampleMenu = driver.findElementByAndroidUIAutomator("text(\"Sample menu\")");
        Assert.assertTrue(sampleMenu.isDisplayed());


    }





    }
