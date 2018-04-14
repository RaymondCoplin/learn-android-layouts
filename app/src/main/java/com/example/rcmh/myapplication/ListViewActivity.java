package com.example.rcmh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.listview_layout);
        ListView listView = findViewById(R.id.listViewComponent);

        List<String> list = new ArrayList();
        for(int i = 0; i < 100; i++) {
          list.add(Integer.toString(i + 1));
        }

        listView.setAdapter(new android.widget.ArrayAdapter<>(this, R.layout.textview_component, list));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home : finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
