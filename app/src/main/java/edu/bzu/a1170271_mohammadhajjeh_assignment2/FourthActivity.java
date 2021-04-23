package edu.bzu.a1170271_mohammadhajjeh_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void continue3_onClick(View view) {
    }
    public void back2_onClick(View view) {
        finish();
    }
}