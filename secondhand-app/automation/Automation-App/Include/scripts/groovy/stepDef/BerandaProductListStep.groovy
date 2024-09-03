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



class BerandaProductListStep {
	@Then("User redirected to product list page")
	public void userRedirectedToProductListPage() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeProductListPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Beranda button on the navbar")
	public void userPressOnBerandaButtonOnTheNavbar() {
		Mobile.callTestCase(findTestCase('Page Objects/Bottom Navbar/tapBtnBeranda'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see the product list")
	public void userCanSeeTheProductList() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeProductList'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are product cards")
	public void thereAreProductCards() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeProductCards'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Image of the products")
	public void thereAreImageOfTheProducts() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeImgProduct'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Name of the products")
	public void thereAreNameOfTheProducts() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeTxtProductName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Category of the products")
	public void thereAreCategoryOfTheProducts() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeTxtProductCategory'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Price of the products")
	public void thereArePriceOfTheProducts() {
		Mobile.callTestCase(findTestCase('Page Objects/Beranda/seeTxtProductPrice'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}