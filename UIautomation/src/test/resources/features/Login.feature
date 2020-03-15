@Regression
Feature: Login to client application

Scenario: To test login scenario
		Given I "openBrowser" "Firefox"
		When I "navigate" to URL
    	And I "input_UserName" field
    	And I "input_Password"
    	And I "click" login button
    	Then User successfully login to application with message "Success"
