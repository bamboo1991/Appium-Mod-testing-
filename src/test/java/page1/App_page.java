package page1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class App_page {
    private AndroidDriver<AndroidElement> driver;

    public App_page(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "text(\"General Store\")")
    public AndroidElement generalStore;
    @AndroidFindBy(uiAutomator = "text(\"Select the country where you want to shop\")")
    public AndroidElement countryTitle;
    @AndroidFindBy(uiAutomator = "text(\"Your Name\")")
    public AndroidElement nameText;
    @AndroidFindBy(uiAutomator = "text(\"Gender\")")
    public AndroidElement genderText;
    @AndroidFindBy(uiAutomator = "text(\"Afghanistan\")")
    public AndroidElement defaultCountry;
    @AndroidFindBy(uiAutomator = "text(\"Enter name here\")")
    public AndroidElement nameFieldText;
    @AndroidFindBy(uiAutomator = "text(\"Male\")")
    public AndroidElement maleText;
    @AndroidFindBy(uiAutomator = "text(\"Female\")")
    public AndroidElement FemaleText;

}
