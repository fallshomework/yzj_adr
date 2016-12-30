package com.charlie.practice.ui.home.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.charlie.practice.R;

public class HomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_home);
        init();
    }

    private void init() {
    }
}
