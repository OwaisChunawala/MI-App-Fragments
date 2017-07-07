package com.example.android.moodindigofragmenttab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by owais on 05/07/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs; // number of tab variable for viewPager

    //PagerAdapter Constructor
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position){

        switch (position){
            case 0:
                CompiFragment compiFragment = new CompiFragment();
                return compiFragment;
            case 1:
                NewsFragment newsFragment = new NewsFragment();
                return newsFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
