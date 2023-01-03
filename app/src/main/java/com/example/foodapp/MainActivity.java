package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] foodTitle = {"Pizza", "Burger", "Pizza", "Burger", "Burger", "Mango"};
    String[] foodName = {"Spicy Chicken Pizza", "Beef Burger", "Chicken Pizza", "Chicken Burger", "Fish Burger", "Mango Juice"};
    int[] foodImages = {R.drawable.spicychickenpizza, R.drawable.beefburger, R.drawable.chickenpizza, R.drawable.beefburger, R.drawable.fishburger, R.drawable.mangojuice};
    String[] foodPrice = {"RS 310.00", "RS 350.00", "RS 250.00", "RS 350.00", "RS 310.00", "RS 250.00"};
    int[] foodPriceValue = {310, 350, 250, 350, 310, 250};
    RecyclerView recycle;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.orderButton);
        recycle = findViewById(R.id.recyclerView);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        recycle.setLayoutManager(layout);
        FoodAdapter object = new FoodAdapter(foodTitle, foodName, foodImages, foodPrice, foodPriceValue, getApplicationContext());
        recycle.setAdapter(object);

    }
}