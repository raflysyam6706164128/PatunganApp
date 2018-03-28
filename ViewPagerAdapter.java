package org.d3ifcool.patungan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/* Adapter class for view pager */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //ArrayList for store Fragment
    private final ArrayList<Fragment> listFragment = new ArrayList<>();

    //ArrayList for store fragment title
    private final ArrayList<String> listFragmentTitles = new ArrayList<>();

    // default constructor class with parent FragmentPagerAdapter
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // method for get fragment position in arrayList
    /*
     *
     * @param : position:Integer
     */

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    // method for count total fragment
    @Override
    public int getCount() {
        return listFragmentTitles.size();
    }

    // method for get fragment titles
    /*
     *
     * @param : position:Integer
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return listFragmentTitles.get(position);
    }


    // method for add a new fragment
    /*
     *
     * @param1 : newFragment:Fragment
     * @param2 : fragmentTitle:String
     */
    public void addFragment(Fragment newFragment, String fragmentTitle) {
        listFragment.add(newFragment);
        listFragmentTitles.add(fragmentTitle);
    }
}