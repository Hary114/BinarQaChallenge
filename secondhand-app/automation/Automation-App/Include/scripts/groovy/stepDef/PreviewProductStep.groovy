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



class PreviewProductStep {
	@When("User press on Preview button")
	public void userPressOnPreviewButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapBtnPreview'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to {string} Tinjau Produk page")
	public void userRedirectedToTinjauProdukPage(String tinjauPageTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/verifyPageTitleTinjauProduk'), [('expectedPageTitleTinjauProduk') : tinjauPageTitle],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the product image")
	public void userCanSeeTheProductImage() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/seeImgFotoProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the product name")
	public void userCanSeeTheProductName() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/readTxtNamaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the product price")
	public void userCanSeeTheProductPrice() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/readTxtHargaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see their name")
	public void userCanSeeTheirName() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/readTxtNamaSeller'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User can see the Category")
	public void userCanSeeTheCategory() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/readTxtKategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can see a Kembali ke Halaman Sebelumnya button")
	public void userCanSeeAKembaliKeHalamanSebelumnyaButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/seeBtnKembaliKeHalamanSebelumnya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Kembali ke Halaman Sebelumnya button")
	public void userPressOnKembaliKeHalamanSebelumnyaButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Tinjau Produk/tapBtnKembaliKeHalamanSebelumnya'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}