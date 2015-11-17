package com.example.admin.testing;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Admin on 17.11.2015.
 */


public class CostsActivity extends AppCompatActivity {
    CostsFragment frag;
    FragmentTransaction ftrans;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.costs_main);

        frag = new CostsFragment();
        ftrans = getFragmentManager().beginTransaction();
        ftrans.add(R.id.costFL, frag);
        ftrans.commit();
    }
}
