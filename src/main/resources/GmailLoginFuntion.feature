Feature: login funtion valadation

Scenario: Successful login with valid Credentials

Given user be able to open the browser
And go to Gmail home page
When user navigate to signin button link
And user able to put valid email- akhtar.sayada@gmail.com
And use able to click next
And user able to put valid passwords- Jahanara2016
And user able to click next 
Then Login Successful
