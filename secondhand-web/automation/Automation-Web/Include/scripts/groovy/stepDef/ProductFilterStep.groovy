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

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.keyword.internal.KeywordMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import common.ListAction2

class ProductFilterStep {

	@When("User select Hobi button category")
	public void userSelectHobiButtonCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnKategoriHobi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Kendaraan button category")
	public void userSelectKendaraanButtonCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnKategoriKendaraan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Baju button category")
	public void userSelectBajuButtonCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnKategoriBaju'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Elektronik button category")
	public void userSelectEektronikButtonCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnKategoriElektronik'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Kesehatan button category")
	public void userSelectKesehatanButtonCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnKategoriKesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("The system will display all products that match with {string} category")
	public void theSystemWillDisplayAllProductsThatMatchWithCategory(String productCardCategory) {
		WebUI.callTestCase(findTestCase('Page Objects/Products/verifyTxtProductCategory'), [('expected') : productCardCategory], FailureHandling.STOP_ON_FAILURE)
	}
}