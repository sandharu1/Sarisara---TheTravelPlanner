package com.ideafactory.sarisara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ideafactory.sarisara.R;

public class PlanSarisaraActivity extends AppCompatActivity {
	
		 @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.plan_sarisara);
		        Button b = (Button) findViewById(R.id.buttonPlantheTravel);
				b.setOnClickListener(new View.OnClickListener() {
					public void onClick(View arg0) {
						Intent i = new Intent(PlanSarisaraActivity.this,
								SarisaraDetailsStartActivity.class);
						startActivity(i);
					}
				});
		 }
}
