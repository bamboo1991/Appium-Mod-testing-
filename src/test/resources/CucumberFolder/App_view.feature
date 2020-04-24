@smoke @TC-02
Feature: Validate all the text in the first page

  Scenario: Validating texts
    Given user able to read all the texts
    When default country selection is "Afghanistan"
    Then validate all the texts using dataTable
      | General Store                             |
      | Select the country where you want to shop |
      | Your Name                                 |
      | Gender                                    |
      | Afghanistan                               |
      | Enter name here                           |
      | Male                                      |
      | Female                                    |