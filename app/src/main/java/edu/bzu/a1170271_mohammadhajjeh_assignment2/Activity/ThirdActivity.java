package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class ThirdActivity extends AppCompatActivity {
    EditText editSummary;
    EditText editEducation;
    EditText editExperience;
    String name ;
    String email ;
    String phone;
    String gender;
    String month ;
    String day ;
    String year ;
    String country ;
    String address ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        editSummary=(EditText)findViewById(R.id.editSummary);
        editEducation=(EditText)findViewById(R.id.editEducation);
        editExperience=(EditText)findViewById(R.id.editExperience);
        Intent intent = getIntent();
         name = intent.getStringExtra("NAME");
         email = intent.getStringExtra("EMAIL");
         phone = intent.getStringExtra("PHONE");
         gender = intent.getStringExtra("GENDER");
         month = intent.getStringExtra("MONTH");
         day = intent.getStringExtra("DAY");
         year = intent.getStringExtra("YEAR");
         country = intent.getStringExtra("COUNTRY");
         address = intent.getStringExtra("ADDRESS");
    }
    public void back_onClick(View view) {
        finish();
    }

    public void continue2_onClick(View view) {
        Intent intent = new Intent(this,FourthActivity.class);
        intent.putExtra("NAME2",name);
        intent.putExtra("EMAIL2",email);
        intent.putExtra("PHONE2",phone);
        intent.putExtra("MONTH2",month);
        intent.putExtra("DAY2",day);
        intent.putExtra("YEAR2",year);
        intent.putExtra("COUNTRY2",country);
        intent.putExtra("GENDER2",gender);
        intent.putExtra("ADDRESS2",address);
        intent.putExtra("SUMMARY",editSummary.getText().toString());
        intent.putExtra("EDUCATION",editEducation.getText().toString());
        intent.putExtra("EXPERIENCE",editExperience.getText().toString());
        if(editSummary.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Summary", Toast.LENGTH_SHORT).show();
        else if(editEducation.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Education", Toast.LENGTH_SHORT).show();
        else if(editExperience.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Experience", Toast.LENGTH_SHORT).show();
        if(!editSummary.getText().toString().isEmpty()
                && !editEducation.getText().toString().isEmpty()
                && !editExperience.getText().toString().isEmpty()
        )
        startActivity(intent);
    }

}