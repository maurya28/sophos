Feature: Search in google with data from feature
  Arthur quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given el usuario esta en el sitio de google
    When el usuario busca la frase "<palabra>" compuesta "<palabrados>"
    Then el usuario verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados | resultadoEsperado    |
      | switch           | uno        | switch uno           |
      | sophos solutions | dos        | sophos solutions dos |
      | hola             | tres       | kjadshkjashdkjhaskjd |

      
      