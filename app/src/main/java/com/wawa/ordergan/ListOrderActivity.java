package com.wawa.ordergan;

import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class ListOrderActivity extends AppCompatActivity {

    LinearLayout layout;
    CardView card;
    BottomSheetBehavior bsb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_order);


    }

    public void sukses(View view) {
        Intent i = new Intent(getApplicationContext(), SplashScreen.class);
        startActivity(i);
    }
}
