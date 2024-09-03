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



class NotifikasiStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User press on the bell icon on the navbar")
	public void userPressOnTheBellIconOnTheNavbar() {
		Mobile.callTestCase(findTestCase('Page Objects/Bottom Navbar/tapBtnNotifikasi'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	//	@When("User see product name")
	//	public void userSeeProductName() {
	//		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/readTxtNamaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	//	}
	//
	//	@When("User see product price")
	//	public void userSeeProductPrice() {
	//		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/readTxtHargaProduk'), [:], FailureHandling.STOP_ON_FAILURE)
	//	}
	//
	//	@When("User see product price offer")
	//	public void userSeeProductPriceOffer() {
	//		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/readTxtHargaTawar'), [:], FailureHandling.STOP_ON_FAILURE)
	//	}
	//
	//	@Then("User see notification timestamp")
	//	public void userSeeNotificationTimestamp() {
	//		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/readTxtTimeStamp'), [:], FailureHandling.STOP_ON_FAILURE)
	//	}

	@When("User redirected to the {string} Notifikasi page")
	public void userRedirectedToTheNotifikasiPage(String teksNotifikasiTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/verifyTxtPageTitleNotifikasi'), [('expectedNotifikasiTitlePage') : teksNotifikasiTitle],
		FailureHandling.STOP_ON_FAILURE)
	}
	@When("There is notification subject {string} berhasil diterbitkan")
	public void thereIsNotificationSubjectBerhasilDiterbitkan(String teksBerhasilDiterbitkan) {
		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/verifyTxtStatusBerhasilDiterbitkan'), [('expectedStatusBerhasilDiterbitkan') : teksBerhasilDiterbitkan],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("There is notification subject {string} penawaran produk")
	public void thereIsNotificationSubjectPenawaranProduk(String teksPenawaranProduk) {
		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/verifyTxtStatusPenawaranProduk'), [('expectedStatusPenawaranProduk') : teksPenawaranProduk],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see Notifikasi list")
	public void userSeeNotifikasiList() {
		Mobile.callTestCase(findTestCase('Page Objects/Notifikasi/readNotifikasiList'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}