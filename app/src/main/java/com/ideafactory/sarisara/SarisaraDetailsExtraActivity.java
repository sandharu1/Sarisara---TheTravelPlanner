package com.ideafactory.sarisara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SarisaraDetailsExtraActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarisara_deatils_extra);

        //avoid button
        Button b = (Button) findViewById(R.id.ButtonGoTShouldAvoid);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(SarisaraDetailsExtraActivity.this,
                        SarisaraDetailsAvoidActivity.class);
                startActivity(i);
            }
        });

        //send button
        Button c = (Button) findViewById(R.id.ButtonSendTavelDetailsWithSVC);
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
