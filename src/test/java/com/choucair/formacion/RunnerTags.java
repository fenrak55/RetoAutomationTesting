package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@Critico")
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
@CucumberOptions (features = "src/test/resources/features/demo.feature", tags = "@LoginExitoso")
public class RunnerTags {

}