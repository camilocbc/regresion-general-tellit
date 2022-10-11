@Regresion @Reportes
  Feature: Reportes Tellit

    @Report-1
    Scenario Outline: Reporte detallado
      Given Abrir navegador
      And ingreso usuario y clave <usuario> <clave>
      When ingreso en reporte y valido informacion
    #Then Validar envio SMSi <numCelular>
  Examples:
      |usuario|clave|
      | "seleniumTest" | "s3l3niumT3st*" |