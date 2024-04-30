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

Windows.startApplicationWithTitle('C:\\Users\\0763\\AppData\\Local\\Apps\\2.0\\ZTGJB69O.6D0\\0619G7T3.CD2\\erpdh18_10143d40e66e15a7_0003.0003_cf2d45f845234fbe\\MgxpaRIA.exe', 
    'ERP Iglo')

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), Keys.chord(Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(19)'), 'Ini Juga Komentar')

