package com.example.rodri.workingwithtabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.rodri.workingwithtabs.R;
import com.example.rodri.workingwithtabs.adapter.ViewPagerAdapter;
import com.example.rodri.workingwithtabs.fragments.FiveFragment;
import com.example.rodri.workingwithtabs.fragments.FourFragment;
import com.example.rodri.workingwithtabs.fragments.OneFragment;
import com.example.rodri.workingwithtabs.fragments.ThreeFragment;
import com.example.rodri.workingwithtabs.fragments.TwoFragment;

/**
 * Created by rodri on 7/1/2016.
 */
public class ScrollableTabsActivity extends AppCompatActivity{

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarScrollableTabs);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewPagerScrollableTabs);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayoutScrollableTabs);
        tabLayout.setupWithViewPager(viewPager);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new OneFragment(), "ONE");
        viewPagerAdapter.addFragment(new TwoFragment(), "TWO");
        viewPagerAdapter.addFragment(new ThreeFragment(), "THREE");
        viewPagerAdapter.addFragment(new FourFragment(), "FOUR");
        viewPagerAdapter.addFragment(new FiveFragment(), "FIVE");
        viewPagerAdapter.addFragment(new OneFragment(), "ONE");
        viewPagerAdapter.addFragment(new TwoFragment(), "TWO");
        viewPagerAdapter.addFragment(new ThreeFragment(), "THREE");
        viewPagerAdapter.addFragment(new FourFragment(), "FOUR");
        viewPagerAdapter.addFragment(new FiveFragment(), "FIVE");
        viewPager.setAdapter(viewPagerAdapter);
    }

}
