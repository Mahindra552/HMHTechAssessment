@bbc @HmhTechTest

Feature: BBC website

    Scenario:Verify the top navigation links (Home, News, Sport, etc)

      Given the user open the website url
      When the user is on the home page
      Then the user clicks on the sports section


    Scenario: Navigate to the “News” section and verify url is correct

      Given the user open the website url
      When the user is on the home page
      Then the user clicks on the News section
      And  verify the url is correct


    Scenario: perform a search for “Houghton Mifflin Harcourt”

      Given the user open the website url
      When the user is on the home page
      And the user clicks on search button
      Then enter the search term in search box
      And click on search icon
      And verify the results are displayed