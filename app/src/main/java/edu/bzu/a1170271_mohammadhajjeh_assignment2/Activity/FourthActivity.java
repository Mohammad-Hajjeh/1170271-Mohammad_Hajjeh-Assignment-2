package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.Model.CV;
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
    String text4;
    static List<CV> cvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        editHobbies=(EditText)findViewById(R.id.editHobbies);
        editSkills=(EditText)findViewById(R.id.editSkills);
        editCertifications=(EditText)findViewById(R.id.editCertifications);
        Intent intent = getIntent();
        name2 = intent.getStringExtra("NAME2");
        email2 = intent.getStringExtra("EMAIL2");
        phone2 = intent.getStringExtra("PHONE2");
        gender2 = intent.getStringExtra("GENDER2");
        month2 = intent.getStringExtra("MONTH2");
        day2 = intent.getStringExtra("DAY2");
        year2 = intent.getStringExtra("YEAR2");
        country2 = intent.getStringExtra("COUNTRY2");
        address2 = intent.getStringExtra("ADDRESS2");
        summary = intent.getStringExtra("SUMMARY");
        education = intent.getStringExtra("EDUCATION");
        experience= intent.getStringExtra("EXPERIENCE");
        text4= intent.getStringExtra("TEXT4");


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
        ) {
            CV  cv = new CV(name2,email2,phone2,gender2,month2,day2,year2,country2,address2,summary,skill,certification,hobbies,education,experience);
            cvList=new ArrayList<>();
            cvList.add(cv);
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Gson gson = new Gson();
            String cvString =gson.toJson(cvList);
            editor.putString("CVDATA",cvString);
            editor.putString("ID","2");
            editor.commit();
            Intent intent = new Intent(this,FirstActivity.class);
            intent.putExtra("TEXT5","\n"+text4+"\n"+cvString+"\n======================================\n");
            Toast.makeText(this, "DATA SAVED", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, cvString, Toast.LENGTH_SHORT).show();
            startActivity(intent);


        }
    }
    public void back2_onClick(View view) {
        finish();
    }
}