package com.techtorial.pages;

import com.techtorial.utils.Driver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class ApiDemosMainPage {
    public ApiDemosMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @AndroidFindBy(id = "Accessibility")
    AndroidElement accessibility;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
    AndroidElement animation;

    @AndroidFindBy(accessibility = "App")
    AndroidElement app;

    @AndroidFindBy(uiAutomator = "text\"Content\"")
    AndroidElement content;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Graphics']")
    AndroidElement graphics;

    @AndroidFindBy(uiAutomator = "text\"Media\"")
    AndroidElement media;

    @AndroidFindBy(id = "NFC")
    AndroidElement  nfc;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Text']")
    AndroidElement text;

    @AndroidFindBy(uiAutomator = "text\"Views\"")
    AndroidElement views;

}
/*
create minimum 5 pages for PageObjectModel:
 - Accessibility page
 - Views Page
 - Content
 - Focus (under Views Page)
 - Controls (under Views Page)
 */