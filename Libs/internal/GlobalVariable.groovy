package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object key
     
    /**
     * <p></p>
     */
    public static Object toDate
     
    /**
     * <p></p>
     */
    public static Object fromDate
     
    /**
     * <p></p>
     */
    public static Object deleteKeyValueId
     
    /**
     * <p></p>
     */
    public static Object partyId
     
    /**
     * <p></p>
     */
    public static Object url
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseUrl = selectedVariables['baseUrl']
            key = selectedVariables['key']
            toDate = selectedVariables['toDate']
            fromDate = selectedVariables['fromDate']
            deleteKeyValueId = selectedVariables['deleteKeyValueId']
            partyId = selectedVariables['partyId']
            url = selectedVariables['url']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
