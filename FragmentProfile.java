package org.d3ifcool.patungan;

/*
 * Fragment class for profile activity
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;



public class FragmentProfile extends Fragment {

    // declare View data type variable
    private View mView = null;

    // method for creating a view for fragment
    /*
    * @param 1 : inflater:LayoutInflater
    * @param 2 : container:ViewGroup
    * @param 3 : saveInstanceState:Bundle
    * */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inflate the profile_fragment layout resource
        mView = inflater.inflate(R.layout.profile_fragment, container, false);

        // declare array list to store Post data type
        ArrayList<Post> posts = new ArrayList<>();

        // add new post to array list
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));

        // get custom listview with certain id
        ListView profileListView = (ListView) mView.findViewById(R.id.postonprofile_listview);

        // instantiate custom adapter to listview
        /*
        * @param 1: Context
        * @param 2: posts:ArrayList<post>
        * */
        PostAdapter postAdapter = new PostAdapter(getActivity(), posts);

        // set listview adapter with custom postAdapter
        profileListView.setAdapter(postAdapter);

        //return the fragment view
        return mView;
    }
}
