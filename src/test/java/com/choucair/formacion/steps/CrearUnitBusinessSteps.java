package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.StarsharpMainPage;

import net.thucydides.core.annotations.Step;

public class CrearUnitBusinessSteps {
	
	StarsharpMainPage starsharpMainPage;
	
	@Step
	public void crearNuevaUnitBusiness() {
		starsharpMainPage.crearNuevaUnitBusiness();
	}
	
}
