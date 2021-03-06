package com.example.android.herome.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.herome.Fragments.PickPowerFragment;
import com.example.android.herome.R;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import com.example.android.herome.Fragments.MainFragment;


public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, PickPowerFragment.PickPowerFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container,fragment).commit();

        }

    }


    public void loadPickPowerScreen(){

        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,pickPowerFragment).addToBackStack(null).commit();

    }


    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickFragmentInteraction(Uri uri) {

    }
}
