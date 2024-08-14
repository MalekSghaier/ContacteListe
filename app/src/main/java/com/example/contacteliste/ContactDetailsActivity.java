package com.example.contacteliste;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailsActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView phoneNumberTextView;
    private TextView emailTextView;
    private TextView websiteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        nameTextView = findViewById(R.id.name_text_view);
        phoneNumberTextView = findViewById(R.id.phone_number_text_view);
        emailTextView = findViewById(R.id.email_text_view);
        websiteTextView = findViewById(R.id.website_text_view);

        // Retrieve the contact object from the intent
        Contact contact = (Contact) getIntent().getSerializableExtra("contact");

        // Display the contact details
        nameTextView.setText(contact.getName());
        phoneNumberTextView.setText(contact.getPhoneNumber());
        emailTextView.setText(contact.getEmail());
        websiteTextView.setText(contact.getWebsite());
    }
}
