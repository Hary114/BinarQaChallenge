package stepDef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SignupStep {
	@When("User click on Daftar link")
	public void userClickOnDaftarLink() {
		WebUI.callTestCase(findTestCase('Page Objects/Masuk/clickLinkDaftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to {string} daftar page")
	public void userRedirectedToDaftarPage(String daftarPageTitle) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/verifyTxtPageDaftarTitle'), [('expectedTitlePageDaftar') : daftarPageTitle], FailureHandling.STOP_ON_FAILURE)
	}
	@When("User input Name {string}")
	public void userInputName(String name) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputFieldName'), [('username') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Email {string}")
	public void userInputEmail(String newEmail) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputFieldEmail'), [('Email') : newEmail], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Password {string}")
	public void userInputPassword(String userPassword) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/inputFieldPassword'), [('password') : userPassword], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Daftar button")
	public void userClickOnDaftarButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/clickBtnDaftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to products list page")
	public void user_redirected_to_products_list_page() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/verifyContainerProductListTitlePromo'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is {string} error message below the invalid or unfilled field")
	public void thereIsErrorMessageBelowTheInvalidOrUnfilledField(String emailTaken) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar/verifyTxtEmailTakenErrorMessage'), [('expectedEmailTakenErrorMessage') : emailTaken], FailureHandling.STOP_ON_FAILURE)
	}
}