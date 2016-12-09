package com.charlie.practice.ui.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.charlie.practice.ui.home.fragment.OneTabFragment;
import com.charlie.practice.ui.home.fragment.TwoTabFragment;


public class VpAdapter extends FragmentPagerAdapter {
    public VpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return getFragment(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    private Fragment getFragment(int position) {
        Fragment fragment;
        if (position == 0) {
            fragment = new OneTabFragment();
        } else {
            fragment = new TwoTabFragment();
        }
        return fragment;
    }
}
