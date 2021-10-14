package com.example.practicat3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*public class ButtonClick implements View.OnClickListener{

        @Override
        public void onClick(View v){

            Log.i("MAIN_APP","click en el boton");
        }*/

    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.btnChangeText);
        Button buttonSms=findViewById(R.id.btnSMS);

        View.OnClickListener ButtonClick =new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText input=findViewById(R.id.inputHello);
                String value=String.valueOf(input.getText());
                Log.i("MAIN_APP","El valor de input es: " + value);

                String phoneNo = value;//The phone number you want to text
                String sms= "";//The message you want to text to the phone

                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
                smsIntent.putExtra("sms_body",sms);
                startActivity(smsIntent);
            }
        };
        buttonSms.setOnClickListener(ButtonClick);

        View.OnClickListener ButtonClick2 =new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText input=findViewById(R.id.inputHello);
                String value=String.valueOf(input.getText());
                Log.i("MAIN_APP","El valor de input es: " + value);

                //pasar a otra actividad
                /*Intent intent=new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("value",value);
                startActivity(intent);*/

                //LLAMAR POR TELEFONO

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", value, null));
                startActivity(intent);

            }
        };
        button.setOnClickListener(ButtonClick2);


    }
}