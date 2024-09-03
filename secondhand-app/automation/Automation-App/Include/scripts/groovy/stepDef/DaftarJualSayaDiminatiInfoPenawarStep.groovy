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



class DaftarJualSayaDiminatiInfoPenawarStep {
	@When("User press on Daftar Jual Saya button")
	public void userPressOnDaftarJualSayabutton() {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya/tapBtnDaftarJualSaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to {string} diminati tab")
	public void userRedirectedToDiminatiTab(String diminatiTitlePage) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyDiminatiTitlePage'), [('expectedTitlePageDiminati') : diminatiTitlePage],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Diminati tab")
	public void userPressOnDiminatiTab() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/tapLinkDiminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on product with product name {string}")
	public void userPressOnProductWithProductName(String productName) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/selectProductWithStatusPenawaranProduk2'), [('expectedName') : productName],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is buyer profile name")
	public void thereIsBuyerProfileName() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtBuyerName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is {string} label for the list")
	public void thereIsLabelForTheList(String sectionTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtProdukYangDitawar'), [('expectedProdukYangDitawar') : sectionTitle],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product status {string}")
	public void thereIsProductStatus(String statusPenawaranProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtStatusPenawaranProduk'), [('expectedStatusPenawaranProduk') : statusPenawaranProduk],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product name")
	public void thereIsProductName() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtProductName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product price")
	public void thereIsProductPrice() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtProductPrice'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product bargain price")
	public void thereIsProductBargainPrice() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtProductBargainPrice'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is product image")
	public void thereIsProductImage() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/seeImgProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is a timestamp")
	public void thereIsATimestamp() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtProductTimestamp'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@When("User redirected to {string} tab page")
	public void userRedirectedToTabPage(String diminatiTabTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyDiminatiTabTitle'), [('expectedDiminatiTabTitle') : diminatiTabTitle],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to the {string} page")
	public void userRedirectedToThePage(String infoPenawarPageTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyPageTitleInfoPenawar'), [('expectedPageTitleInfoPenawar') : infoPenawarPageTitle],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is buyer image profile")
	public void thereIsBuyerImageProfile() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/seeImgProfileBuyer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There is buyer city")
	public void thereIsBuyerCity() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/readTxtKotaBuyer'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}