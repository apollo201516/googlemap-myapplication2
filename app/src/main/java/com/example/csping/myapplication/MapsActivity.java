package com.example.csping.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }




    private  void setmMap(){
        mMap.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Markers"));
        mMap.setMyLocationEnabled(true);





    }





    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */


    @Override
    public void onMapReady(GoogleMap map) {
         // sha tain沙田
        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.382277, 114.186835))
                .title("Sha Tin"));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.388053, 114.196781))
                .title("Sha Tin Sports Ground"));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.421358, 114.227600))
                .title("Ma On Shan Sports Ground ").snippet("length: 40km"));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.388053, 114.196781))
                .title("Sha Tin Sports Ground"));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.417889, 114.223063))
                .title("Ma On Shan Promenade"));

        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.427625, 114.212113))
                .title("Pak Shek Kok Promenade"));

         //


    }








        /**
        @Override
        public void onMapReady(GoogleMap map) {
            map.addMarker(new MarkerOptions()
                    .position(new LatLng(10, 10))
                    .title("Hello world"));
        }


    }*/



}
