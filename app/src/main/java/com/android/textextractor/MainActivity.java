package com.android.textextractor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRelevantActivity(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.aadharCardView:
                Intent aIntent = new Intent(this, AadharCardActivity.class);
                startActivity(aIntent);
                break;

            case R.id.panCardView:
                Intent panIntent = new Intent(this, PanCardActivity.class);
                startActivity(panIntent);
                break;

            case R.id.genericCardView:
                Intent genericIntent = new Intent(this, GenericIdCardActivity.class);
                startActivity(genericIntent);
                break;
        }
    }
}