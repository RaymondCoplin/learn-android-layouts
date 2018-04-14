package com.example.rcmh.myapplication.Users;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rcmh.myapplication.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context ctx, ArrayList<User> objects){
        super(ctx, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.users_listview_content, parent, false);
        }

        ImageView imgUser = convertView.findViewById(R.id.userImage);
        TextView tvFirstName = convertView.findViewById((R.id.txtFirstName));
        TextView tvLastName = convertView.findViewById((R.id.txtLastName));

        tvFirstName.setText(user.firstName);
        tvLastName.setText(user.lastName);
        imgUser.setImageResource(user.image);

        return convertView;
    }

}
