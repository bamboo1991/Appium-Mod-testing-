package com.techtorial.appium.intro;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SwipeAction {
    AndroidDriver<AndroidElement> driver;
    URL application;
    DesiredCapabilities desiredCapabilities;

    @Before
    public void Setup() throws MalformedURLException {

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
    public void swipe() {
        AndroidElement view = driver.findElementByAndroidUIAutomator("text(\"Views\")");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();

        AndroidElement dataWidgets = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(dataWidgets))).perform();

        AndroidElement inlineText = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Inline']"));
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(inlineText))).perform();

        AndroidElement num5 = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='5']"));
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(num5))).perform();

        AndroidElement num15 = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"));

        AndroidElement num40 = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='40']"));

        touchAction.press((ElementOption.element(num15))).moveTo(ElementOption.element(num40)).perform();

        AndroidElement actualTime = driver.findElement(By.id("android:id/time_header"));

        List<AndroidElement> time = driver.findElements(By.xpath("//android.widget.TextView"));


        String finalTime = "";
        for (AndroidElement element : time) {
            finalTime += element.getText();


        }
        Assert.assertTrue(finalTime.contains("5:40"));

    }
}