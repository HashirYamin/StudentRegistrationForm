package com.example.StudentRegistrationForm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    TextView showDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        showDetails=findViewById(R.id.showing_details);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FirstName");
        String middleName = intent.getStringExtra("MiddleName");
        String lastName = intent.getStringExtra("LastName");
        String course = intent.getStringExtra("Course");
        String phone = intent.getStringExtra("Phone");
        String phoneNo = intent.getStringExtra("PhoneNo");
        String address = intent.getStringExtra("Address");
        String email = intent.getStringExtra("Email");
        String password = intent.getStringExtra("Password");
        String retypePassword = intent.getStringExtra("RetypePassword");

        showDetails.setText("First Name: " + firstName + "\n" +
                "Middle Name: " + middleName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Course: " + course + "\n" +
                "Phone: " + phone + "\n" +
                "Phone No: " + phoneNo + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Retype Password: " + retypePassword);

    }
}