package com.example.android.moodindigofragmenttab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.Toolbar;
import android.view.ViewParent;
import com.example.android.moodindigofragmenttab.R;

/**
 * Created by owais on 05/07/17.
 */




public class MainFragment extends Fragment {
//    public MainFragment() {
//        // Required empty public constructor
//    }

    //Mrunmayi
    View view;
    ViewPager viewPager;
    //Mrunmayi
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_main, container,false);

        //Mrunmayi
        view=inflater.inflate(R.layout.fragment_main, container, false);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("News"));
        tabLayout.addTab(tabLayout.newTab().setText("Competitions"));

        viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

//    public class ViewPagerAdapter extends FragmentStatePagerAdapter {
//        int mNumOfTabs;
//
//        public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
//            super(fm);
//            this.mNumOfTabs = NumOfTabs;
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//
//            switch (position) {
//                case 0:
//                    NewsFragment tab1 = new NewsFragment();
//                    return tab1;
//                case 1:
//                    CompiFragment tab2 = new CompiFragment();
//                    return tab2;
//                default:
//                    return null;
//            }
//        }
//
//        @Override
//        public int getCount() {
//            return mNumOfTabs;
//        }
//    }

    //Mrunmayi
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setRetainInstance(true);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        container.removeAllViews();
//        View view = inflater.inflate(R.layout.fragment_main, container, false);
//
//        Toolbar toolbar = (Toolbar) getView().findViewById(R.id.toolbar);
//        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
//        setHasOptionsMenu(true);
//
//        TabLayout tabLayout =(TabLayout) getView().findViewById(R.id.tab_layout);
//        tabLayout.addTab(tabLayout.newTab().setText("Compi"));
//        tabLayout.addTab(tabLayout.newTab().setText("News"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        final ViewPager viewPager = (ViewPager) getView().findViewById(R.id.pager);
//        final PagerAdapter adapter = new PagerAdapter
//                (getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        return view;
//    }


}
