package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.SerenityDemoLoginPage;

import net.thucydides.core.annotations.Step;

public class LoginExitosoSteps {
	
	SerenityDemoLoginPage serenityDemoLoginPage;
	
	@Step
	public void loginSerenityDemo(String user, String pass) {
		serenityDemoLoginPage.open();
		//serenityDemoLoginPage.ingresaDatos(user,pass);
		serenityDemoLoginPage.txtUser.sendKeys("");
		serenityDemoLoginPage.login();
	}
	
}
