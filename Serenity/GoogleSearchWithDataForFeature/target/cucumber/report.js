$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearchWithData.feature");
formatter.feature({
  "name": "Searche in google data from feature",
  "description": "  El usuario quiere hacer una busqueda en google con datos",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": ": Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "El usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.step({
  "name": "Busca la palabra \"\u003cpalabra\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Verifica que la palabra \"\u003cpalabra\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra"
      ]
    },
    {
      "cells": [
        "Switch"
      ]
    },
    {
      "cells": [
        "sophos"
      ]
    },
    {
      "cells": [
        "grst45254es"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": Buscar en google",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elUsuarioEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busca la palabra \"Switch\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.buscaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"Switch\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": ": Buscar en google",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elUsuarioEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busca la palabra \"sophos\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.buscaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"sophos\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": ": Buscar en google",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.elUsuarioEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busca la palabra \"grst45254es\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.buscaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"grst45254es\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWithDataStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});