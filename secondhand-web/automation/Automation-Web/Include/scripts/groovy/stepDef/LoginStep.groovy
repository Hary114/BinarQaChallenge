package stepDef

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginStep {
	@Given("User open {string}")
	public void userOpen(String url) {
		WebUI.navigateToUrl(url)
	}

	@When("User input registered Email {string}")
	public void userInputRegisteredEmail(String registeredEmail) {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputFieldEmail'), [('email') : registeredEmail], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input registered Password {string}")
	public void userInputRegisteredPassword(String registeredPassword) {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/inputFieldPassword'), [('password') : registeredPassword], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Masuk button")
	public void userClickOnMasukButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/clickBtnMasuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to product list page")
	public void userRedirectedToProductListPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/verifyContainerProductListTitlePromo'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is {string} error message")
	public void thereIsErrorMessage(String errorMessage) {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/verifyTxtErrorMessage'), [('expected') : 'errorMessage'], FailureHandling.STOP_ON_FAILURE)
	}
}
