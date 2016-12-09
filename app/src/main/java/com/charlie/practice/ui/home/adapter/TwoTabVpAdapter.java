package com.charlie.practice.ui.home.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TwoTabVpAdapter extends PagerAdapter {
    private Context mContext;

    public TwoTabVpAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return getView(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    private View getView(int position) {
        TextView textView = new TextView(mContext);
        textView.setText("child" + position);
        return textView;
    }
}
