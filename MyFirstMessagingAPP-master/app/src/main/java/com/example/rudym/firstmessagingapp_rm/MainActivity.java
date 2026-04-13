package com.example.rudym.firstmessagingapp_rm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference myDataBase;
    private TextView myText;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataBase = FirebaseDatabase.getInstance().getReference("Message");
        myText = findViewById(R.id.text1);
        myEditText = findViewById(R.id.editText);

        myDataBase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object value = dataSnapshot.getValue();
                myText.setText(value != null ? value.toString() : "No messages yet");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                myText.setText("Cancelled");
            }
        });
    }

    public void sendMessage(View view) {
        String message = myEditText.getText().toString().trim();
        if (!message.isEmpty()) {
            myDataBase.setValue(message);
            myEditText.setText("");
        }
    }
}
