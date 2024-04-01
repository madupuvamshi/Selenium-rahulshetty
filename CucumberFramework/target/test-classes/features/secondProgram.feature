
Feature: Application Login

Background:         //this step will execute for all scenerios like prerequisite

When launch the browser from config variables
And hit the homepage url of banking site


@RegressionTest  @NetBanking
Scenario: User page default login

Given user is on NetBanking login page
When user login into application with "user" and password "4321"
Then Home Page is displayed
And cards are displayed

@SmokeTest @RegressionTest @Mortage
Scenario Outline: Mortgage User Page default login

Given user is on NetBanking login page
When user login into application with "<Username>" and password "<Password>" 
Then Home Page is displayed
And cards are displayed

Examples:

	| Username 	| Password |
	| debituser	| hello123 |
	| credituser|	world123 |
	
