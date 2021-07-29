package com.choucair.formacion.definition;



import com.choucair.formacion.steps.LoginExitosoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginExitosoDefinition {
	
	@Steps
	LoginExitosoSteps loginExitosoSteps;
	
	@Given("^Teniendo \"([^\"]*)\" y \"([^\"]*)\"$")
	public void teniendo_y(String User, String Pass) throws Throwable {
		loginExitosoSteps.loginSerenityDemo(User,Pass);
	}

	@When("^diligencio los campos con los datos correspondientes$")
	public void diligencio_los_campos_con_los_datos_correspondientes() throws Throwable {
	    
	}

	@Then("^verifico el ingreso exitoso$")
	public void verifico_el_ingreso_exitoso() throws Throwable {
	    
	}


}
