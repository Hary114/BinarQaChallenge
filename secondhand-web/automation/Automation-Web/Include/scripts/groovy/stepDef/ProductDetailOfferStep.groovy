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
import common.ListAction


class ProductDetailOfferStep {
	@When("User click on {string} product card")
	public void userClickOnProductCard(String name) {
		WebUI.callTestCase(findTestCase('Page Objects/searchFunction/searchFunction'), [('name') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to product detail offer page")
	public void userRedirectedToProductDetailOfferPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeProductImg'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the product image")
	public void userSeeTheProductImage() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeProductImg'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the product name")
	public void userSeeTheProductName() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeNamaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the product category")
	public void userSeeTheProductCategory() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeKategoriProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the product description")
	public void userSeeTheProductDescription() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeDeskripsiProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see the seller name")
	public void userSeeTheSellerName() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeSellerName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see the seller city")
	public void userSeeTheSellerCity() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail for Offer/seeSellerKota'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}