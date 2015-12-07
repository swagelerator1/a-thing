package com.example.s10044815.map;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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
   /Marker LasVegas;
    //Marker correctCity;

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
     NewYork =  mMap.addMarker(new MarkerOptions().position(new LatLng(40, -74)).title("New York").icon(BitmapDescriptorFactory.fromResource(R.drawable.boby)).snippet("Pizza, Empire state!!!!"));
        Chicago =  mMap.addMarker(new MarkerOptions().position(new LatLng(41.88, -87.63)).title("Chicago").icon(BitmapDescriptorFactory.fromResource(R.drawable.boby)).snippet("Windybreaking city"));
        Austin =  mMap.addMarker(new MarkerOptions().position(new LatLng(30.25, 97.75)).title("Austin").icon(BitmapDescriptorFactory.fromResource(R.drawable.boby)).snippet("My house, in the middle of town, my house..."));
        LasVegas =  mMap.addMarker(new MarkerOptions().position(new LatLng(36.1215, 115.1739)).title("Las Vegas").icon(BitmapDescriptorFactory.fromResource(R.drawable.boby)).snippet("casinos and ryan"));
    mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    mMap.setIndoorEnabled(true);
    }
}
