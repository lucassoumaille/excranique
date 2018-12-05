package com.bonobocorp.joker.litrocent.Vue;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bonobocorp.joker.litrocent.Model.ItemData;
import com.bonobocorp.joker.litrocent.R;

import java.util.ArrayList;

public class SpinnerAdapter extends ArrayAdapter<ItemData> {
    int groupid;
    Activity context;
    ArrayList<ItemData> list;
    LayoutInflater inflater;
    public SpinnerAdapter(Activity context, int groupid, int id, ArrayList<ItemData>
            list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid=groupid;
    }

    public View getView(int position, View convertView, ViewGroup parent ){
        View itemView = inflater.inflate(groupid,parent,false);
        ImageView imageView = itemView.findViewById(R.id.iconSpinnerEntretien);
        imageView.setImageResource(list.get(position).getImageId());
        TextView textView = itemView.findViewById(R.id.infoSpinnerEntretien);
        textView.setText(list.get(position).getText());
        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent){
        return getView(position,convertView,parent);

    }
}

