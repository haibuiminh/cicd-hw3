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

WebUI.navigateToUrl('http://hw3cicd-env.eba-iwmywpxm.ap-southeast-1.elasticbeanstalk.com/admin/register')

TestObject password = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//input[@id=\'register_password\']');
TestObject confirmPassword = new TestObject().addProperty("xpath", ConditionType.EQUALS,'//input[@id=\'register_confirm\']');

WebUI.setText(password, 'vunam123');
WebUI.setText(confirmPassword, 'vunam');

WebUI.verifyElementVisible( findTestObject('Object Repository/Page_React App/div_Two passwords that you enter is inconsistent'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser();
