package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapterNotif extends RecyclerView.Adapter<RecyclerViewAdapterNotif.ViewHolder> {

    private List<String> mData,sub1,sub2;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    RecyclerViewAdapterNotif(Context context, List<String> data, List<String> data1, List<String> data2) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.sub1 = data1;
        this.sub2 = data2;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.content_notifs, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String animal = mData.get(position);
        String operator = sub1.get(position);
        String time = sub2.get(position);
        holder.mainText.setText(animal);
        holder.subT1.setText(operator);
        holder.subT2.setText(time);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mainText,subT1,subT2;

        ViewHolder(View itemView) {
            super(itemView);
            mainText = itemView.findViewById(R.id.textView);
            subT1 = itemView.findViewById(R.id.textView2);
            subT2 = itemView.findViewById(R.id.textView3);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return mData.get(id);
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
