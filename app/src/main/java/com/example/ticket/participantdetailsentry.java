package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class participantdetailsentry extends AppCompatActivity {
    Spinner menu;
    EditText participantName,collegeName,emailAdd,phoneNum;
    TextView t1;
    AutoCompleteTextView t2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantdetailsentry);

         participantName=findViewById(R.id.nameedittxt);
         collegeName=findViewById(R.id.collegeedittxt);
         emailAdd=findViewById(R.id.emailedittext);
         phoneNum=findViewById(R.id.phonenumberedittxt);
         t1=findViewById(R.id.eventtext);
         b1=findViewById(R.id.submitbtn);


        t2=findViewById(R.id.autocompletetextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,getResources().getStringArray(R.array.eventArray));
        t2.setThreshold(1);
        t2.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        t2.setTextColor(Color.RED);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"Button press",Toast.LENGTH_LONG).show();
    }
});
    }
}