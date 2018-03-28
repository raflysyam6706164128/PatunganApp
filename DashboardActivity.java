package org.d3ifcool.patungan;

/*
* This class for dashboard activity
* */

import android.graphics.Typeface;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    // declare variable for store Typeface data type value
    Typeface mCoquette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // get .ttf font file from assets
        mCoquette = Typeface.createFromAsset(getAssets(), getString(R.string.coquette_path));

        //get element asociated with certain id
        TextView dashboardTitleTextView = (TextView) findViewById(R.id.dashboard_title_textview);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // instantiate viewpageradapter object
        /*
        * @param : FragmentManager
        * */
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add new fragment to arraylist on viewPagerAdapter class
        viewPagerAdapter.addFragment(new FragmentTimeline(), getString(R.string.timeline_fragment_title));
        viewPagerAdapter.addFragment(new FragmentTransaction(), getString(R.string.transaction_fragment_title));
        viewPagerAdapter.addFragment(new FragmentProfile(), getString(R.string.profile_fragment_title));

        // set adapter for viewPager with viewPagerAdapter
        viewPager.setAdapter(viewPagerAdapter);

        // set viewPager for tabLayout
        tabLayout.setupWithViewPager(viewPager);

        //set typeface for dashboard title TextView
        dashboardTitleTextView.setTypeface(mCoquette);
    }

    // method for displaying not ready feature message
    public void notReady(View view) {

        //Toast for displaying the messages
        Toast.makeText(DashboardActivity.this, R.string.not_ready_feature,
                Toast.LENGTH_LONG).show();
    }
}