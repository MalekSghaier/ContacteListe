package com.example.contacteliste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Create a list of contact objects
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("STEG TUNISIE", "+216 73 503 371", "stegtunisie@gmail.com", "www.steg.com.tn"));
        contacts.add(new Contact("SONED", "+216 75 295 578", "soned@gmail.com.tn", "www.soned.com.tn"));
        contacts.add(new Contact("CNSS", "+216 75 225 487", "cnss@gmail.com", "www.cnss.com.tn"));
        contacts.add(new Contact("CNAM", "+216 75 385 097", "cnam@gmail.com", "www.cnam.com.tn"));

        // Create a custom adapter and set it to the list view
        CustomAdapter adapter = new CustomAdapter(this, contacts);
        listView.setAdapter(adapter);

        // Set a click listener for the list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected contact
                Contact selectedContact = contacts.get(position);

                // Start a new activity to display the contact details
                Intent intent = new Intent(MainActivity.this, ContactDetailsActivity.class);
                intent.putExtra("contact", selectedContact);
                startActivity(intent);
            }
        });
    }
}






