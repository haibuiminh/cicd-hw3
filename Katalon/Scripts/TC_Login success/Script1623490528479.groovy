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

import com.kms.katalon.core.testobject.ConditionType as ConditionType
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login with Admin rule_login_email'), 'vunam123@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Login with Admin rule_login_password'), 'vunam')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Log in'))

TestObject blockUser = new TestObject().addProperty("xpath", ConditionType.EQUALS,"//li[@class='ant-menu-item']/div/span[contains(@class, 'ant-avatar')]");

WebUI.verifyElementVisible(blockUser, FailureHandling.STOP_ON_FAILURE)
