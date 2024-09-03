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

import common.ListAction
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



class ProductListDiminatiEditStep {
	@When("User click on burger button on the navbar")
	public void userClickOnBurgerButtonOnTheNavbar() {
		WebUI.callTestCase(findTestCase('Page Objects/Top Navbar/clickIconBurger'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to {string} DJS page")
	public void userRedirectedToDjsPage(String djsTitlePage) {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/verifyTxtPageDaftarJualSayaTitle'), [('expectedTitlePageDJS') : djsTitlePage],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on menu Diminati")
	public void userClickOnMenuDiminati() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickLinkDiminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on product name diminati {string}")
	public void userClickOnProductNameDiminati(String namaProduk) {
		WebUI.callTestCase(findTestCase('Page Objects/searchFunction/searchFunction'), [('name') : namaProduk], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click on Edit button")
	public void userClickOnEditButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/clickBtnEdit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to edit product page")
	public void userRedirectedToEditProductPage() {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail Edit/verifyFormEdit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to product detail edit diminati page {string}")
	public void userRedirectedToProductDetailEditDiminatiPage(String namaProdukEdit) {
		WebUI.callTestCase(findTestCase('Page Objects/Product Detail Daftar Jual Saya/verifyNamaProduk'), [('expected') : namaProdukEdit],
		FailureHandling.STOP_ON_FAILURE)
	}

	//	@Then("There is {string} error message below {string} field")
	//	public void thereIsErrorMessageBelowField(String string, String string2) {
	//	}
}