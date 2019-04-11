$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BuscarEnGoogle.feature");
formatter.feature({
  "name": "Google Search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinitions.user_is_on_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinitions.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He validates that the result is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "BusquedaGoogleStepDefinitions.he_validates_that_the_result_is_successful()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
});