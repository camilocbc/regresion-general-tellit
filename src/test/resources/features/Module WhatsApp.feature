@WhatsApp @Regresion
Feature: Modulo de WhatsApp Campana Rapida y Masiva

  @IL-1
  Scenario Outline: Crear una Campaña Rápida  de Whatsapp
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
  @IL-12
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo texto
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio Campana Masiva <fuenteD><plantilla><archivo><separador><delimitador><codPais><selectNum><idCorrelacion>
    And ingreso informacion de campana <nomCamp>
    And Envio Campana Masiva WhatsApp
    #Then

    Examples:
      | usuario | clave | fuenteD |plantilla|archivo|separador|delimitador|codPais|selectNum|idCorrelacion|nomCamp|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"aldeamo_solo_texto_test"|"csv"|"Coma"|""|"[PAIS]"|"[CELULAR]"|""|"TestAutmatizacion"|
  @IL-13
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo imagen cargada
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio Campana Masiva Doc en archivo<fuenteD><plantilla><archivo><separador><delimitador><codPais><selectNum><idCorrelacion><imagen>
    And ingreso informacion de campana <nomCamp>
    And Envio Campana Masiva WhatsApp
    #Then

    Examples:
      | usuario | clave | fuenteD |plantilla|archivo|separador|delimitador|codPais|selectNum|idCorrelacion|imagen|nomCamp|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"test_imagen"|"csv"|"Coma"|""|"[PAIS]"|"[CELULAR]"|""|"[IMG]"|"TestAutmatizacion"|
  @IL-14
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo imagen URL
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio Campana Masiva Digito URL <fuenteD><plantilla><archivo><separador><delimitador><codPais><selectNum><idCorrelacion><imagen><URLimagen>
    And ingreso informacion de campana <nomCamp>
    And Envio Campana Masiva WhatsApp
    #Then

    Examples:
      | usuario | clave | fuenteD |plantilla|archivo|separador|delimitador|codPais|selectNum|idCorrelacion|imagen|URLimagen|nomCamp|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"test_imagen"|"csv"|"Coma"|""|"[PAIS]"|"[CELULAR]"|""|"URL adjunto"|"https://upload.wikimedia.org/wikipedia/commons/4/47/PNG_transparency_demonstration_1.png"|"TestAutmatizacion"|
  @IL-15
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp seleccionar imagen
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio Campana Masiva selecciono imagen <fuenteD><plantilla><archivo><separador><delimitador><codPais><selectNum><idCorrelacion><imagen><docAdj>
    And ingreso informacion de campana <nomCamp>
    And Envio Campana Masiva WhatsApp
    #Then

    Examples:
      | usuario | clave | fuenteD |plantilla|archivo|separador|delimitador|codPais|selectNum|idCorrelacion|imagen|docAdj|nomCamp|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"test_imagen"|"csv"|"Coma"|""|"[PAIS]"|"[CELULAR]"|"" |"Cargar adjunto"|"png"|"TestAutmatizacion"|


  @IL-16
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo documento cargada
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio Campana Masiva Doc en archivo<fuenteD><plantilla><archivo><separador><delimitador><codPais><selectNum><idCorrelacion><Doc>
    And ingreso informacion de campana <nomCamp>
    And Envio Campana Masiva WhatsApp
    #Then

    Examples:
      | usuario | clave | fuenteD |plantilla|archivo|separador|delimitador|codPais|selectNum|idCorrelacion|Doc|nomCamp|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"test_imagen"|"csv"|"Coma"|""|"[PAIS]"|"[CELULAR]"|""|"[DOC]"|"TestAutmatizacion"|
  @IL-17
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo documento URL
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
  @IL-18
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp seleccionar documento
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
  @IL-19
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo video cargada
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
  @IL-20
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp solo video URL
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
  @IL-21
  Scenario Outline: Crear una Campaña Mavisa de Whatsapp seleccionar video
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a WhatsApp y envio mensaje con plantilla <lineaA><nunCel> <plantilla>
    #Then

    Examples:
      | usuario | clave | lineaA | nunCel | plantilla |
      | "seleniumTest" | "s3l3niumT3st*" | "573054495490" | "573124130120" | "bot_demo_hibot" |
