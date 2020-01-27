package com.kis.recyclerviewornek;

import android.content.Context;
import java.util.List;
import android.widget.Adapter;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.SosyalMedyaAlani> {

    public  class SosyalMedyaAlani(Context context ,int resource , List <RecyclerViewAdapter.SosyalMedyaAlani>objects){
        super(context,resource,objects);
        Context nContext = context;


    }
}
