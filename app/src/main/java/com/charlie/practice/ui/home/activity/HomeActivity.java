package com.charlie.practice.ui.home.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.charlie.practice.R;
import com.charlie.practice.ui.home.adapter.VpAdapter;

public class HomeActivity extends FragmentActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_home);
        init();
    }

    private void init() {
        initViews();
        initListener();
    }

    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.vpFragment);
        mViewPager.setAdapter(new VpAdapter(getSupportFragmentManager()));
    }

    private void initListener() {
        findViewById(R.id.btOneTab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到twoTao中viewpager的第0项
                mOnTabListener.onTabListener(0);
            }
        });
        findViewById(R.id.btTwoTab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到twoTao中viewpager的第1项
                mOnTabListener.onTabListener(1);
            }
        });
    }

    private OnTabListener mOnTabListener;

    public void setOnTabListener(OnTabListener onTabListener) {
        mOnTabListener = onTabListener;
    }

    public interface OnTabListener {
        void onTabListener(int position);
    }
}
