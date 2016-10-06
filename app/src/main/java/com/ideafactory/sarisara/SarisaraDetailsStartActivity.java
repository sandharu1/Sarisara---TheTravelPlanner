package com.ideafactory.sarisara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SarisaraDetailsStartActivity extends AppCompatActivity {

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sarisara_details_start);


         Button b = (Button) findViewById(R.id.ButtonGoToSelectInterests);
         b.setOnClickListener(new View.OnClickListener() {
             public void onClick(View arg0) {
                 Intent i = new Intent(SarisaraDetailsStartActivity.this,
                         SarisaraDetailsInterestActivity.class);
                 startActivity(i);
             }
         });
	        
	 }
}
