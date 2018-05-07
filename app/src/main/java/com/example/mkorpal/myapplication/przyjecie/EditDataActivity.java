package com.example.mkorpal.myapplication.przyjecie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mkorpal.myapplication.R;

public class EditDataActivity extends AppCompatActivity {

    private static final String TAG = "EditDataActivity";

    private ImageButton btnDelete;
    private ImageButton btnSave;

    private EditText editabable_item;
    MyDBHandler dbHandler;

    private String selectedName;
    private  int selectedID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        btnSave = (ImageButton)findViewById(R.id.btnSave);
        btnDelete = (ImageButton) findViewById(R.id.btnDelete);
        editabable_item = (EditText) findViewById(R.id.editabable_item);
        dbHandler = new MyDBHandler(this, null, null, 1);

        Intent receivedIntent = getIntent();

        selectedID = receivedIntent.getIntExtra("id", -1);
        selectedName = receivedIntent.getStringExtra("name");

        editabable_item.setText(selectedName);

        // THIS IS METHOD
       btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = editabable_item.getText().toString();
                if(!item.equals("")){
                dbHandler.updateName(item,selectedID,selectedName);
                }else{
                    Toast.makeText(EditDataActivity.this, "Wprowadź jakaś wartość", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
