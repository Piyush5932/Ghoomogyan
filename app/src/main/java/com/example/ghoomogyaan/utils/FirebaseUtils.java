package com.example.ghoomogyaan.utils;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseUtils {
    public static String currentUserId(){
        return FirebaseAuth.getInstance().getUid();

    }
    public static DocumentReference currentDetaild(){
        return FirebaseFirestore.getInstance().collection("users").document(currentUserId());
    }
}
