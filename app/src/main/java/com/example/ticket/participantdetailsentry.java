package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class participantdetailsentry extends AppCompatActivity {
    Spinner menu;
    EditText participantName,collegeName,emailAdd,phoneNum;
    TextView t1;
    AutoCompleteTextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantdetailsentry);
         //menu=findViewById(R.id.dropmenu);
         participantName=findViewById(R.id.nameedittxt);
         collegeName=findViewById(R.id.collegeedittxt);
         emailAdd=findViewById(R.id.emailedittext);
         phoneNum=findViewById(R.id.phonenumberedittxt);
         t1=findViewById(R.id.eventtext);
        //ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.eventArray, android.R.layout.simple_spinner_item);


        t2=findViewById(R.id.autocompletetextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,getResources().getStringArray(R.array.eventArray));
        t2.setThreshold(1);
        t2.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        t2.setTextColor(Color.RED);

    }
}