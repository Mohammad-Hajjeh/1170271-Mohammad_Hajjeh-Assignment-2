package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;

import java.util.ArrayList;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.Model.CV;
import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class ShowActivity extends AppCompatActivity {
    TextView textView;
    String text5;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        textView=(TextView)findViewById(R.id.textView4);
        Intent intent = getIntent();
        text5=intent.getStringExtra("TEXT6");
        btnLoadOnClick();
    }

    public void exitShow(View view) {
        Intent intent = new Intent(this,FirstActivity.class);
            intent.putExtra("TEXT5", textView.getText().toString());
        if(textView.getText().equals("")) intent.putExtra("TEXTV","E");
        else
        intent.putExtra("TEXTV",textView.getText().toString());
        startActivity(intent);

    }
    public void btnLoadOnClick() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        str = sharedPreferences.getString("CVDATA", "");
        Gson gson = new Gson();
        CV[] cvs = gson.fromJson(str, CV[].class);
        textView.setMovementMethod(new ScrollingMovementMethod());
       if (str.equalsIgnoreCase("")) {
           Toast.makeText(this, "You Don't Have Cvs Before", Toast.LENGTH_SHORT).show();
       textView.setText("");
       }
        else {
           if (text5.equalsIgnoreCase(""))
               Toast.makeText(this, "You Don't Have Cvs Before", Toast.LENGTH_SHORT).show();
            if(!str.equalsIgnoreCase(text5))
            textView.append(text5);
        }
    }
}