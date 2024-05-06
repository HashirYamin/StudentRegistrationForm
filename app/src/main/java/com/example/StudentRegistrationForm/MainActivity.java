package com.example.StudentRegistrationForm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName, middleName, lastName;
    Spinner selectCourse;
    RadioGroup radioSelectGender;
    EditText phone, phoneNo, address, email, password, reTypePassword;

    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName=findViewById(R.id.firstname);
        middleName=findViewById(R.id.middle_name);
        lastName=findViewById(R.id.last_name);
        selectCourse=findViewById(R.id.course_spinner);
        radioSelectGender=findViewById(R.id.gender_radio_group);

        phone=findViewById(R.id.phone);
        phoneNo=findViewById(R.id.phone_no);
        address=findViewById(R.id.address);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        reTypePassword=findViewById(R.id.re_type_password);
        register=findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShowData.class);
                intent.putExtra("FirstName", firstName.getText().toString());
                intent.putExtra("MiddleName", middleName.getText().toString());
                intent.putExtra("LastName", lastName.getText().toString());
                intent.putExtra("Course", selectCourse.getSelectedItem().toString());
                intent.putExtra("Phone", phone.getText().toString());
                intent.putExtra("PhoneNo", phoneNo.getText().toString());
                intent.putExtra("Address", address.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                intent.putExtra("Password", password.getText().toString());
                intent.putExtra("RetypePassword", reTypePassword.getText().toString());

                int selectedGenderId = radioSelectGender.getCheckedRadioButtonId();
                RadioButton selectedGenderButton = findViewById(selectedGenderId);
                String selectedGender = selectedGenderButton.getText().toString();
                intent.putExtra("Gender", selectedGender);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Student Successfully Registered ", Toast.LENGTH_SHORT).show();
            }
        });

        Spinner selectCourse = findViewById(R.id.course_spinner);
        String[] courses = {"Numerical Analysis", "Mobile Application Development", "Web Engineering", "Artificial Intelligence", "Compiler Construction"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectCourse.setAdapter(adapter);
    }
}