package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class FirstActivity extends AppCompatActivity {
    String text;
    String text2;
    boolean flag;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
       /*prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        flag=prefs.getBoolean("FLAG",false);
        if(flag)
        {
            text2=prefs.getString("TXT","");
        }*/
        Intent intent = getIntent();
       text=intent.getStringExtra("TEXT5");
        //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }

    public void creatCv(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("TEXT2",text);
        //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void exitCv(View view) {
       /* Intent intent = getIntent();
        text=intent.getStringExtra("TEXT5");
            editor.putString("TXT", text);
            editor.putBoolean("FLAG", true);
            editor.commit();*/
        finishAffinity();
    }

    public void showCvs(View view) {
        Intent intent = new Intent(this,ShowActivity.class);
        if(text!=null)
        intent.putExtra("TEXT6",text);
        else
            intent.putExtra("TEXT6","");

        startActivity(intent);
    }
}