package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import java.util.List;

public class RecyclerViewAdapterAcc extends RecyclerView.Adapter<RecyclerViewAdapterAcc.ViewHolder> {

private int[] mimageArray;
private String[] mData;
private LayoutInflater mInflater;
private ItemClickListener mClickListener;

        // data is passed into the constructor
        RecyclerViewAdapterAcc(Context context, int[] imageArray) {
        this.mInflater = LayoutInflater.from(context);
        this.mimageArray = imageArray;
        }

// inflates the row layout from xml when needed
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.content_account, parent, false);
        return new ViewHolder(view);
        }

// binds the data to the TextView in each row
@Override
public void onBindViewHolder(ViewHolder holder, int position) {
        //String animal = mData.get(position);
        //holder.myTextView.setText(animal);
        holder.mImageView.setImageResource(mimageArray[position]);
        }

// total number of rows
@Override
public int getItemCount() {
        return mimageArray.length;
        }


// stores and recycles views as they are scrolled off screen
public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView myTextView;
    ImageView mImageView;

    ViewHolder(View itemView) {
        super(itemView);
        //myTextView = itemView.findViewById(R.id.tvAnimalName);
        mImageView = itemView.findViewById(R.id.imageView4);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
    }
}

    // convenience method for getting data at click position
    int getItem(int id) {
        return mimageArray[id];
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

// parent activity will implement this method to respond to click events
public interface ItemClickListener {
    void onItemClick(View view, int position);
}
}
