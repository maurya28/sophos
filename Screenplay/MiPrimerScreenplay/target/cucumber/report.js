$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MiPrimerScreenplay.feature");
formatter.feature({
  "name": "Search in google with data from feature",
  "description": "  el usuario quiere hacer una busqueda en google con datos",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "el usuario esta en el sitio de google",
  "keyword": "Given "
});
formatter.step({
  "name": "el busca la frase compuesta",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabraDos"
      ]
    },
    {
      "cells": [
        "\u003cpalabra\u003e",
        "\u003cpalabrados\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "Verifica que la palabra \"\u003cresultadoEsperado\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabrados",
        "resultadoEsperado"
      ]
    },
    {
      "cells": [
        "switch",
        "uno",
        "switch uno"
      ]
    },
    {
      "cells": [
        "sophos solutions",
        "dos",
        "sophos solutions dos"
      ]
    },
    {
      "cells": [
        "hola",
        "tres",
        "kjadshkjashdkjhaskjd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
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
  "name": "el busca la frase compuesta",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabraDos"
      ]
    },
    {
      "cells": [
        "switch",
        "uno"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.elBuscaLaFraseCompuesta(Phrase\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"switch uno\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
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
  "name": "el busca la frase compuesta",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabraDos"
      ]
    },
    {
      "cells": [
        "sophos solutions",
        "dos"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.elBuscaLaFraseCompuesta(Phrase\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"sophos solutions dos\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
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
  "name": "el busca la frase compuesta",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabraDos"
      ]
    },
    {
      "cells": [
        "hola",
        "tres"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.elBuscaLaFraseCompuesta(Phrase\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifica que la palabra \"kjadshkjashdkjhaskjd\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "MiPrimerScreenplayStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: La frase encontrada no corresponde al resultado esperado - \nExpected: is \"kjadshkjashdkjhaskjd\"\n     but: was \"hola tres\"\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:291)\r\n\tat co.com.google.qa.miprimerscreenplay.stepsdefinitions.MiPrimerScreenplayStepDefinitions.verificaQueLaPalabraEsteEnLosResultados(MiPrimerScreenplayStepDefinitions.java:56)\r\n\tat ✽.Verifica que la palabra \"kjadshkjashdkjhaskjd\" este en los resultados(src/test/resources/features/MiPrimerScreenplay.feature:10)\r\n",
  "status": "failed"
});
});