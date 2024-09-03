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



class CreateProductStep {
	@Then("User click on +Jual button")
	public void userClickOnJualButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Products/clickBtnJual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to create product page")
	public void userRedirectedToCreateProductPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyCreateProductPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Nama Produk field {string}")
	public void userInputNamaProdukField(String actualInputNamaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputNamaProduk'), [('namaProduk') : actualInputNamaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Harga Produk field {string}")
	public void userInputHargaProdukField(String actualInputHargaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputHargaProduk'), [('hargaProduk') : actualInputHargaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select the Kategori {string}")
	public void userSelectTheKategori(String kategori) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/selectKategoriProduk'), [('selectedCategory') : kategori], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Deskripsi field {string}")
	public void userInputDeskripsiField(String inputProductDesc) {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/inputDeskripsiProduk'), [('deskripsiProduk') : inputProductDesc], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User upload product image")
	public void userUploadProductImage() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/uploadImgProduct'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Terbitkan button")
	public void userClickOnTerbitkanButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Tambah Produk/clickBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to product detail page")
	public void userRedirectedToProductDetailPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail Daftar Jual Saya/verifyProductDetailPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}