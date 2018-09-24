Feature: Show version of the demo app 
	As a user,
	I want to know the version of software
	So that I can perform my work effeciently

@Kiet_WIP 
Scenario: Show the current version 
	Given I am at the application "http://172.17.0.9:8080/" 
	When I check the latest version 
	Then the version should be "1.0.1"