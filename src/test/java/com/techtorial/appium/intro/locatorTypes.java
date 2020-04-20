package com.techtorial.appium.intro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class locatorTypes {
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
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator1");
        //setting the server URL TO CONNECT TO
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        application = new URL("http://localhost:4723/wd/hub");
        //instantiating driver
        driver = new AndroidDriver(application, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void locators(){
        //accesibility id
      AndroidElement accesibility= driver.findElementByAccessibilityId("Accessibility");
      accesibility.click();
      //className
        AndroidElement customView = driver.findElement((By.xpath("//android.widget.TextView[@text='Custom View']")));



    }
    @Test
    public void locatorsTool(){
        //recourse-id==id in selenium
       AndroidElement views= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
       views.click();
    AndroidElement customView = driver.findElementByAndroidUIAutomator("text(\"Chronometer\")");
    customView.click();
    }

}
