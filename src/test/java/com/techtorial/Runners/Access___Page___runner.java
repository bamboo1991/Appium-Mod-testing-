package com.techtorial.Runners;

import com.techtorial.pages.AccessibilityPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Access___Page___runner {
    AccessibilityPage page;
    AndroidDriver<AndroidElement> driver;
    URL application;
    DesiredCapabilities desiredCapabilities;


    @Before
    public void setup() throws MalformedURLException {
        File path = new File("src\\test\\resources\\ApiDemos-debug.apk");
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ari");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
        application = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(application, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page = new AccessibilityPage(driver);
    }

    @Test
    public void tapAccessibility() {

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.accessibility))).perform();

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.nodeProvider))).perform();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));


        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.nodeQuery))).perform();
         Assert.assertTrue(page.enabled.isEnabled());
        System.out.println(page.enabled.getText());
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.accessService))).perform();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.customView))).perform();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));



    }

//    @Test
//    public void tapNodeProvider() {
//        page = new AccessibilityPage(driver);
//        touchAction = new TouchAction(driver);
//        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.accessibility))).perform();
//        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(page.nodeQuery))).perform();
//
//    }


}
