package com.example.ghoomogyaan;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hbb20.CountryCodePicker;

public class Login extends AppCompatActivity {
CountryCodePicker ccp;
    EditText Mobile;
    Button Otp_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ccp=findViewById(R.id.CCP);
        Mobile=findViewById(R.id.mobile);
        Otp_btn=findViewById(R.id.otp_btn);
ccp.registerCarrierNumberEditText(Mobile);
Otp_btn.setOnClickListener((v) ->{
    if (!ccp.isValidFullNumber()){
        Mobile.setError("Not Valid Number");
        return;
    }
    Intent intent=new Intent(Login.this,Otp.class);
    intent.putExtra("phone",ccp.getFullNumberWithPlus());
    startActivity(intent);
} );
    }
}
