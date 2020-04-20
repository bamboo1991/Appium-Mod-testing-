package com.techtorial.BuyingShoes;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Shoes_page {
    private AndroidDriver<AndroidElement> driver;

    public Shoes_page(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 4 Retro\"));" )
    public AndroidElement jordan4Retro;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 1 Mid SE\"));" )
    public AndroidElement jordan1Retro;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike Blazer Mid '77\"));" )
    public AndroidElement blazerMid77;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"));" )
    public AndroidElement allStar;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));" )
    public AndroidElement Jordan9Retro;


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));" )
    public AndroidElement jordan6Rings;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"));" )
    public AndroidElement liftOff;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"LeBron Soldier 12\"));")
    public AndroidElement Soldier12;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));" )
    public AndroidElement pg3;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));" )
    public AndroidElement sfbJungle;

    @AndroidFindBy(uiAutomator = "text(\"ADD TO CART\")")
    public AndroidElement AddToCart;




}
