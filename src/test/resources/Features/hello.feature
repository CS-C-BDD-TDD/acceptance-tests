Feature: Say Hello To Me!
	As a greeter,
	I want to say hello to myself
	So that I can feel better about myself every day.


Scenario: Say hello in English
	Given I am  an English greeter
	When I say "Hello Everyone!"
	Then I should receive "Hello World!"