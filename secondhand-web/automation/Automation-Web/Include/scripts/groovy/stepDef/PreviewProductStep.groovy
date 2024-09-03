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
	@When("User click on Preview button")
	public void userClickOnPreviewButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/clickBtnPreview'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to product preview page")
	public void userRedirectedToProductPreviewPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/verifyPreviewPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product image")
	public void thereIsProductImage() {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/seeProductImg'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product description {string}")
	public void thereIsProductDescription(String productDesc) {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/verifyDeskripsiProduk'), [('expected') : productDesc], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product name {string}")
	public void thereIsProductName(String productName) {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/verifyNamaProduk'), [('expected') : productName], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product category {string}")
	public void thereIsProductCategory(String productCategory) {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/verifyKategoriProduk'), [('expected') : productCategory], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product price {string}")
	public void thereIsProductPrice(String productPrice) {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/verifyHargaProduk'), [('expected') : productPrice], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is Terbitkan button")
	public void thereIsTerbitkanButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/seeBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is Edit button")
	public void thereIsEditbutton() {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/seeBtnEdit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is Delete button")
	public void thereIsDeleteButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Preview Produk/seeBtnDelete'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}