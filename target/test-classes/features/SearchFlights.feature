@tag
Feature: Test Search Functionality for United Flights 


@Scenario1
Scenario: Test Search flights with Valid date for ROUND TRIP with FIXED DATES
Given Open browser and hit url
When I select roundtrip
And Enter "PDX" to From field
And Enter "MCI" to destinations
And I Enter "Sep 19, 2017"Departure Date
And I Enter "Sep 25, 2017""Return Date
And I select "5" adults
And User clicks on advanced search option
When I land on to advanced search Page
And I deselect Non Stop option
And I click on My search Preference
And I enter "DFW" as my preferred connection
And I select FlexibleFares option
And I select Yes for mileage earnings
And I click on search
Then User should be able to search successfully


@Scenario2
Scenario: Test Search flights with Valid date for ROUND TRIP with FLEXIBLE DATE
Given Open browser and hit url
When I select roundtrip
And Enter "PDX" to From field
And Enter "MCI" to destinations
And I click flexible dates
And I select "8 days" from drop down
And I select "5" adults 
And User clicks on advanced search option
When I land on to advanced search Page
And I deselect Non Stop option
And I click on My search Preference
And I enter "DFW" as my preferred connection
And I select FlexibleFares option
And I select Yes for mileage earnings
And I click on search
Then User should be able to search successfully


@Scenario3
Scenario: Test Search flights with Valid date for ONEWAY TRIP with FIXED DATES
Given Open browser and hit url
When I select one-way
And Enter "PDX" to From field
And Enter "MCI" to destinations
And I Enter "Sep 19, 2017"Departure Date
And I select "5" adults 
And User clicks on advanced search option
When I land on to advanced search Page
And I deselect Non Stop option
And I click on My search Preference
And I enter "DFW" as my preferred connection
And I select FlexibleFares option
And I select Yes for mileage earnings
And I click on search
Then User should be able to search successfully

@Scenario4
Scenario: Test Search flights with Valid date for ONEWAY TRIP with FLEXIBLE DATE
Given Open browser and hit url
When I select one-way
And Enter "PDX" to From field
And Enter "MCI" to destinations
And I click flexible dates
And I select "5" adults
And User clicks on advanced search option
When I land on to advanced search Page
And I deselect Non Stop option
And I click on My search Preference
And I enter "DFW" as my preferred connection
And I select FlexibleFares option
And I select Yes for mileage earnings
And I click on search
Then User should be able to search successfully


