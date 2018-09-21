Feature: Say Hello To Me! 
	As a greeter,
	I want to say hello to myself
	So that I can feel better about myself every day.


Scenario: Say hello in English 
	Given I am  an English greeter 
	When I say "Hello Everyone!" 
	Then I should receive "Hello World!" 
	
@Kiet_WIP 
Scenario: Check new greeings 
	Given I am at the application "http://demo-app-demo-app.127.0.0.1.nip.io/" 
	When I check the latest version 
	Then the version should be "1.0.1"