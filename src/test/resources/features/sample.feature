
Feature: This is a sample feature file

  Background:
    Given scenario data

  Scenario Outline: This is a scenario to test datadriven test on Cucumber JVM.
    When executed from Runner Class.
    Then UserName and Password shows on console from Examples "<UserName>" and "<Password>".

    Examples:
      | UserName | Password |
          ##@externaldata@./src/test/resources/data/UserData.json
|Rangineni|Muni|
|Munna|Gahan|



#  Scenario: This is a scenario to test datatable test on Cucumber JVM.
#    Then UserName and Password shows on console from datatable.
#      | UserName | Password |
      ##@externaldata@./src/test/resources/data/UserData.json
|Rangineni|Muni|
|Munna|Gahan|
       ##@externaldata@./src/test/resources/data/TestData.xlsx@Sheet1
|Test|Sekhar|
|Gahan|Manasvi|
|Milky|Rangineni|
|Gahan|Rangineni|
|||

