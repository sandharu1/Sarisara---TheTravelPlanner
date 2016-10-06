package com.ideafactory.sarisara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sandharu1 on 5/18/2015.
 */
public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  call screen button to main selection

        Button b = (Button) findViewById(R.id.EnterSarisara);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(HomeActivity.this, MainSelectionActivity.class);
                startActivity(i);
            }
        });

    }
}
