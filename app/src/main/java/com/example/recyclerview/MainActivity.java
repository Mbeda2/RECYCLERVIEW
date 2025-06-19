package com.example.recyclerview; // Your package name might be different

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    String[] myDataset = {"Apple", "Banana", "Orange", "Grape", "Strawberry", "Mango", "Pineapple", "Kiwi", "Blueberry", "Raspberry", "Lemon", "Lime", "Cherry", "Peach", "Plum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ... rest of the setup will go here
    }
}