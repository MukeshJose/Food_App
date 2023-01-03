package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiptWindow extends AppCompatActivity {
    TextView receipt;
    String result;

    public ReceiptWindow(String result, int totalAmount) {
        this.result = result;
        this.totalAmount = totalAmount;
    }

    int totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_window);
        receipt = findViewById(R.id.receipt);
        receipt.setText(result);
    }
}