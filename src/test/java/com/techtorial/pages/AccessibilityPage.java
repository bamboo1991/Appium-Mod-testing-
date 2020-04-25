package com.techtorial.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class AccessibilityPage {

    private AndroidDriver<AndroidElement> driver;

    public AccessibilityPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "Accessibility")
    public AndroidElement accessibility;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Accessibility Node Provider']")
    public AndroidElement nodeProvider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Accessibility Node Querying']")
    public AndroidElement nodeQuery;

    @AndroidFindBy(id = "Accessibility Service")
    public AndroidElement accessService;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Custom View']")
    public AndroidElement customView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Task Take out Trash']")
    public AndroidElement enabled;


}
