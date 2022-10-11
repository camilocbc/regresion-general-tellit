
  Feature: Login Tellit
    @Login
    Scenario Outline: Realizar login correcto
      Given Abrir navegador
      When ingreso usuario y clave <usuario> <clave>
      Then Validar login correcto <mensaje>

      Examples:
        | usuario | clave | mensaje |
        | "seleniumTest" | "s3l3niumT3st*" | "Productos" |
     #   | "seleniumTest" | "s3l3niumT3st" | "Productos" |


