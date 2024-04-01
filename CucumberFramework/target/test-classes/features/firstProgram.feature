
Feature: Application Login

Background:         //this step will execute for all scenerios like prerequisite

Given setup entries in database
When launch the browser from config variables
And hit the homepage url of banking site

@SmokeTest
Scenario: Admin page default login

Given user is on NetBanking login page
When user login into application with "admin" and password "1234"
Then Home Page is displayed
And cards are displayed

@RegressionTest  
Scenario: User page default login

Given user is on NetBanking login page
When user login into application with "user" and password "4321"
Then Home Page is displayed
And cards are displayed

@SmokeTest @RegressionTest 
Scenario Outline: Mortgage User Page default login

Given user is on NetBanking login page
When user login into application with "<Username>" and password "<Password>" 
Then Home Page is displayed
And cards are displayed

Examples:

	| Username 	| Password |
	| debituser	| hello123 |
	| credituser|	world123 |
	
	@RegressionTest
	Scenario Outline: User page default Sign up

Given user is on Practice landing page
When user Signup into application 
 | vamshi  |
 | krishna | 
 | contact@gmail.com|
 | 1234567890 |
Then Home Page is displayed
And cards are displayed
	