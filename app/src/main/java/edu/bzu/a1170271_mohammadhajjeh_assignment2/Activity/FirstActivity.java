package edu.bzu.a1170271_mohammadhajjeh_assignment2.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import edu.bzu.a1170271_mohammadhajjeh_assignment2.R;

public class FirstActivity extends AppCompatActivity {
String text;
    String textt;
    String flag4;
    String flagS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent intent = getIntent();
        text=intent.getStringExtra("TEXT5");
        textt=intent.getStringExtra("TEXT");
        textt=intent.getStringExtra("TEXT");
        flag4=intent.getStringExtra("FLAG4");
        flagS=intent.getStringExtra("FLAGS");


    }

    public void creatCv(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("TEXT2",textt);
        Toast.makeText(this, textt, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void exitCv(View view) {
finishAffinity();
    }

    public void showCvs(View view) {
        Intent intent = new Intent(this,ShowActivity.class);
        if(text!=null)
            if (flag4.equalsIgnoreCase("4"))
        intent.putExtra("TEXT6",text);
            else
                intent.putExtra("TEXT6",textt);
        else
            intent.putExtra("TEXT6","");

        startActivity(intent);
    }
}