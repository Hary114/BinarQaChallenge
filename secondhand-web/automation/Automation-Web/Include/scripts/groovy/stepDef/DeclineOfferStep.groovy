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

class DeclineOfferStep {
	@When("User click on the bell icon")
	public void userClickOnTheBellIcon() {
		WebUI.callTestCase(findTestCase('Page Objects/Top Navbar/clickIconBellNotification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Lihat semua notifikasi link")
	public void userClickOnLihatSemuaNotifikasiLink() {
		WebUI.callTestCase(findTestCase('Page Objects/Notification List/clickLinkLihatSemuaNotifikasi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to notification list page")
	public void userRedirectedToNotificationListPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Notification Page/verifyNotificationPage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on product name {string}")
	public void userClickOnProductName(String produkInfo) {
		WebUI.callTestCase(findTestCase('Page Objects/searchFunction/searchFunctionNotification'), [('expected') : produkInfo], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User redirected to {string} page title")
	public void userRedirectedToPageTitle(String infoPenawarPageTitle) {
		WebUI.callTestCase(findTestCase('Test Cases/Page Objects/Info Penawar Page/verifyTxtInfoPenawarPageTitle'), [('expected') : infoPenawarPageTitle], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Tolak button")
	public void userClickOnTolakButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar Page/clickBtnTolak'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see label change to {string} on the product subject")
	public void userSeeLabelChangeToOnTheProductSubject(String statusDitolak) {
		WebUI.callTestCase(findTestCase('Page Objects/Info Penawar Page/verifyTxtStatusPenawaranProdukDitolak'), [('statusProdukDitolak') : statusDitolak],
		FailureHandling.STOP_ON_FAILURE)
	}
}