package com.example.foodapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    StringBuilder result = new StringBuilder();
    String[] foodTitle;
    String[] foodName;
    int[] foodImages;
    int[] foodPriceValue;
    int row_index = -1;
    Context context;


    public FoodAdapter(String[] foodTitle, String[] foodName, int[] foodImages, String[] foodPrice, int[] foodPriceValue, Context context) {
        this.foodTitle = foodTitle;
        this.foodName = foodName;
        this.foodImages = foodImages;
        this.foodPrice = foodPrice;
        this.foodPriceValue = foodPriceValue;
        this.context = context;
    }

    String[] foodPrice;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(foodImages[position]);
        holder.title.setText(foodTitle[position]);
        holder.name.setText(foodName[position]);
        holder.price.setText(foodPrice[position]);



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

            }
        });
        if (row_index == position) {
            holder.itemView.setBackgroundColor(Color.parseColor("#FF9100"));
            holder.name.setTextColor(Color.parseColor("#ffffff"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#000000"));
            holder.name.setTextColor(Color.parseColor("#978A8A"));
        }

    }


    @Override
    public int getItemCount() {
        return foodTitle.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, name, price;
        CheckBox checkBox;
        Button button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.images);
            title = itemView.findViewById(R.id.foodTitle);
            name = itemView.findViewById(R.id.foodName);
            price = itemView.findViewById(R.id.foodPrice);
            checkBox = itemView.findViewById(R.id.checkBox);
            button = itemView.findViewById(R.id.orderButton);
        }
    }
}
