package com.example.rcmh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.rcmh.myapplication.Users.User;
import com.example.rcmh.myapplication.Users.UsersAdapter;

import java.util.ArrayList;
import java.util.Random;

public class UsersListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.users_listview_layout);

        ListView listView = findViewById(R.id.UsersListViewComponent);

        int[] images = {R.mipmap.foto, R.mipmap.foto1, R.mipmap.foto2, R.mipmap.foto3, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};

        ArrayList<User> list = new ArrayList();
        for(int i = 0; i < 100; i++) {
            list.add(new User("Raymond", "Coplin " + i, images[new Random().nextInt(images.length)]));
        }

        listView.setAdapter(new UsersAdapter(this, list));
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
