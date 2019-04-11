
Feature: Title of your feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: : Buscar en google
    Given El usuario esta en el sitio de google
    When Busca la palabra "<palabra>" compuesta "<palabrados>"
    Then Verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra     | palabrados | resultadoEsperado |
      | Switch      | uno        | Switch            |
      | sophos      | dos        | sophos            |
      | grst45254es | tres       | fdsr4234          |
