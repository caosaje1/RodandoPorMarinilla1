package com.caosaje1.rodandopormarinilla;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FragmentexActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;
    BarUnoFragment b1;
    BarDosFragment b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentex);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        b1 = new BarUnoFragment();
        ft.add(android.R.id.content, b1).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        ft = fm.beginTransaction();
        if (id == R.id.mFrag1) {

            b1 = new BarUnoFragment();
            ft.replace(android.R.id.content, b1).commit();

        }else{
            b2 = new BarDosFragment();
            ft.replace(android.R.id.content, b2).commit();
        }


        return super.onOptionsItemSelected(item);
    }
}
