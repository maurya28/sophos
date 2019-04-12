
@tag
Feature: Search a product on falabella

  Background: 
    Given User is in the falabellas site

  @tag1
  Scenario Outline: add a product to the shopping cart
    When Mariana searches the product
      | <product> |
    And She selects the product
    And She add the product to the shopping cart
    Then She verifies that the product of the shopping cart is the same one that was selected
      | <product> | <quantity> |

    Examples: 
      | product    | quantity |
      | Huawei P20 |        1 |
