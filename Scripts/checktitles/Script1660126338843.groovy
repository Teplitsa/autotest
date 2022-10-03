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

WebUI.navigateToUrl('http://kandinsky-wordpress-20.tw1.ru/wp-login.php?redirect_to=http%3A%2F%2Fkandinsky-wordpress-20.tw1.ru%2Fwp-admin%2F&reauth=1')

WebUI.setText(findTestObject('Object Repository/Authen/Page_WordPress/input_email_log'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Authen/Page_WordPress/input__pwd'), 'syB9O6Ob7jNhUPvsoTfTNw==')

WebUI.click(findTestObject('Object Repository/Authen/Page_WordPress/input__rememberme'))

WebUI.click(findTestObject('Object Repository/Authen/Page_WordPress/input__wp-submit'))

//WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/div_'))
WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a_'))

WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a__1'))

WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a__1_2'))

WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a__1_2_3'))

WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/titles/Page_WordPress/a__1_2_3_4_5'))

