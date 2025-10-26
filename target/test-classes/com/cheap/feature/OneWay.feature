Feature: Chennai to Coimbatore OneWay


       ## Cases Covered
## Validating if the URL Loaded
## Validating if the Tabs are Selecteable
## Validating if the Radio Button under the Tab is Selectable


Scenario: Validating if the Valid URL is Loaded
	Given Launch Chrome Browser and Load the URL "https://www.cheapair.com/"
	Then Ensure if the Booking Page is Loaded "https://www.cheapair.com/"
	
#Scenario: Validating if the Valid URL is Loaded
#	Given Ticket Booking Page is Loaded "https://www.cheapair.com/"

Scenario: Ensure if able to Select Flight Tab
    Given Able to Click Flight Tab
    Then Validating if the Flight Tab is Selected
    
Scenario: Ensure if able to Packages Tab
    Given Able to Click Package Tab
    Then Validating if the Package Tab is Selected
    
Scenario: Ensure if able to Hotels Tab
    Given Able to Click Hotel Tab
    Then Validating if the Hotel Tab is Selected

Scenario: Ensure if able to Cars Tab
    Given Able to Click Cars Tab
    Then Validating if the Cars Tab is Selected

Scenario: Validating if Round Trip Radio is getting Selected
	Given Able to Click Round Trip Radio
	Then Validdating if Round Trip Radio Got Selected
	
Scenario: Validating if One Way Radio is getting Selected
	Given Able to Click One Way Radio 
	Then Validating if One Way Radio got Selected

Scenario: Validating if Multi City Radio Getting Selected
	Given Able to Click Multi City	
	Then Validating if Multi City Radio Got Selected
	
Scenario: Validating if it is able to select From Field
	Given Able to Click From Where Input Field
	Then Validating if From Where Input Field got selected

Scenario: Validating if it is able to select To Field
	Given Able to Click To Where Input Field
	Then Validating if to Where Input Field got selected

Scenario: Validating if it is able to select the Depart Date Field
		Given Able to Click Depart date Field
		Then Validating is Depart Date Field got Selected
		
Scenario: Validating if it is able to select the Return Date Field
		Given Able to Click Return date Field
		Then Validating is Return Date Field got Selected
		
Scenario: Validating if it is able to select the Number of Travellers Field
		Given Able to Click Number of Travellers Field
		Then Validating is Number of Travellers Field got Selected

Scenario: Entring Words in From Where Field shows Sugestion List
		Given Entering Words in From Field shows Suggestion Relevent to the input "Coimbatore"
		#Then Coimbatore is Listed in the Suggestion list
