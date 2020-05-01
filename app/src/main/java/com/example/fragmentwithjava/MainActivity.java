package com.example.fragmentwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showFragment(View view)
    {

        BlankFragment fragment=new BlankFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer,fragment,"fragmentTag")
                .commit();

    }

    public void removeFragment(View view)
    {
        BlankFragment fragment=(BlankFragment) getSupportFragmentManager()
               // .findFragmentById(R.id.fragmentContainer);
        .findFragmentByTag("fragmentTag");
        if(fragment !=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment).commit();
        }


    }
}
