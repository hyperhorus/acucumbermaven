package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class LandingPage_Definition {
	
	TestContextSetup testContextSetup;
	GenericUtils genericUtils;
	LandingPage landingPage;
	
	//GenericUtils genericUtils;
	public LandingPage_Definition(TestContextSetup testContentSetup) {
		this.testContextSetup = testContentSetup;
	}
		
	
	@Given("El usuario aterriza en la pagina de busqueda")
	public void el_usuario_aterriza_en_la_pagina_de_busqueda() {
		landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
	}
	@When("^El usuario busca (.+) en la pagina$")
	public void el_usuario_busca_en_la_pagina(String string) {
		landingPage.searchItem(string);
	}
	@Then("Se despliegan los resultados de la busqueda")
	public void se_despliegan_los_resultados_de_la_busqueda() {
		landingPage.clickSearhBtn();
	}
	
	


}
