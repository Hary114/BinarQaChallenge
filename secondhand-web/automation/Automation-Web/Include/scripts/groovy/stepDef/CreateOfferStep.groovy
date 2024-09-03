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



class CreateOfferStep {
	@When("User click on Saya tetarik dan ingin nego button")
	public void userClickOnSayaTetarikDanInginNegoButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/clickBtnSayaTertarikDanInginNego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the {string} modal popup")
	public void userSeeTheModalPopup(String HargaTawarTitle) {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/Masukkan Harga Tawarmu/verifyTitleModalPopup'), [
			('expected') : HargaTawarTitle], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Harga Tawar field {string}")
	public void userInputHargaTawarField(String inputHargaTawar) {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/Masukkan Harga Tawarmu/inputHargaTawar'), [('expected') : inputHargaTawar],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Kirim button")
	public void userClickOnKirimButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/Masukkan Harga Tawarmu/clickBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see button change Menunggu respon penjual")
	public void userSeeButtonChangeMenungguResponPenjual() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeLabelMenungguRespon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	//	@Then("User see button change {string}")
	//	public void userSeeButtonChange(String seeButton) {
	//		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeLabelMenungguRespon'), [('expected') : seeButton], FailureHandling.STOP_ON_FAILURE)
	//	}
}