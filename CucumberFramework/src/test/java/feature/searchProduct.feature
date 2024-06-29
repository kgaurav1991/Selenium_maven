
Feature: Search and and Place the order for products
  
  
  Scenario: Search Experience for the product search in both home add Offers Page
    Given user is on GreanCard Landing Page
    When user Searched with shortname "Tom" and extracted actual name of product
    Then user searched for "Tom" shortname in offer page 
    And validate product name in offer page matches with landing page

  
