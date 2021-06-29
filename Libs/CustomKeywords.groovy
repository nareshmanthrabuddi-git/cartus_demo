
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize

import com.relevantcodes.extentreports.ExtentReports

import org.openqa.selenium.WebDriver

import com.relevantcodes.extentreports.ExtentTest



def static "utility.Utility.executeJavaScript"(
    	String javascript	) {
    (new utility.Utility()).executeJavaScript(
        	javascript)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.katalon.plugin.keyword.extentReport.Extent.startExtentTest"(
    	String testCaseID	
     , 	String testCaseDescription	
     , 	ExtentReports extent	) {
    (new com.katalon.plugin.keyword.extentReport.Extent()).startExtentTest(
        	testCaseID
         , 	testCaseDescription
         , 	extent)
}


def static "com.katalon.plugin.keyword.extentReport.Extent.getScreeshot"(
    	WebDriver driver	
     , 	String suiteID	
     , 	String testCaseID	) {
    (new com.katalon.plugin.keyword.extentReport.Extent()).getScreeshot(
        	driver
         , 	suiteID
         , 	testCaseID)
}


def static "com.katalon.plugin.keyword.extentReport.Extent.tearDownTest"(
    	WebDriver driver	
     , 	ExtentReports extent	
     , 	ExtentTest extentTest	) {
    (new com.katalon.plugin.keyword.extentReport.Extent()).tearDownTest(
        	driver
         , 	extent
         , 	extentTest)
}


def static "com.katalon.plugin.keyword.extentReport.Extent.setupExtentReport"(
    	String testCaseID	) {
    (new com.katalon.plugin.keyword.extentReport.Extent()).setupExtentReport(
        	testCaseID)
}


def static "com.katalon.plugin.keyword.extentReport.Extent.tearDownSuiteReport"(
    	ExtentReports extent	
     , 	ExtentTest extentTest	) {
    (new com.katalon.plugin.keyword.extentReport.Extent()).tearDownSuiteReport(
        	extent
         , 	extentTest)
}
