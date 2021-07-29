#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Feature1
Feature: Login exitoso a Serenity Demo

  @LoginExitoso
  Scenario: Login Serenity demo
    Given credenciales "admin" y "serenity"
    When diligencio los campos con los datos correspondientes
    Then verifico el ingreso exitoso

  @CrearNuevaUnidadNegocio
  Scenario: Creacion exitosa unidad de negocio
    Given Ingreso exitoso en la aplicacion
    When selecciono la opcion organizacion la opcion unidades de negocio
    And pulso el boton Nuevo Business unit
    And ingreso <nombre> de la nueva unidad de negocio
    And selecciono la unidad padre y guardo la informacion
    Then se crea la unidad de negocio exitosamente
    
    
      
 # @AgendaReunion
 #Scenario: Agendar reunion 
 #Given Ingreso exitoso en la aplicacion
 #When selecciono la opcion reuniones
    #And 
    #Then