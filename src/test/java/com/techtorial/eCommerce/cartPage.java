package com.techtorial.eCommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
    private AndroidDriver<AndroidElement> driver;

    public cartPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
    public AndroidElement addToCard;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement appBar;

    @AndroidFindBy(uiAutomator = "text(\"Send me e-mails on discounts related to selected products in future\")")
    public AndroidElement futureEmail;

    @AndroidFindBy(uiAutomator = "text(\"Please read our terms of conditions\")")
    public AndroidElement terms;

    @AndroidFindBy(uiAutomator = "text(\"CLOSE\")")
    public AndroidElement closeBtn;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    public AndroidElement proceedToWeb;


}
