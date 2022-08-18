import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kandinsky-wordpress-20.tw1.ru/campaign/platezh-s-doppolyami/')

WebUI.click(findTestObject('Object Repository/mycustom/Page_-/span_email'))

WebUI.setText(findTestObject('Object Repository/mycustom/Page_-/input_email_leyka_donor_email'), 'info@kingsite.pro')

WebUI.click(findTestObject('Object Repository/mycustom/Page_-/span_'))

WebUI.setText(findTestObject('Object Repository/mycustom/Page_-/input__leyka_donor_name'), 'test')

WebUI.click(findTestObject('Object Repository/mycustom/Page_-/span__1'))

WebUI.setText(findTestObject('Object Repository/mycustom/Page_-/input__leyka_eto-tekst_1'), 'text')

WebUI.click(findTestObject('2New Folder2/Page_-/span_'))

WebUI.setText(findTestObject('2New Folder2/Page_-/input__leyka_telefon'), '70001112233')

//WebUI.click(findTestObject('Object Repository/mycustom/Page_-/span__1_2'))
// WebUI.setText(findTestObject('Object Repository/mycustom/Page_-/input__leyka_telefon'), '12223334455')
WebUI.click(findTestObject('1New Folder1/Page_-/div_'))

WebUI.setText(findTestObject('1New Folder1/Page_-/input__leyka_data'), '11223333')

WebUI.click(findTestObject('Object Repository/mycustom/Page_-/label_'))

WebUI.click(findTestObject('persdataaccept/Page_-/label_'))

WebUI.click(findTestObject('Simple Pay,en/Page_-/input__leyka-default-submit'))

