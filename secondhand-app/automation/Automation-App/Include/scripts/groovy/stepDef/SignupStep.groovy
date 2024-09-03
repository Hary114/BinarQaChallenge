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



class SignupStep {
	@When("User press on Daftar link")
	public void userPressOnDaftarLink() {
		Mobile.callTestCase(findTestCase('Page Objects/Masuk/tapLinkDaftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("User redirected to {string} Daftar page")
	public void userRedirectedToDaftarPage(String pageTitleDaftar) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/verifyPageTitleDaftar'), [('expectedPageTitleDaftar') : pageTitleDaftar], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input Nama field {string}")
	public void userInputNamaField(String daftarNama) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldNama'), [('nama') : daftarNama], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input Email field {string}")
	public void userInputEmailField(String daftarEmail) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldEmail'), [('email') : daftarEmail], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input Password field {string}")
	public void userInputPasswordField(String daftarPassword) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldPassword'), [('password') : daftarPassword], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input No HP field {string}")
	public void userInputNoHpField(String daftarNoHp) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldNomorHp'), [('noHp') : daftarNoHp], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input Kota field {string}")
	public void userInputKotaField(String daftarKota) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldKota'), [('kota') : daftarKota], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input Alamat field {string}")
	public void userInputAlamatField(String daftarAlamat) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/inputFieldAlamat'), [('alamat') : daftarAlamat], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User press on Daftar button")
	public void userPressOnDaftarButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar/tapBtnDaftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}