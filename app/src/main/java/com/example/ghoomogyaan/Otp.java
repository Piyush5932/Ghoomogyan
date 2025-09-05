package com.example.ghoomogyaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ghoomogyaan.utils.AndroidUtil;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthSettings;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.TimeUnit;

public class Otp extends AppCompatActivity {
    String phoneNumber;
    String verificationCode;
    PhoneAuthProvider.ForceResendingToken forceResendingToken;
    EditText otpEditText;
    Long timeout = 60L;
    ProgressBar progressBar;
    Button verifyButton;
    FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        otpEditText = findViewById(R.id.otp);
        progressBar = findViewById(R.id.prg_btn);
        verifyButton = findViewById(R.id.otp_btn);

        // Get FirebaseAuthSettings object
        FirebaseAuthSettings firebaseAuthSettings = mAuth.getFirebaseAuthSettings();

        // Set reCAPTCHA flow for testing to true
        firebaseAuthSettings.forceRecaptchaFlowForTesting(true);

        phoneNumber = getIntent().getStringExtra("phone");
        sendOtp(phoneNumber, false);

        verifyButton.setOnClickListener(v -> {
            String enteredOtp = otpEditText.getText().toString();
            PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationCode, enteredOtp);
            signInWithCredential(credential);
            setInProgress(true);
        });
    }

    void sendOtp(String phoneNumber, boolean isResend) {
        setInProgress(true);
        PhoneAuthOptions.Builder builder =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber(phoneNumber)
                        .setTimeout(timeout, TimeUnit.SECONDS)
                        .setActivity(this)
                        .setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                signInWithCredential(phoneAuthCredential);
                                setInProgress(false);
                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                AndroidUtil.showToast(getApplicationContext(), "OTP verification failed");
                                setInProgress(false);
                            }

                            @Override
                            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken token) {
                                super.onCodeSent(s, token);
                                verificationCode = s;
                                forceResendingToken = token;
                                AndroidUtil.showToast(getApplicationContext(), "OTP sent Successfully");
                                setInProgress(false);
                            }
                        });
        if (isResend) {
            PhoneAuthProvider.verifyPhoneNumber(builder.setForceResendingToken(forceResendingToken).build());
        } else {
            PhoneAuthProvider.verifyPhoneNumber(builder.build());
        }
    }

    void setInProgress(boolean inProgress) {
        if (inProgress) {
            progressBar.setVisibility(View.VISIBLE);
            verifyButton.setVisibility(View.GONE);
        } else {
            progressBar.setVisibility(View.GONE);
            verifyButton.setVisibility(View.VISIBLE);
        }
    }

    void signInWithCredential(PhoneAuthCredential phoneAuthCredential) {
        setInProgress(true);
        mAuth.signInWithCredential(phoneAuthCredential).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Intent intent = new Intent(Otp.this, username_activity.class);
                intent.putExtra("phone", phoneNumber);
                startActivity(intent);
            } else {
                AndroidUtil.showToast(getApplicationContext(), "OTP verification failed");
            }
        });
    }
}
