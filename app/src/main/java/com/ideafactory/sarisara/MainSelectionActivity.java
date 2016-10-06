package com.ideafactory.sarisara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ideafactory.sarisara.R;

public class MainSelectionActivity extends AppCompatActivity {

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main_selection);

		Button b = (Button) findViewById(R.id.buttonSubmitPlaceDetails);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainSelectionActivity.this,
						SarisaraPlaceAddActivity.class);
				startActivity(i);
			}
		});
		Button b1 = (Button) findViewById(R.id.buttonPlanATravel);
		b1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainSelectionActivity.this,
						PlanSarisaraActivity.class);
				startActivity(i);
			}
		});
		Button b2 = (Button) findViewById(R.id.buttonShowCities);
		b2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainSelectionActivity.this,
						MapSarisaraCitiesActivity.class);
				startActivity(i);
			}
		});
		Button b3 = (Button) findViewById(R.id.buttonHelp);
		b3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainSelectionActivity.this, SarisaraHelpActivity.class);
				startActivity(i);
			}
		});
	}
}
