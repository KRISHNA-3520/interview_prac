Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User enters UserName and Password
	And Message displayed Login Successfully
	
Scenario: Successful LogOut
When User LogOut from the Application
Then Message displayed LogOut Successfully
	
	
#Feature: Defines what feature you will be testing in the tests below
#Given: Tells the pre-condition of the test
#And: Defines additional conditions of the test
#Then: States the post condition. You can say that it is the expected result of the test.