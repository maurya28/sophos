#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Search a product on falabella

  Background: 
    Given User is in the falabellas site

  @tag1
  Scenario Outline: Title of your scenario outline
    When The user searches the product
      | <product> |
    And selects the product
    And add the product to the shopping cart
    Then The user verifies that the product of the shopping cart is the same one that was selected
      | <product> | <quantity> |

    Examples: 
      | product    | quantity |
      | Huawei P20 |        1 |
