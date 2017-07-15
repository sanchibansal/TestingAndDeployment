package com.example.sakshi.testinganddeployment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email, pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  email=(EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
*/
    }
    public boolean checkemail( String test){

        if(test.contains("@gmail.com")){
            //returns true if the string has @gmail.com in it
            return true;
        }
        else{
            //it returns false if not
            return false;
        }
    }
    public boolean checkpassword(String test){
        if(test.contains("123#")){
         //returns true if the password contains 123# in it   
            return true;
        }
        else{
            //returns false if not
            return false;
        }
    }

}
