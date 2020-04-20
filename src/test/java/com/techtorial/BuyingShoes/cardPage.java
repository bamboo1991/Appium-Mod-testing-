package com.techtorial.BuyingShoes;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.IDN;

public class cardPage {
    private AndroidDriver<AndroidElement> driver;
    public cardPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement cardBtn;


    @AndroidFindBy(uiAutomator = "text(\"$ 616.94\")")
    public AndroidElement expectedAmount;





}
