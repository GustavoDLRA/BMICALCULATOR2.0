package com.gustavodelosriosalatorregmail.bmicalculator20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public void calcular(View view) {
    EditText editHeight=(EditText) findViewById(R.id.editHeight);
    EditText editWeight=(EditText)findViewById(R.id.editWeight);
    TextView result=(TextView) findViewById(R.id.result);
    TextView view_msg=(TextView)findViewById(R.id.view_msg);

    String sHeight=editHeight.getText().toString().trim();
    String sWeight=editWeight.getText().toString().trim();
    String msg="";

    Double height=Double.parseDouble(sHeight);
    Double weight=Double.parseDouble(sWeight);
    //BMI=(weight/height*height)
    if (height>0){
        if(weight>0){
            Double bmi= weight/(height*height);
            result.setText(String.valueOf(bmi));
            if (bmi<18.5) {
                msg="Underweight. How 'bout eating some more?";
            } else if(bmi>18.5 && bmi<25){
                msg="Normal. You're doing just fine!";

            }else if (bmi>25){
                msg="Overweight. Time to hit the Gym!";
            }
            view_msg.setText(msg);
        }else{
            result.setText("Weight must be greater than 0");
        }
    }else{
        result.setText("Height must be greater than 0");
    }


}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
