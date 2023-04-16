package com.example.recordfy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<String> {
    public Adapter(Context context, List<String> items) {
        super(context, android.R.layout.simple_list_item_1, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        String item = getItem(position);
        TextView tvItem = convertView.findViewById(android.R.id.text1);
        tvItem.setText(item);

        return convertView;
    }
}
