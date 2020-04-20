package com.techtorial.eCommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Buying_page {
    private AndroidDriver<AndroidElement> driver;

    public Buying_page(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public AndroidElement countrySelection;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bolivia\"));")
    public AndroidElement bolivia;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public AndroidElement nameField;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioFemale']")
    public AndroidElement genderF;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']")
    public AndroidElement genderM;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public AndroidElement shopBtn;



    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));")
    public AndroidElement jordanRetro;






}
