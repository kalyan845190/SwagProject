Feature: Swag labs

@TS_01
Scenario Outline:   Login to Swag labs with valid credentials
    Given the user launched the chrome browser
    When the user opens Swaglabs homepage
    When the user enters valid "<username>" and "<password>"
    When click the login button
    Then Assert if the product_label is displayed
 Examples:
               |username|password|
               |standard_user|secret_sauce|
               
 @TS_02 
 Scenario: Sorting in the order of low to high price
Given LAunching the chrome browser
When LAunching the application
When click on Name price low to high 
When compare the first two item prices
Then Assert if the two item prices are in ascending order

@TS_03
 Scenario: Sorting in the order of high to low price
 Given LAUnching the chrome browser
When LAUnching the application
When click on Name price high to low
When compare the first two item prices
Then Assert if the two item prices are in descending order

@TS_04
Scenario: Switching to new window
Given LAUNCHING THE browser
When LAUNCHING THE Application
When click on resources
When click on selenium
Then Assert if it is Switching to the new tab

@TS_05
Scenario: Displaying the copyright
Given LAUNCHING THE Browser
When LAUNCHING THE APPlication
Then Assert if it is displaying the copyright in the footer section