package com.ideafactory.sarisara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SarisaraPlaceAddActivity extends AppCompatActivity {

    String[] test=new String[]{"Select Catogory","History","Nature","Lesiure","Religon - Buddhisum","Religon - Catholic","Technology","Safari","Religon - Hindu"};

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sarisara_place_add);
         Spinner spinnerCategory1 = (Spinner) findViewById(R.id.spinnerCategory1);
         Spinner spinnerCategory2 = (Spinner) findViewById(R.id.spinnerCategory2);
         Spinner spinnerCategory3 = (Spinner) findViewById(R.id.spinnerCategory3);

         ArrayAdapter<String> gameKindArray= new ArrayAdapter<String>(SarisaraPlaceAddActivity.this,android.R.layout.simple_spinner_item, test);
         gameKindArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         spinnerCategory1.setAdapter(gameKindArray);
         spinnerCategory2.setAdapter(gameKindArray);
         spinnerCategory3.setAdapter(gameKindArray);
	 }
	
}
