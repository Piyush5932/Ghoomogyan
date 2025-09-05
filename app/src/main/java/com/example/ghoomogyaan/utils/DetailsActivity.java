package com.example.ghoomogyaan.utils;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ghoomogyaan.R;
import com.example.ghoomogyaan.model.TopPlacesData;

public class DetailsActivity extends AppCompatActivity {
    TextView location, price, title, description;
    ImageView bg, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initView();
        setVariable();
    }

    private void setVariable() {
        TopPlacesData topPlacesData = (TopPlacesData) getIntent().getSerializableExtra("object");
        if (topPlacesData != null) {
            title.setText(topPlacesData.getPlaceName());
            price.setText(topPlacesData.getPrice());
            location.setText(topPlacesData.getLocality());
            description.setText(topPlacesData.getDescription());
            bg.setImageResource(topPlacesData.getBackg());
        }
        back.setOnClickListener(v -> finish());
    }

    private void initView() {
        location = findViewById(R.id.location);
        price = findViewById(R.id.pricetxt);
        title = findViewById(R.id.titletxt);
        description = findViewById(R.id.desc);
        bg = findViewById(R.id.place_bg);
        back = findViewById(R.id.backbtn); // Add this line
    }

}
