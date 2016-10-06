package com.ideafactory.sarisara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapSarisaraCitiesActivity extends AppCompatActivity {

    static final LatLng Kandy = new LatLng(7.299642, 80.635529);
    static final LatLng Colombo = new LatLng(6.885101, 79.871979);
    private GoogleMap map;

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.map_sarisara_cities);
         map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                 .getMap();
         Marker kandy = map.addMarker(new MarkerOptions().position(Kandy)
                 .title("Kandy"));
         Marker colombo = map.addMarker(new MarkerOptions()
                 .position(Colombo).title("Colombo"));

         // Move the camera instantly to hamburg with a zoom of 15.
         map.moveCamera(CameraUpdateFactory.newLatLngZoom(Colombo, 15));

         // Zoom in, animating the camera.
         map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
     }

}
