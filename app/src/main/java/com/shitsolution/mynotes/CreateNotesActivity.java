package com.shitsolution.mynotes;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreateNotesActivity extends AppCompatActivity {

    View subtitleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_notes);

        subtitleIndicator = findViewById(R.id.subtitleIndicatorID);
        subtitleIndicator.setBackgroundColor(Color.parseColor("#FABE2B"));
    }
}