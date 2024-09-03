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



class EditProfileStep {
	@When("User click on user profile name")
	public void userClickOnUserProfileName() {
		WebUI.callTestCase(findTestCase('Page Objects/Dropdown Menu Account/clickLinkUserProfileName'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to {string} LIA page")
	public void userRedirectedToLiaPage(String infoAkunPage) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/verifyTxtLengkapiInfoAkunPageTitle'), [('expected') : infoAkunPage],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User upload profile image file")
	public void userUploadProfileImageFile() {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/uploadImgProfilSaya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Nama field {string}")
	public void userInputNamaField(String name) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldNama'), [('Nama') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select {string} from dropdown menu")
	public void userSelectFromDropdownMenu(String namaKota) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/selectPilihKota'), [('kota') : namaKota], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input Alamat field {string}")
	public void userInputAlamatField(String editAlamat) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldAlamat'), [('alamat') : editAlamat], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input No Handphone field {string}")
	public void userInputNoHandphoneField(String noHP) {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/inputFieldNoHandphone'), [('Handphone') : noHP], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click on Simpan button")
	public void userClickOnSimpanButton() {
		WebUI.callTestCase(findTestCase('Page Objects/Lengkapi Info Akun/clickBtnSimpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}