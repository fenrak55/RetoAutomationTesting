package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StarsharpMainPage extends PageObject{
	//Botón Organization
	@FindBy (xpath="//*[@id=\"SidebarMenu\"]/li[6]/a")
	public WebElementFacade btnOrganization;
	//Botón business units
	@FindBy (xpath="//*[@id=\'SidebarMenu\']/li[6]/ul/li[1]/a")
	public WebElementFacade btnBusinessUnit;
	//botón new business unit
	@FindBy (xpath="//*[@id=\'GridDiv\']/div[2]/div[2]/div/div/div[1]")
	public WebElementFacade btnNewBusinessUnit;
	
	
	public void crearNuevaUnitBusiness() {
		btnOrganization.click();
		btnBusinessUnit.click();
		btnNewBusinessUnit.click();
	}
}

