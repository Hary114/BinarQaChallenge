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



class SearchProductStep {
	@When("User press on Search Product field")
	public void userPressOnSearchProductField() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/tapFieldSearch'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input {string} on the Search Product field")
	public void userInputOnTheSearchProductField(String cariBarang) {
		Mobile.callTestCase(findTestCase('Page Objects/Search Produk/inputFieldSearch'), [('inputSearch') : cariBarang], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on the {string} product name")
	public void userPressOnTheProductName(String productName) {
		Mobile.callTestCase(findTestCase('Page Objects/Search Produk/selectTxtNamaProdukCustomScript'), [('expectedName') : productName],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to search page")
	public void userRedirectedToSearchPage() {
		Mobile.callTestCase(findTestCase('Page Objects/Search Produk/seeFieldSearch'), [:], FailureHandling.STOP_ON_FAILURE)
	}
			
//		@When("The system displays a list of product related to the searched products")
//		public void theSystemDisplaysAListOfProductRelatedToTheSearchedProducts() {
//			
//		}
//		
}