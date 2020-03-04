Feature: Login for catapiller client

Scenario: To test login scenario for catapiller
		Given I "openBrowser" IE
		When I "navigate" to URL
    	And I "input_UserName" field
    	And I "input_Password"
    	And I "click" login button
    	Then User successfully login to application with message "Success"
