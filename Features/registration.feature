Feature: Register

Scenario: Successful registration
       Given User Launch Chrome Browser
       When User opens url  "http://practice.automationtesting.in/my-account/"
       And enters Email as "sarveshhatti31523@gmail.com" and password as "Sarvesh@4612"
       And click on register
       Then User should be successfully registered
     

Scenario Outline: Successful Login
       Given User Launch Chrome Browser
       When User opens url  "http://practice.automationtesting.in/my-account/"
       And enters Username as "<email>" and password as "<password>"
       And click on login
        
       Examples:
            | email | password |
            |sarveshssbj@gmail.com | Sarvesh@4612  |
            |sarvesh@gmail.com | 46124612 |