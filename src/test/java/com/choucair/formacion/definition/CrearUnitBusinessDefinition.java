package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CrearUnitBusinessSteps;
import com.choucair.formacion.steps.LoginExitosoSteps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearUnitBusinessDefinition {

	@Steps
	LoginExitosoSteps loginExitosoSteps;
	CrearUnitBusinessSteps crearUnitBusinessSteps;
	
	@Given("^credenciales \"([^\"]*)\" y \"([^\"]*)\"$")
	public void credenciales_y(String User, String Pass) throws Throwable {
		loginExitosoSteps.loginSerenityDemo(User, Pass);
		crearUnitBusinessSteps.crearNuevaUnitBusiness();
	}
	
	@Given("^Ingreso exitoso en la aplicacion$")
	public void ingreso_exitoso_en_la_aplicacion(String User, String Pass) throws Throwable {
		//loginExitosoSteps.loginSerenityDemo(User, Pass);
	}

	@When("^selecciono la opcion organizacion la opcion unidades de negocio$")
	public void selecciono_la_opcion_organizacion_la_opcion_unidades_de_negocio() throws Throwable {
	  crearUnitBusinessSteps.crearNuevaUnitBusiness();
	}

	@When("^pulso el boton Nuevo Business unit$")
	public void pulso_el_boton_Nuevo_Business_unit() throws Throwable {
	    
	}

	@When("^ingreso el <nombre> de la nueva unidad de negocio$")
	public void ingreso_el_nombre_de_la_nueva_unidad_de_negocio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^selecciono la unidad padre y guardo la informacion$")
	public void selecciono_la_unidad_padre_y_guardo_la_informacion() throws Throwable {

	}

	@Then("^se crea la unidad de negocio exitosamente$")
	public void se_crea_la_unidad_de_negocio_exitosamente(DataTable arg1) throws Throwable {

	}
}
