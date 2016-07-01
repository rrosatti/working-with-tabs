package com.example.rodri.workingwithtabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.rodri.workingwithtabs.R;
import com.example.rodri.workingwithtabs.adapter.ViewPagerAdapter;
import com.example.rodri.workingwithtabs.fragments.OneFragment;
import com.example.rodri.workingwithtabs.fragments.ThreeFragment;
import com.example.rodri.workingwithtabs.fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private Button btSimpleTabs, btScrollableTabs, btIconAndTextTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        initializeVariables();

        btSimpleTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SimpleTabsActivity.class);
                startActivity(intent);
            }
        });

        btScrollableTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScrollableTabsActivity.class);
                startActivity(intent);
            }
        });

        btIconAndTextTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IconAndTextTabsActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initializeVariables() {
        btSimpleTabs = (Button) findViewById(R.id.btSimpleTabs);
        btScrollableTabs = (Button) findViewById(R.id.btScrollableTabs);
        btIconAndTextTabs = (Button) findViewById(R.id.btIconAndTextTabs);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
