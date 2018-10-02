Feature: Tag a predefined keyword for human review 
	As an external partner,
	I want the system to tag predefined keywords in an incoming STIX file
	So that an analyst can revirew the content before disseminating the file
	

#/* Acceptance Criteria:
#	If a STIX file contains the following keywords:
#			PERSON
#			CREDIT_CARD
#	The system automatically marks (tags) that this file is potential PII for human review 
#*/

@Jennie 
Scenario: Trigger for Human Review when a free text contains PERSON keywords 
	Given a STIX file contains a free text field of "Joe Smith" 
	When the system confirms the field 
	And the field is tagged as potential PII for human review 
	Then the file is sent to human review queue 
	
	
Scenario:
Trigger for Human Review when a free text contains credit card information 
	Given a STIX file contains a free text field of "1234 1234 1234 1234" 
	When the system confirms the field 
	And the field is tagged as potential PII for human review 
	Then the file is sent to human review queue 
	
