package com.charlie.practice.ui.home.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charlie.practice.R;
import com.charlie.practice.ui.home.activity.HomeActivity;
import com.charlie.practice.ui.home.adapter.TwoTabVpAdapter;


public class TwoTabFragment extends Fragment implements HomeActivity.OnTabListener {
    private ViewPager mViewPager;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment_two_tab, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mViewPager = (ViewPager) view.findViewById(R.id.vpTwoTab);
        mViewPager.setAdapter(new TwoTabVpAdapter(getContext()));
        HomeActivity homeActivity = new HomeActivity();
        homeActivity.setOnTabListener(this);
    }

    @Override
    public void onTabListener(int position) {
        mViewPager.setCurrentItem(position);
    }
}
