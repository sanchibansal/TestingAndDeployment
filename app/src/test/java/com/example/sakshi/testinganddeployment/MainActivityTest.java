package com.example.sakshi.testinganddeployment;

import android.test.ActivityInstrumentationTestCase;
import android.widget.EditText;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by sakshi on 7/15/2017.
 */

public class MainActivityTest extends TestCase {


    @Test
    public void testemailvalidator(){
        //creating main activity's object
        MainActivity main = new MainActivity();
        //checking result in the checkemail method in MainActivity
        boolean result = main.checkemail("name@gmail.com");
        assertEquals(true,result);
    }
    @Test
    public void testpasswordvalidator(){
        MainActivity main = new MainActivity();
        //checking result in the checkpassword method in MainActivity
        boolean result = main.checkpassword("acadgild123#");
        assertEquals(true,result);

    }
}
