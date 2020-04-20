package com.techtorial.BuyingShoes;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.IDN;
import java.util.List;

public class loginPage {
    private AndroidDriver<AndroidElement> driver;
    public loginPage(AndroidDriver <AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public AndroidElement countrySelection;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")
    public AndroidElement agtentina;

    @AndroidFindBy(uiAutomator = "text(\"Enter name here\")")
    public AndroidElement enterName;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale\n")
    public AndroidElement gernderF;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public AndroidElement loginBtn;










}
