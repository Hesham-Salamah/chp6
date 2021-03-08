package com.example.chapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        String [] attractions = {
                "Art",
                "Mile",
                "Willis Tower",
                "Water Tower"
        };

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main, R.id.travel, attractions));


        //adapters are ways to connect or assign arrays into list
        // i.e bringing two types of objects (populate xml to data)
    }
    protected void onListItemClick(
            ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.artic.edu")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.themagnificentmile.com")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, picactivity.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://navypier.org")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shopwatertower.com/en.html")));
                break;
        }

    }


}