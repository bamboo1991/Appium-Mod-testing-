package page1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
    private AndroidDriver<AndroidElement> driver;
    public Summary_Page(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement appBar;

    @AndroidFindBy(uiAutomator = "text(\"$ 1123.91\")")
    public AndroidElement actualSum;

    @AndroidFindBy(className = "android.widget.CheckBox")
    public AndroidElement checlBox;

    @AndroidFindBy(uiAutomator = "text(\"Please read our terms of conditions\")")
    public AndroidElement terms;

    @AndroidFindBy(uiAutomator = "text(\"CLOSE\")")
    public AndroidElement closeTerms;


}
