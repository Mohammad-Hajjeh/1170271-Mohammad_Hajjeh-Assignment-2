package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class FourthActivity extends AppCompatActivity {
    EditText editHobbies;
    EditText editSkills;
    EditText editCertifications;
    String name2;
    String email2;
    String phone2;
    String gender2;
    String month2;
    String day2;
    String year2;
    String country2;
    String address2;
    String summary;
    String skill;
    String certification;
    String hobbies;
    String education;
    String experience;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        editHobbies=(EditText)findViewById(R.id.editHobbies);
        editSkills=(EditText)findViewById(R.id.editSkills);
        editCertifications=(EditText)findViewById(R.id.editCertifications);
        Intent intent = getIntent();
        name2 = intent.getStringExtra("NAME");
        email2 = intent.getStringExtra("EMAIL");
        phone2 = intent.getStringExtra("PHONE");
        gender2 = intent.getStringExtra("GENDER");
        month2 = intent.getStringExtra("MONTH");
        day2 = intent.getStringExtra("DAY");
        year2 = intent.getStringExtra("YEAR");
        country2 = intent.getStringExtra("COUNTRY");
        address2 = intent.getStringExtra("ADDRESS");
        summary = intent.getStringExtra("SUMMARY");
        education = intent.getStringExtra("EDUCATION");
        experience= intent.getStringExtra("EXPERIENCE");
    }

    public void continue3_onClick(View view) {
        hobbies=editHobbies.getText().toString().trim();
        skill=editSkills.getText().toString().trim();
        certification=editCertifications.getText().toString().trim();
        if(editHobbies.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Summary", Toast.LENGTH_SHORT).show();
        else if(editSkills.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Education", Toast.LENGTH_SHORT).show();
        else if(editCertifications.getText().toString().isEmpty())
            Toast.makeText(this, "Fill Experience", Toast.LENGTH_SHORT).show();
        if(!editHobbies.getText().toString().isEmpty()
                && !editSkills.getText().toString().isEmpty()
                && !editCertifications.getText().toString().isEmpty()
        )
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }
    public void back2_onClick(View view) {
        finish();
    }
}