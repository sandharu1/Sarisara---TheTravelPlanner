package com.ideafactory.sarisara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SarisaraDetailsInterestActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarisara_details_interests);

        //advance button
        Button b = (Button) findViewById(R.id.ButtonGoToAdvancedOptions);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(SarisaraDetailsInterestActivity.this,
                        SarisaraDetailsExtraActivity.class);
                startActivity(i);
            }
        });

        //send button
        Button c = (Button) findViewById(R.id.ButtonSendTravelDetails);
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//                Intent i = new Intent(SarisaraDetailsInterestActivity.this,
//                        SarisaraDetailsInterestActivity.class);
//                startActivity(i);
                Toast.makeText(getApplicationContext(), "Data send successfully", Toast.LENGTH_LONG).show();
            }
        });

    }

}
