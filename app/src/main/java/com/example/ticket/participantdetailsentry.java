package com.example.ticket;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class participantdetailsentry extends AppCompatActivity {
    Spinner menu;
    EditText participantName,collegeName,emailAdd,phoneNum;
    TextView t1;
    AutoCompleteTextView eventdetail;
    Button b1;
    FirebaseFirestore root;
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
         root=FirebaseFirestore.getInstance();


        eventdetail=findViewById(R.id.autocompletetextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,getResources().getStringArray(R.array.eventArray));
        eventdetail.setThreshold(1);
        eventdetail.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        eventdetail.setTextColor(Color.RED);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Map<String,Object> data= new HashMap<>();
        data.put("Name",participantName.getText().toString());
        data.put("College Name",collegeName.getText().toString());
        data.put("Email Address",emailAdd.getText().toString());
        root.collection(eventdetail.getText().toString().trim())
                .add(data)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(),"Participant Registration Successfully",Toast.LENGTH_LONG).show();
                        participantName.setText("");
                        collegeName.setText("");
                        emailAdd.setText("");
                        phoneNum.setText("");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
                    }
                });
    }
});
    }
}