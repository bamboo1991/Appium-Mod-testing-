package com.techtorial.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class androidMethods {
    public static AndroidDriver getAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        //setting server URL to connect to
        URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");
        //instantiating driver
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(appiumServerUrl,
                caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    public static DesiredCapabilities setUDesiredCapabilities(String appName){
        File apkFile = new File("src\\test\\resources\\"+appName+".apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //device name to connect
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ari");
        //platform to use
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //automation name
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        return desiredCapabilities;
    }
}
