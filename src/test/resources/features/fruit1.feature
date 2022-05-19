@DataLoad
Feature: Read fruits from excel or json file
  
  @json
  Scenario: Read fruits and color from json file
    Given I have list of fruits with colors.
    When I select fruit "<Name>".
    Then Color should be "<Color>".
    
    Examples:
      ##@externaldata@./src/test/resources/data/Fruits.json


	@excel
  Scenario: Read fruits and color from excel file
    Given I have list of fruits with colors.
    When I select fruit "<Name>".
    Then Color should be "<Color>".
    
    Examples:
      ##@externaldata@./src/test/resources/data/Fruits.xlsx


  @excel
  Scenario: Read fruits and color from excel file with sheet name
    Given I have list of fruits with colors.
    When I select fruit "<Name>".
    Then Color should be "<Color>".
    
    Examples:
|Name|Color|
|Strawberry|Red|
|Guava|Green|
|Orange|Orange|
    
      
  @csv
  Scenario: Read fruits and color from excel file with sheet name
    Given I have list of fruits with colors.
    When I select fruit "<Name>".
    Then Color should be "<Color>".
    
    Examples:
|Color|Name|
|Red|Apple|
|Yellow|Banana|
|Blue|Berry|
|Green|Graps|



