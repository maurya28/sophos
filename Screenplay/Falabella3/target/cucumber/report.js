$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Falabella.feature");
formatter.feature({
  "name": "Search a product on falabella",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user searches the product",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "\u003cproduct\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "selects the product",
  "keyword": "And "
});
formatter.step({
  "name": "add the product to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "name": "The user verifies that the product of the shopping cart is the same one that was selected",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "\u003cproduct\u003e",
        "\u003cquantity\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "quantity"
      ]
    },
    {
      "cells": [
        "Huawei P20",
        "1"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in the falabellas site",
  "keyword": "Given "
});
formatter.match({
  "location": "FalabellaStepDefinitions.userIsInTheFalabellasSite()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user searches the product",
  "rows": [
    {
      "cells": [
        "Huawei P20"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FalabellaStepDefinitions.theUserSearchesTheProduct(Product\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects the product",
  "keyword": "And "
});
formatter.match({
  "location": "FalabellaStepDefinitions.selectsTheProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the product to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "FalabellaStepDefinitions.addTheProductToTheShoppingCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verifies that the product of the shopping cart is the same one that was selected",
  "rows": [
    {
      "cells": [
        "Huawei P20",
        "1"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FalabellaStepDefinitions.theUserVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected(String\u003e)"
});
formatter.result({
  "status": "passed"
});
});