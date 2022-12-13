Feature: To check Adactin hotel login page Functionality 

Scenario: To check login page functionally  using correct username and password then click login buttton

Given : User has to go Adactin hotel login page

And : User has to pass correct username and password in textbox

And :User has to click login button

Then : User has to navigate to Adactin Search hotel page


Scenario: To Check Search hotel page functionality to select location, hotel, Room type, no.of rooms, Adults and children room and pass check in date, check out date and click search button

Given : User has to navigate search hotel page 

And : user should select the mandatory box.

And : User has to pass check in date and check out date

And : User has to click search button

Then : User has to navigate to book hotel page


Scenario: To check book hotel functionality to pass personal detail of mandatory box

Given : User has to go book hotel page

And : User should pass the mandatory textbox 

And : User should select the mandatory boxs

Then : User has to click Book now button


Scenario: To verify Booked Itinerary

Given : User has to go Booked Itinerary page

Then : user click logout button
