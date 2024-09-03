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



class EditProfileStep {
	@When("User press on pencil icon")
	public void userPressOnPencilIcon() {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya/tapIconPencil'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to {string} LIA page")
	public void userRedirectedToLiaPage(String liaPage) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyLengkapiInfoAkunPageTitle'), [('expectedPageTitleLengkapiInfoAkun') : liaPage], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on profile Name")
	public void userPressOnProfileName() {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/tapTxtProfileName'), [:], FailureHandling.STOP_ON_FAILURE);
	}

	@When("The system display a popup modal {string}")
	public void theSystemDisplayAPopupModal(String bottomSheet) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtBottomSheetTitle'), [('expectedBottomSheetTitle') : bottomSheet], FailureHandling.STOP_ON_FAILURE)
	}


	@When("User press on Simpan button")
	public void userPressOnSimpanButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/tapBtnSimpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will see a popup message {string}")
	public void userWillSeeAPopupMessage(String liaTopMessage) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtTopMessage'), [('expectedTxtTopMessage') : liaTopMessage], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on profile Phone")
	public void userPressOnProfilePhone() {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/tapTxtProfilePhone'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on profile City")
	public void userPressOnProfileCity() {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/tapTxtProfileCity'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on profile Address")
	public void userPressOnProfileAddress() {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/tapTxtProfileAddress'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input new profile Name {string}")
	public void userInputNewProfileName(String editName) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldUbahForAll'), [('inputContent') : editName], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input new profile Phone {string}")
	public void userInputNewProfilePhone(String editPhone) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldUbahForAll'), [('inputContent') : editPhone], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input new profile City {string}")
	public void userInputNewProfileCity(String editCity) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldUbahForAll'), [('inputContent') : editCity], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input new profile Address {string}")
	public void userInputNewProfileAddress(String editAddress) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldUbahForAll'), [('inputContent') : editAddress], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see new profile Name {string}")
	public void userSeeNewProfileName(String editedName) {
		Mobile.callTestCase(findTestCase('Test Cases/Page Objects/Lengkapi Info Akun/verifyTxtDataName'), [('expectedTxtDataName') : editedName], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see new profile Phone {string}")
	public void userSeeNewProfilePhone(String editedPhone) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtDataPhone'), [('expectedTxtDataPhone') : editedPhone], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see new profile City {string}")
	public void userSeeNewProfileCity(String editedCity) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtDataCity'), [('expectedTxtDataCity') : editedCity], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see new profile Address {string}")
	public void userSeeNewProfileAddress(String editedAddress) {
		Mobile.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtDataAddress'), [('expectedTxtDataAddress') : editedAddress], FailureHandling.STOP_ON_FAILURE)
	}
}