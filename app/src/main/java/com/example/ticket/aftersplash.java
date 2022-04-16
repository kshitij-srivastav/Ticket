package com.example.ticket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class aftersplash extends AppCompatActivity {

    Button scanqr,enternewparticipant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftersplash);
        scanqr=findViewById(R.id.scanbtn);
        scanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(aftersplash.this,qrcodescanner.class);
                startActivity(i);
                finish();
            }
        });
        enternewparticipant=findViewById(R.id.newparticipant);
        enternewparticipant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(aftersplash.this, participantdetailsentry.class);
                startActivity(i);
                finish();
            }
        });
    }


}