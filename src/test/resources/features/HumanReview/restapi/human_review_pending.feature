Feature: Manage Human Review Pending List 
	As an analyst,
	I want to see a list of all pending human review fields
	So that I can select them for review.
	
@Kiet_WIP 
Scenario: List of all pending human review fields 
	Given I Human Review service is operational 
	When I retrieve a list of pending human review fields 
	Then I should see a list of one or more fields ready for review