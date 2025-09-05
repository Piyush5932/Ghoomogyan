package com.example.ghoomogyaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ghoomogyaan.model.Usermodel;
import com.example.ghoomogyaan.utils.FirebaseUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentSnapshot;

public class username_activity extends AppCompatActivity {
EditText usr_input;
Button Confirm;
ProgressBar prg_bar;
String phoneNumber;
Usermodel usermodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_username);
        usr_input=findViewById(R.id.username);
        Confirm=findViewById(R.id.confirm_button);
        prg_bar=findViewById(R.id.prg_btn);

        phoneNumber=getIntent().getExtras().getString("phone");
    getUsername();
    Confirm.setOnClickListener((v -> {

        setUsername();
    }));

    }

    void setUsername() {
    String username= usr_input.getText().toString();
    if (username.isEmpty()||username.length()<3){
    usr_input.setError("Username must contain 3 letters");
    return;
    }
        setInProgress(true);

    if (usermodel!=null){
        usermodel.setUsername(username);
    }
    else {
        usermodel=new Usermodel(phoneNumber,username,Timestamp.now());
    }

    FirebaseUtils.currentDetaild().set(usermodel).addOnCompleteListener(new OnCompleteListener<Void>() {
        @Override
        public void onComplete(@NonNull Task<Void> task) {
            setInProgress(false);
            if (task.isSuccessful()){
                Intent intent=new Intent(username_activity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }
    });

}


    void getUsername(){
setInProgress(true);
    FirebaseUtils.currentDetaild().get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
        @Override
        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
            setInProgress(false);
            if(task.isSuccessful()){
                 usermodel=task.getResult().toObject(Usermodel.class);
                if (usermodel!=null){
                    usr_input.setText(usermodel.getUsername());
                }
            }
        }
    });
}


    void setInProgress(boolean inProgress){
        if (inProgress){
            prg_bar.setVisibility(View.VISIBLE);
            Confirm.setVisibility(View.GONE);
        }
        else {
            prg_bar.setVisibility(View.GONE);
            Confirm.setVisibility(View.VISIBLE);
        }
    }
}