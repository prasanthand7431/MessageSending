package com.example.gspl.message_sending;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    String number, smsmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

    }

    public void sendsms(View view) {
        number = editText1.getText().toString();
        smsmsg = editText2.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage(number, null, smsmsg, null, null); //we need to add permission in manifest file to send sms

        Toast.makeText(this, "Sms Send successfully!", Toast.LENGTH_SHORT).show();
    }
}