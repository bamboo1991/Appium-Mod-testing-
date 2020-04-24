package StepDefs1;


import com.techtorial.utils.androidMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.remote.DesiredCapabilities;
import page1.App_page;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppInterfaceCheck {
    AndroidDriver<AndroidElement> driver;

    @Given("user able to read all the texts")
    public void user_able_to_read_all_the_texts() {
        App_page appPage = new App_page(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String msg = appPage.generalStore.getText();
        System.out.println(msg);


    }

    @When("default country selection is {string}")
    public void default_country_selection_is(String string) {

    }

    @Then("validate all the texts using dataTable")
    public void validate_all_the_texts_using_dataTable(List<String> requirements) {

    }
}
