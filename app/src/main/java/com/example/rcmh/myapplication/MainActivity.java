
package com.example.rcmh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goActivity(android.view.View view) {

        int layoutId = 0;
        Intent intent = new android.content.Intent(MainActivity.this, LayoutActivity.class);

        switch(view.getId()){
            case (R.id.linearLayoutVertical):
                layoutId = R.layout.linear_layout_vertical;
                break;
            case (R.id.linearLayoutHorizontal):
                layoutId = R.layout.linear_layout_horizontal;
                break;
            case (R.id.relativeLayout):
                layoutId = R.layout.relative_layout;
                break;
            case (R.id.tableLayout):
                layoutId = R.layout.table_layout;
                break;
            case (R.id.frameLayout):
                layoutId = R.layout.frame_layout;
                break;
            case (R.id.listViewLayout):
                intent = new android.content.Intent(MainActivity.this, ListViewActivity.class);
                layoutId = R.layout.listview_layout;
                break;
            case (R.id.gridViewLayout):
                intent = new android.content.Intent(MainActivity.this, GridViewActivity.class);
                layoutId = R.layout.gridview_layout;
                break;
            case (R.id.CustomUserListView):
                intent = new android.content.Intent(MainActivity.this, UsersListViewActivity.class);
                layoutId = R.layout.users_listview_layout;
                break;
            default:
                layoutId = R.layout.activity_not_found;
        }

        intent.putExtra("layout", layoutId);
        startActivity(intent);
    }

}
