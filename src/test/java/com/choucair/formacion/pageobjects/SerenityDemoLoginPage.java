package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://serenity.is/demo/")

public class SerenityDemoLoginPage extends PageObject {
	//Campo Usuario
	@FindBy(xpath="//*[@id=\'StartSharp_Membership_LoginPanel0_Username\']")
	public WebElementFacade txtUser;
	
	//Campo Contraseña
	@FindBy(xpath="//*[@id=\'StartSharp_Membership_LoginPanel0_Password\']")
	public WebElementFacade txtPass;
	
	//botón sign up
	@FindBy(xpath="//*[@id=\'StartSharp_Membership_LoginPanel0_LoginButton\']")
	public WebElementFacade btnLogin;
	
	
	public void ingresaDatos(String user, String pass) {
		txtUser.type(user);
		txtPass.type(pass);
		
	}
	
	public void login() {
		btnLogin.click();
	}
}
