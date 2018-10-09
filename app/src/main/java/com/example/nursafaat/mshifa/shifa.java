package com.example.nursafaat.mshifa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class shifa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shifa);
    }
    public void sendMassage1 (View view) {

        Intent intent = new Intent(this, wacana1.class);
        startActivity(intent);
    }
    public void sendMassage2 (View view) {

        Intent intent = new Intent(this, wacana2.class);
        startActivity(intent);
    }
    public void sendMassage3 (View view) {

        Intent intent = new Intent(this, wacana3.class);
        startActivity(intent);
    }

}
