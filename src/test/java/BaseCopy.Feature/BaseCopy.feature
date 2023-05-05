Feature: To validate the entire functionality of Base copy5 cluster application 

Scenario: To send a messege from user1 to user2 and validate it 
	Given The user should be in a proper URL 
	And The user should login the application 
	When To send a message from user1 
	Then To check the message is listed under the same user 
	
Scenario: To verify the messege from user2 
	Given The user should navigate to user profile 
	And Login as him/her 
	When The user should navigate to inbox page 
	Then user should verify the msg send by user2 
	
	
