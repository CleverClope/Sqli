package com.example.sqli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler dab = new DatabaseHandler(this);


        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");

        dab.addContact(new Contact("Ravi", "9100000000"));
        dab.addContact(new Contact("Srinivas", "9199999999"));
        dab.addContact(new Contact("Tommy", "9522222222"));
        dab.addContact(new Contact("Karthik", "9533333333"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = dab.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}