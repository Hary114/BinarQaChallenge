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



class OrderListStep {
	@Given("User press on Pesanan Saya button")
	public void userPressOnPesananSayaButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Akun Saya/tapBtnPesananSaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to {string} Pesanan Saya page")
	public void userRedirectedToPesananSayaPage(String pageTitlePesananSaya) {
		Mobile.callTestCase(findTestCase('Page Objects/Pesanan Saya/verifyPesananSayaPageTitle'), [('inputtedPageTitle') : pageTitlePesananSaya], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see Order List")
	public void userSeeOrderList() {
		Mobile.callTestCase(findTestCase('Page Objects/Pesanan Saya/readOrderList'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Status Penawaran Produk")
	public void thereAreStatusPenawaranProduk() {
		Mobile.callTestCase(findTestCase('Page Objects/Pesanan Saya/seeTxtOrderStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Product Name")
	public void thereAreProductName() {
		Mobile.callTestCase(findTestCase('Page Objects/Pesanan Saya/seeTxtProductOrderName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("There are Harga Tawar")
	public void thereAreHargaTawar() {
		Mobile.callTestCase(findTestCase('Page Objects/Pesanan Saya/seeTxtProductOrderPrice'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}