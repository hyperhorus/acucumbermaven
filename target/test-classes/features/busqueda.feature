Feature: Buscar un elemento en Google
 	@A1
  Scenario: Buscar en elemeto en la pagina de Goole
    Given El usuario aterriza en la pagina de busqueda
    When El usuario busca "New York Yankees" en la pagina
    Then Se despliegan los resultados de la busqueda

  @A3
  Scenario Outline: Buscar elementos en Google
    Given El usuario aterriza en la pagina de busqueda
    When El usuario busca <items> en la pagina
    Then Se despliegan los resultados de la busqueda

    Examples: 
      | items          |
      | Barbie         |
      | vasos termicos |
