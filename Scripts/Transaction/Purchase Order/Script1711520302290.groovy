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

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Button'))

Windows.delay(5)

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/TreeItem'))

Windows.delay(2)

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Button(1)'))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(1)'), 'PEG101')

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/Edit(1)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.DOWN, Keys.DOWN, 
        Keys.DOWN))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.DOWN, 
        Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(2)'), '230010846')

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(2)'), 'I')

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(2)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), '6')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), '25032024')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), '25032024')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(3)'), '25032024')

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(3)'), 'I')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(3)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(5)'), 'JNE')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(5)'), Keys.chord(Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(4)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(6)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Edit(7)'), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Pane'))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(4)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(8)'), '10')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(8)'), Keys.chord(Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(9)'), '20000')

Windows.sendKeys(findWindowsObject('Edit(9)'), Keys.chord(Keys.TAB, Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(4)'), 'v')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(5)'), Keys.chord(Keys.TAB, Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(10)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(11)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Edit(12)'), Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(6)'), 'p')

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(7)'), '4')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox(7)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Edit(13)'), 'Oke Add')

/*Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Button(3)'))

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Button(4)'))

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/Button(5)'))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.ALT, Keys.DOWN))*/

