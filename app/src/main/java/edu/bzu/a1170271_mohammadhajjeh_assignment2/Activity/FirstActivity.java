package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class FirstActivity extends AppCompatActivity {
    String text;
    String textv;
    boolean flag;
    String id;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
       prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Intent intent = getIntent();
       text=intent.getStringExtra("TEXT5");
       //textv=intent.getStringExtra("TEXTV");
        textv=prefs.getString("SAVEDATA","");
        flag=prefs.getBoolean("FLAG",false);
        id=prefs.getString("ID","1");
        if(id.equalsIgnoreCase("1"))
        Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();



    }

    public void creatCv(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("TEXT2",text);
        //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void exitCv(View view) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String saveData = text;
        if(saveData.equalsIgnoreCase("")) {
            editor.putString("SAVEDATA", "");
            editor.putString("ID","1");
            editor.putBoolean("FLAG",true);

        }
        else {
            editor.putString("SAVEDATA", saveData);
            editor.putString("ID","1");
            editor.putBoolean("FLAG",true);
        }
        editor.commit();
        finishAffinity();
    }

    public void showCvs(View view) {
        Intent intent = new Intent(this,ShowActivity.class);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(text!=null && id.equalsIgnoreCase("2"))
        intent.putExtra("TEXT6",text);
        if(textv!=null && id.equalsIgnoreCase("1"))
            intent.putExtra("TEXT6",textv);
        startActivity(intent);
    }
}