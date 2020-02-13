package com.example.javawishlistv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ListCreatorWishlistV2 extends AppCompatActivity {

    EditText nameList, descriptionList;
    ImageButton addToList;
    Button  doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_creator_wishlist_v2);

        nameList = findViewById(R.id.listName);
        descriptionList = findViewById(R.id.listDescription);
        addToList = findViewById(R.id.addItem);
        doneBtn = findViewById(R.id.btnDone);

        addToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameList.getText().toString().trim();
                String description = descriptionList.getText().toString().trim();


            }
        });

    }
}
