package com.example.s10044815.map;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {
Marker correctCity;
    Marker NewYork;
    Marker Chicago;
    Marker Austin;
   Marker LasVegas;
    Marker Detroit;

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
     NewYork =  mMap.addMarker(new MarkerOptions().position(new LatLng(40, -74)).title("New York").icon(BitmapDescriptorFactory.fromResource(R.drawable.moarbob)).snippet("Pizza, Empire state!!!!"));
        Chicago =  mMap.addMarker(new MarkerOptions().position(new LatLng(41.88, -87.63)).title("Chicago").icon(BitmapDescriptorFactory.fromResource(R.drawable.moarbob)).snippet("Windybreaking city"));
        Austin =  mMap.addMarker(new MarkerOptions().position(new LatLng(30.25, -97.75)).title("Austin").icon(BitmapDescriptorFactory.fromResource(R.drawable.moarbob)).snippet("My house, in the middle of town, my house..."));
        LasVegas =  mMap.addMarker(new MarkerOptions().position(new LatLng(36.1215, -115.1739)).title("Las Vegas").icon(BitmapDescriptorFactory.fromResource(R.drawable.moarbob)).snippet("casinos and ryan"));
        Detroit =  mMap.addMarker(new MarkerOptions().position(new LatLng(42.3314, -83.058)).title("Detroit").icon(BitmapDescriptorFactory.fromResource(R.drawable.moarbob)).snippet("baysball"));
    mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    mMap.setIndoorEnabled(true);
        correctCity = LasVegas;
        Toast gud = Toast.makeText(MapsActivity.this, "krazy rian waz heere", Toast.LENGTH_LONG);
        gud.show();
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.equals(correctCity)&&marker.equals(LasVegas)) {
                   Toast gud = Toast.makeText(MapsActivity.this, "the next place place is huuuuge", Toast.LENGTH_LONG);
                    gud.show();
                    correctCity = NewYork;
                }
                if (marker.equals(correctCity)&&marker.equals(NewYork)) {
                    Toast gud = Toast.makeText(MapsActivity.this, "this place went bamkrupted", Toast.LENGTH_LONG);
                    gud.show();
                    correctCity = Detroit;
                }
                if (marker.equals(correctCity)&&marker.equals(Detroit)) {
                    Toast gud = Toast.makeText(MapsActivity.this, "east side pies is here", Toast.LENGTH_LONG);
                    gud.show();
                    correctCity = Austin;
                }
                if (marker.equals(correctCity)&&marker.equals(Austin)) {
                    Toast gud = Toast.makeText(MapsActivity.this, "next and last is windy", Toast.LENGTH_LONG);
                    gud.show();
                    correctCity = Chicago;
                }
                    if (marker.equals(correctCity)&&marker.equals(Chicago)) {
                        Toast gud = Toast.makeText(MapsActivity.this, "yooo weeen", Toast.LENGTH_LONG);
                        gud.show();
                        correctCity = NewYork;

                    }

                if (!marker.equals(correctCity)){
                    Toast gud = Toast.makeText(MapsActivity.this, "rong", Toast.LENGTH_LONG);
                    gud.show();
                }

                return false;
            }
        });
    }
    }


