package com.example.rodri.workingwithtabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.rodri.workingwithtabs.R;
import com.example.rodri.workingwithtabs.adapter.ViewPagerAdapter;
import com.example.rodri.workingwithtabs.fragments.OneFragment;
import com.example.rodri.workingwithtabs.fragments.ThreeFragment;
import com.example.rodri.workingwithtabs.fragments.TwoFragment;

/**
 * Created by rodri on 7/1/2016.
 */
public class CustomTabs extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.android_icon,
            R.drawable.heart_icon,
            R.drawable.star_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tabs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarCustomTabs);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewPagerCustomTabs);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayoutCustomTabs);
        tabLayout.setupWithViewPager(viewPager);

        // call method to set the icon in the tab items
        setupTabIcons();

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
        viewPager.setAdapter(viewPagerAdapter);
    }

    private void setupTabIcons() {
        TextView txtTabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        txtTabOne.setText("ONE");
        txtTabOne.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[0], 0, 0);
        tabLayout.getTabAt(0).setCustomView(txtTabOne);

        TextView txtTabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        txtTabTwo.setText("TWO");
        txtTabTwo.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[1], 0, 0);
        tabLayout.getTabAt(1).setCustomView(txtTabTwo);

        TextView txtTabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        txtTabThree.setText("THREE");
        txtTabThree.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[2], 0, 0);
        tabLayout.getTabAt(2).setCustomView(txtTabThree);
    }

}
