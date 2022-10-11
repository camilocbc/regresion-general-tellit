@SMS @Regresion
Feature: Modulo de SMS Campana Rapida y Masiva

  @ACME-726
  Scenario Outline: Crear una Campaña Rápida [Envío Normal] de SMS
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y envio mensaje escrito <numCelular><tipoMensaje> <contMensaje><firma>
    #Then Validar envio SMSi <numCelular>

       Examples:
      | usuario | clave | numCelular | tipoMensaje | contMensaje |firma|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "normal" | "hola esto es una prueba de sms normal" |"FIRMA SELENIUMTEST"|

  @ACME-727
  Scenario Outline: Crear una Campaña Rápida [Envío Flash] de SMS
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y envio mensaje escrito <numCelular><tipoMensaje> <contMensaje><firma>
    #Then Validar envio SMSi <numCelular>

    Examples:
      | usuario | clave | numCelular | tipoMensaje | contMensaje |firma|

      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "fast" | "hola esto es una prueba de sms fast" |"FIRMA SELENIUMTEST"|

  @ACME-728
  Scenario Outline: Crear una Campaña Rápida [Envío Premium] de SMS
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y envio mensaje escrito <numCelular><tipoMensaje> <contMensaje><firma>
    #Then Validar envio SMSi <numCelular>

    Examples:
      | usuario | clave | numCelular | tipoMensaje | contMensaje |firma|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "premium" | "hola esto es una prueba de sms premium" |"FIRMA SELENIUMTEST"|

  @test3
  Scenario Outline: Envio SMS Campana Rapida seleccionando Plantilla
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y envio mensaje plantilla <numCelular><tipoMensaje><plantilla><firma>
    #Then Validar envio SMSi

    Examples:
      | usuario | clave | numCelular | tipoMensaje | plantilla |firma|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "normal" | "plantilla normal" |"FIRMA SELENIUMTEST"|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "fast" | "plantilla creada auto" |"FIRMA SELENIUMTEST"|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "premium" | "Test emoticones QA" |"FIRMA SELENIUMTEST"|

  @test4
  Scenario Outline: Crear una plantilla y enviar un mensaje.
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi creo plantilla y envio mensaje <numCelular><tipoMensaje><contMensaje><nomPlantilla><firma>
    #Then Validar envio SMSi

    Examples:
      | usuario | clave | numCelular | tipoMensaje | nomPlantilla |contMensaje |firma|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "normal" | "plantilla creada auto" |"esto es una prueba de crear plantilla automatizada"|"FIRMA SELENIUMTEST"|

  @test5
  Scenario Outline: Editar una plantilla y enviar un mensaje.
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi edito plantilla y envio mensaje <numCelular><tipoMensaje><plantilla><nomPlantilla><contMensaje><firma>
    #Then Validar envio SMSi

    Examples:
      | usuario | clave | numCelular | tipoMensaje |plantilla| nomPlantilla |contMensaje |firma|
      | "seleniumTest" | "s3l3niumT3st*" | "3124130120" | "normal" |"plantilla creada auto"| "plantilla editada auto" |"esto es una prueba de editar plantilla automatizada"|"FIRMA SELENIUMTEST"|

    #no aplica
  #Modulo Masivo
  @test6
  Scenario Outline: Enviar SMS masivo simple
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva Simple <fuente><tipoMensaje><separador><numTelefono><archivo>
    And Completo informacion de Campana Masiva plantilla simple <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|numTelefono|archivo|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|""|"[CELULAR]"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
     | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"[CELULAR]"|"csv"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"[CELULAR]"|"txt"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
  @ACME-1886
  Scenario Outline: SMS Campaña Masiva - Crear campaña Masiva (Texto desde Teclado)
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva todas las columnas <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo>
    And Completo informacion de Campana Masiva Digitando mensaje <nomCampana><contMensaje><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|nomCampana|contMensaje|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|""|""|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"Auto Masiva"|"plantilla creada auto"|
    # | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"Auto Masiva"|"plantilla creada auto"|
  @ACME-1887
  Scenario Outline: SMS Campaña Masiva - Crear campaña Masiva (Seleccionando Plantilla)
   Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva todas las columnas <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo>
    And Completo informacion de Campana Masiva plantilla simple <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
     | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|nomCampana|plantilla|firma|
     | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA TEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"Auto Masiva"|"plantilla creada auto"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"Auto Masiva"|"plantilla creada auto"|


  @test9
  Scenario Outline: Enviar SMS masivo Url Corta
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva con Url corta <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><selectURL><url><archivo>
    And Completo informacion de Campana Masiva plantilla simple <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|selectURL|url|archivo|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"URL única"|"https://tellit.aldeamo.com/"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
  @test10
  Scenario Outline: Enviar SMS masivo Whatsapp
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva con Whatsapp <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><numWP><mensajeWP><archivo>
    And Completo informacion de Campana Masiva plantilla simple <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|numWP|mensajeWP|archivo|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"573002120021"|"hola esto es un test"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"573002120021"|"hola esto es un test"|"csv"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"573002120021"|"hola esto es un test"|"txt"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|

  @ACME-1890
  Scenario Outline: SMS Campaña Masiva - Crear campaña Programada
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva todas las columnas <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo>
    And Completo informacion de Campana Masiva Programada <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"Auto Masiva"|"plantilla creada auto"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"Auto Masiva"|"plantilla creada auto"|
  @ACME-1891
  Scenario Outline: SMS Campaña Masiva - Crear campaña Recurrente
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva todas las columnas <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo>
    And Completo informacion de Campana Masiva Recurrente <nomCampana><plantilla><nRepeticion><Rutina><nOcurrencia><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|nomCampana|plantilla|nRepeticion|Rutina|nOcurrencia|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|""|""|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"1"|"Dia"|"2"|" FIRMA SELENIUMTEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"Auto Masiva"|"plantilla creada auto"|
    # | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"Auto Masiva"|"plantilla creada auto"|
  @ACME-1892
  Scenario Outline: SMS Campaña Masiva - Crear campaña Dependiente
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva todas las columnas <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo>
    And Completo informacion de Campana Masiva Dependiente <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|""|""|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"Auto Masiva"|"plantilla creada auto"|
    # | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"SMS Normal"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"Auto Masiva"|"plantilla creada auto"|
  @ACME-1893
  Scenario Outline: SMS Campaña Masiva - Crear campaña Masiva Doc Adjunto (Seleccionando Plantilla)
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva Doc Adjunto <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo><docAdjunto>
    And Completo informacion de Campana Masiva plantilla simple <nomCampana><plantilla><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

    Examples:
      | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|docAdjunto|nomCampana|plantilla|firma|
      | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"PNG"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIUMTEST"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"docAdjunto"|"Auto Masiva"|"plantilla creada auto"|
   #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"docAdjunto"|"Auto Masiva"|"plantilla creada auto"|

     @ACME-1894
  Scenario Outline: SMS Campaña Masiva - Crear campaña masiva Doc Adjunto (Texto desde Teclado)
    Given Abrir navegador
    And ingreso usuario y clave <usuario> <clave>
    When ingreso a SMSi y creo Campana masiva Doc Adjunto <fuente><tipoMensaje><separador><delimitador><numTelefono><idCorrelacion><FyH><archivo><docAdjunto>
    And Completo informacion de Campana Masiva Digitando mensaje <nomCampana><contMensaje><firma>
    And Envio Campana Masiva
    #Then Validar envio de Campana Masiva

       Examples:
         | usuario | clave |fuente|tipoMensaje|separador|delimitador|numTelefono|idCorrelacion|FyH|archivo|docAdjunto|nomCampana|contMensaje|firma|
         | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No aplica"|"No aplica"|"xlsx"|"PNG"|"Auto Masiva"|"plantilla creada auto"|"FIRMA SELENIMTEST"|
    # | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"csv"|"docAdjunto"|"Auto Masiva"|"plantilla creada auto"|
    #  | "seleniumTest" | "s3l3niumT3st*" |"Archivo"|"Doc Adjunto"|"Punto y coma"|"Sin delimitador"|"[CELULAR]"|"No Aplica"|"No aplica"|"txt"|"docAdjunto"|"Auto Masiva"|"plantilla creada auto"|






