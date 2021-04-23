package edu.bzu.a1170271_mohammadhajjeh_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void back_onClick(View view) {
        finish();
    }

    public void continue2_onClick(View view) {
        Intent intent = new Intent(this,FourthActivity.class);
        startActivity(intent);
    }

}