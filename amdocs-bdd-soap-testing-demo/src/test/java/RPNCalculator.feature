Feature: Develop an RPNCalculator.

	Scenario: Simple addition
		Given I have deployed SOAP api at URL "http://localhost:8080/rpncalculator-ws/services/RPNCalculator?wsdl"
		And the input is "10 15 +"
		When I invoke the SOAP api
		Then I expect the response as"25.0"