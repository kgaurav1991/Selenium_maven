

Feature: Application Login
  
  # This is commant the scenario for the test cases
  Background:
  	Given setup the entries in database
    When launch the browser from config variable 
    And hit the Home page url of banking site

 	@RegressionTest
  Scenario: Admin Page default Login
    Given user is on NetBanking landing Page
    When user login into Appliaction with "admin" and password "1234"
    Then Home Page is displayed 
    And Cards are displayed
    
    
 #Reuseble    
 
 @MobileTest
 	Scenario: User Page default Login
    Given user is on NetBanking landing Page
    When user login into Appliaction with "user" and password "0987"
    Then Home Page is displayed 
    And Cards are displayed
    
    @SmokeTest @RegressionTest
    Scenario Outline: User Page default Login
    Given user is on NetBanking landing Page
    When user login into Appliaction with <username> and password <password> 
    Then Home Page is displayed 
    And Cards are displayed
    
    Examples:
    | username 	| password |
    | debituser | hello12  |
    | credituser| top123   |
    
    
     @SmokeTest
    Scenario: User Page default Sign up
    Given user is on Practice landing Page
    When user signup into Appliaction 
    | kumar |
    | gaurav |
    | gaurav@gamil.com |
    | 9997573409 |
    Then Home Page is displayed 
    And Cards are displayed
    
    

  
  
