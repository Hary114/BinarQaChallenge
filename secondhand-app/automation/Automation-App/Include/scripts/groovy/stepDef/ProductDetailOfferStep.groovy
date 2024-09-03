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



class ProductDetailOfferStep {
	@When("User redirected to product detail page {string}")
	public void userRedirectedToProductDetailPage(String detailProdukTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/verifyProductDetailOfferPageTitle'), [('expectedPageTitle') : detailProdukTitle],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller product image")
	public void userCanSeeTheSellerProductImage() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readImgProdukOffer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller product name")
	public void userCanSeeTheSellerProductName() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtOfferNamaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller product price")
	public void userCanSeeTheSellerProductPrice() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtOfferHargaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller name")
	public void userCanSeeTheSellerName() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtSellerName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller location")
	public void userCanSeeTheSellerLocation() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtSellerCity'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller product category")
	public void userCanSeeTheProductCategory() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtOfferKategoriProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the seller product description")
	public void userCanSeeTheProductDescription() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readTxtOfferDeskripsiProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is the Saya Tertarik dan Ingin Nego button")
	public void thereIsTheSayaTertarikDanInginNegoButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Offer Produk Detail/readBtnSayaTertarikDanInginNego'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}