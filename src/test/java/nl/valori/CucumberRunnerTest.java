package nl.valori;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("nl.valori")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-reports/index.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "nl.valori.stepdefinitions")
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "classpath:/features")
public class CucumberRunnerTest {

}

