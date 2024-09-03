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



class AcceptOfferStep {
	@When("User click on Terima button")
	public void userClickOnTerimaButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar Page/clickBtnTerima'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("User see label of product change to {string} on the product subject")
	public void userSeeLabelOfProductChangeToOnTheProductSubject(String statusDiterima) {
		WebUI.callTestCase(findTestCase('Test Cases/Page Objects/Info Penawar Page/verifyTxtStatusPenawaranProdukDiterima'), [('expected') : statusDiterima],
		FailureHandling.STOP_ON_FAILURE)
	}
	@Then("User see Status button")
	public void userSeeStatusButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar Page/seeBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see Hubungi di button")
	public void userSeeHubungiDiButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar Page/seeBtnHubungiDi'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}