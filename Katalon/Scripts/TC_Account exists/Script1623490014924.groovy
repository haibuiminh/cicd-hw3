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

WebUI.navigateToUrl('http://hw3cicd-env.eba-iwmywpxm.ap-southeast-1.elasticbeanstalk.com/admin/register')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_E-mail_register_email'), 'vunam1218@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Full name_register_fullname'), 'vunam')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Password_register_password'), 'vunam')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Confirm Password_register_confirm'), 'vunam')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_React App/span_email vunam1218gmail.com  tn ti'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser();