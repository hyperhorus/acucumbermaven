Feature: Buscar un elemento en Google

 Scenario: Buscar en elemeto en la pagina de Goole
 Given El usuario aterriza en la pagina de busqueda
 When El usuario busca "zapatos" en la pagina
 Then Se despliegan los resultados de la busqueda

  
 # @A1
 # Scenario Outline: Search experience for product search in both home and Offers pages
 #   Given User is on GreenKart Landing Page
 #   When User searched  with shortname <name> and extracted actual name for product
 #   Then user searched  for <name> shortname in offers page
 #   And validate product name in offers page matches with Landing page

 #   Examples: 
 #     | name |
 #     | Tom  |
 #     | Beet |
