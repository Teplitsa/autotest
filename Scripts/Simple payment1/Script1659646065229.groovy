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

WebUI.navigateToUrl('http://kandinsky-wordpress-20.tw1.ru/campaign/obychnyj-nuzhna-pomoshh/')

WebUI.click(findTestObject('Object Repository/Page_-/label__leyka-star-field-frame_1'))

WebUI.setText(findTestObject('Object Repository/Page_-/input__leyka_donor_email'), 'info@kingsite.pro')

WebUI.click(findTestObject('FIO/Page_-/label_email_leyka-star-field-frame'))

WebUI.setText(findTestObject('Object Repository/Page_-/input_email_leyka_donor_name'), 'test')

WebUI.click(findTestObject('Object Repository/Page_-/input__leyka_agree'))

WebUI.click(findTestObject('Object Repository/Page_-/input__leyka_agree_pd'))

WebUI.click(findTestObject('Object Repository/Page_-/input__leyka-default-submit'))

