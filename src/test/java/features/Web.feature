Feature: ABSA Assessment 

Scenario Outline: Web Assessment for tester role

Given navigate to ABSA assesment link
And verify that you are on the user list table
And click on add user button
When give the user details of <firstname>, <lastname>, <username>, <password>, coustmer, role, <email>, <cellphone> and click on save button  
Then verify users added to the table

Examples:
|firstname	|lastname	|username	|password	|email					|cellphone	|
|FName1		|LName1		|User1		|Pass1		|admin@mail.com			|082555		|
|FName2		|LName2		|User2		|Pass2		|cusomter@mail.com		|083444		|
