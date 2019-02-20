package com.temple.edu.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends BaseAdapter {
    Context c;
    List<String> colorList;

    public ColorAdapter(Context c, ArrayList<String> colorList) {
        this.c = c;
        this.colorList = colorList;
    }

    @Override
    public int getCount() {
        return colorList.size();
    }

    @Override
    public Object getItem(int position) {
        return colorList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView t = new TextView(this.c);
        t.setText(colorList.get(position));
        t.setGravity(Gravity.CENTER_HORIZONTAL);
        t.setTextSize(24);
        t.setPadding(10, 10, 10, 10);
        try {
            t.setBackgroundColor(Color.parseColor(colorList.get(position)));
        } catch (Exception e) {

        }

        return t;
    }
}
