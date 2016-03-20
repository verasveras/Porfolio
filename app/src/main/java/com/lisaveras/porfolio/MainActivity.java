package com.lisaveras.porfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void announceApp (View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        CharSequence name = view.getTag().toString();
        CharSequence text = name + " is coming soon!";

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
