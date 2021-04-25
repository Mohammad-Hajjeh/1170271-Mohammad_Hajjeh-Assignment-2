package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class SecondActivity extends AppCompatActivity {
    Spinner countrySpinner;
    Spinner yearSpinner;
    Spinner monthSpinner;
    Spinner daySpinner;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioMale;
    RadioButton radioFemale;
    EditText emailAddressInputField;
    EditText addressInputField;
    EditText firstNameInputField;
    EditText lastNameInputField;
    EditText phoneNumberInputField;
    String text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        emailAddressInputField = (EditText) findViewById(R.id.emailAddressInput);
        addressInputField = (EditText) findViewById(R.id.emailAddressInput2);
        firstNameInputField = (EditText) findViewById(R.id.firstNameInput);
        lastNameInputField = (EditText) findViewById(R.id.lastNameInput);
        phoneNumberInputField = (EditText) findViewById(R.id.phoneNumberInput);
        monthSpinner = (Spinner) findViewById(R.id.spinnerMonth);
        countrySpinner = (Spinner) findViewById(R.id.spinnerCountry);
        daySpinner = (Spinner) findViewById(R.id.spinnerDay);
        yearSpinner = (Spinner) findViewById(R.id.spinnerYear);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioMale = (RadioButton) findViewById(R.id.radioButtonMale);
        radioFemale = (RadioButton) findViewById(R.id.radioButtonFemale);
        radioMale.toggle();
        populateSpinner1();
        populateSpinner2();
        Intent intent = getIntent();
        text2=intent.getStringExtra("TEXT2");

    }

    private void populateSpinner1() {
        ArrayList<String> arrayListCountry = new ArrayList<>();
        arrayListCountry.add("Country");
        arrayListCountry.add("Jenin");
        arrayListCountry.add("Tubas");
        arrayListCountry.add("Tulkarm");
        arrayListCountry.add("Nablus");
        arrayListCountry.add("Qalqiliya");
        arrayListCountry.add("Ramallah & Al-Bireh");
        arrayListCountry.add("Jericho & Al Aghwar");
        arrayListCountry.add("Jerusalem");
        arrayListCountry.add("Bethlehem");
        arrayListCountry.add("Hebron");
        arrayListCountry.add("North Gaza");
        arrayListCountry.add("Gaza");
        arrayListCountry.add("Deir Al-Balah");
        arrayListCountry.add("Khan Yunis");
        arrayListCountry.add("Rafah");
        ArrayAdapter<String> arrayAdapterCountry = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListCountry);
        countrySpinner.setAdapter(arrayAdapterCountry);

    }

    private void populateSpinner2() {
        ArrayList<String> arrayListMonth = new ArrayList<>();
        arrayListMonth.add("Month");
        arrayListMonth.add("January ");
        arrayListMonth.add("February");
        arrayListMonth.add("March");
        arrayListMonth.add("April");
        arrayListMonth.add("May");
        arrayListMonth.add("June");
        arrayListMonth.add("July");
        arrayListMonth.add("August");
        arrayListMonth.add("September");
        arrayListMonth.add("October");
        arrayListMonth.add("November");
        arrayListMonth.add("December");
        ArrayAdapter<String> arrayAdapterMonth = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListMonth);
        monthSpinner.setAdapter(arrayAdapterMonth);
        ArrayList<String> arrayListDay = new ArrayList<>();
        arrayListDay.add("Day");
        for(int i=1;i<=31;i++)
            arrayListDay.add(i+"");
        ArrayAdapter<String> arrayAdapterDay = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListDay);
        daySpinner.setAdapter(arrayAdapterDay);
        ArrayList<String> arrayListYear= new ArrayList<>();
        arrayListYear.add("Year");
        for(int i = Calendar.getInstance().get(Calendar.YEAR); i>=0; i--)
            arrayListYear.add(i+"");
        ArrayAdapter<String> arrayAdapterYear = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrayListYear);
        yearSpinner.setAdapter(arrayAdapterYear);
    }
    public void exit_onClick(View view) {

        onBackPressed();
    }

    public void continue_onClick(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        intent.putExtra("TEXT3",text2);
        intent.putExtra("NAME",firstNameInputField.getText()+" "+lastNameInputField.getText());
        intent.putExtra("EMAIL",emailAddressInputField.getText().toString());
        intent.putExtra("PHONE",phoneNumberInputField.getText().toString());
        intent.putExtra("MONTH",monthSpinner.getSelectedItem().toString());
        intent.putExtra("DAY",daySpinner.getSelectedItem().toString());
        intent.putExtra("YEAR",yearSpinner.getSelectedItem().toString());
        intent.putExtra("COUNTRY",countrySpinner.getSelectedItem().toString());
        intent.putExtra("GENDER",radioButton.getText());
        intent.putExtra("ADDRESS",addressInputField.getText().toString().trim());
        if(firstNameInputField.getText().toString().isEmpty())
            Toast.makeText(this, "Fill First Name", Toast.LENGTH_SHORT).show();
        else if(lastNameInputField.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Last Name", Toast.LENGTH_SHORT).show();
        else if(emailAddressInputField.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Email Address", Toast.LENGTH_SHORT).show();
        else if(phoneNumberInputField.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Number", Toast.LENGTH_SHORT).show();
        else if(addressInputField.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Address", Toast.LENGTH_SHORT).show();
        else if(monthSpinner.getSelectedItem().toString().equalsIgnoreCase("Month"))
            Toast.makeText(this, "Fill Month Of Birthday", Toast.LENGTH_SHORT).show();
        else if(daySpinner.getSelectedItem().toString().equalsIgnoreCase("Day"))
            Toast.makeText(this, "Fill Day Of Birthday", Toast.LENGTH_SHORT).show();
        else if(yearSpinner.getSelectedItem().toString().equalsIgnoreCase("Year"))
            Toast.makeText(this, "Fill Year Of Birthday", Toast.LENGTH_SHORT).show();
        else if(countrySpinner.getSelectedItem().toString().equalsIgnoreCase("Country"))
            Toast.makeText(this, "Fill Country", Toast.LENGTH_SHORT).show();
        if(!firstNameInputField.getText().toString().isEmpty()
                && !lastNameInputField.getText().toString().isEmpty()
                && !emailAddressInputField.getText().toString().isEmpty()
                && !phoneNumberInputField.getText().toString().isEmpty()
                && !addressInputField.getText().toString().isEmpty()
                && !monthSpinner.getSelectedItem().toString().equalsIgnoreCase("Month")
                && !daySpinner.getSelectedItem().toString().equalsIgnoreCase("Day")
                && !yearSpinner.getSelectedItem().toString().equalsIgnoreCase("Year")
                && !countrySpinner.getSelectedItem().toString().equalsIgnoreCase("Country")
        ) {
            Toast.makeText(this, text2, Toast.LENGTH_SHORT).show();

            startActivity(intent);
        }
    }

}