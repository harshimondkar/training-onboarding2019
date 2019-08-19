#keyword: description
Feature: Develop a Hello Java Application

	Scenario: Should be invoked say Hello
		Given I have created say hello
		When I invoke sayHello method on hello object
 		Then I expect the response 'Hello BDD!'