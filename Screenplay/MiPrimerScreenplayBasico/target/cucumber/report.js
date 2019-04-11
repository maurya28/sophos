$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MiPrimerScreenplayBasico.feature");
formatter.feature({
  "name": "Search in google with data from feature",
  "description": "  el usuario quiere hacer una busqueda en google con datos",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "buscar en google",
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
  "name": "el usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.elUsuarioEstaEnElSitioDeGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busca la palabra \"sophos\"",
  "keyword": "When "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.buscaLaPalabra(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"sophos\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "status": "passed"
});
});