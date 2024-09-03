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



class TambahProdukStep {
	@When("User press on the + button on the navbar")
	public void userPressOnTheButtonOnTheNavbar() {
		Mobile.callTestCase(findTestCase('Page Objects/Bottom Navbar/tapBtnIconPlus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to {string} create product page")
	public void userRedirectedToCreateProductPage(String tambahProdukPageTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/verifyTxtTambahProdukPageTitle'), [('expected') : tambahProdukPageTitle], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Nama Produk field {string}")
	public void userInputNamaProdukField(String namaProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldNamaProduk'), [('inputNamaProduk') : namaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Harga Produk field {string}")
	public void userInputHargaProdukField(String hargaProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldHargaProduk'), [('inputHargaProduk') : hargaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Kategori dropdown menu")
	public void userPressOnKategoriDropdownMenu() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapFieldKategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select the Kategori {string}")
	public void userSelectTheKategori(String selectedKategori) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/selectFieldKategoriProduk'), [('selectedKategori') : selectedKategori], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Lokasi field {string}")
	public void userInputLokasiField(String lokasiProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldLokasi'), [('inputLokasi') : lokasiProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Deskripsi field {string}")
	public void userInputDeskripsiField(String deskripsiProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/inputFieldDeskripsi'), [('inputDeskripsi') : deskripsiProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press upload product image in Foto Produk")
	public void userPressUploadProductImageInFotoProduk() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapUploadImgProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press icon Galeri")
	public void userPressIconGaleri() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Pilih Gambar/tapIconGaleri'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press product image")
	public void userPressProductImage() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Pilih Gambar/tapImgProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Terbitkan button")
	public void userPressOnTerbitkanButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/tapBtnTerbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press product image from phone")
	public void userPressProductImageFromPhone() {
		Mobile.callTestCase(findTestCase('Page Objects/Tambah Produk/Pilih Gambar/tapImgProdukMobile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will see a popup message {string} published")
	public void userWillSeeAPopupMessagePublished(String messageBerhasil) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyTxtPopupMessageBerhasilDiterbitkan'), [('expectedPopupMessageBerhasilDiterbitkan') : messageBerhasil],
		FailureHandling.STOP_ON_FAILURE)
	}
}