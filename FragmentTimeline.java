package org.d3ifcool.patungan;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/*
 * Fragment class for timeline activity
 */

public class FragmentTimeline extends Fragment {

    // declare View data type variable
    public View mView = null;


    // method for creating a view for fragment
    /*
    * @param 1 : inflater:LayoutInflater
    * @param 2 : container:ViewGroup
    * @param 3 : saveInstanceState:Bundle
    * */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // inflate the timeline_fragment layout resource
        mView = inflater.inflate(R.layout.timeline_fragment, container, false);

        // declare array list to store Post data type
        ArrayList<Post> posts = new ArrayList<>();

        // add new post to array list
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));
        posts.add(new Post("Samsung Gear V5", 1250000, "12/03/2018", R.drawable.userphoto));

        // get custom listview with certain id
        ListView timelineListView = (ListView) mView.findViewById(R.id.timeline_listview);

        // instantiate custom adapter to listview
        /*
        * @param 1: Context
        * @param 2: posts:ArrayList<post>
        * */
        PostAdapter postAdapter = new PostAdapter(getActivity(), posts);

        // set listview adapter with custom postAdapter
        timelineListView.setAdapter(postAdapter);

        // get floating action button element with certain id
        FloatingActionButton fab = (FloatingActionButton) mView.findViewById(R.id.fab);

        // listen for click event on floating action button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Make new intent to add post activity
                Intent addPostIntent = new Intent(getContext(), AddPostActivity.class);

                //start the intent
                startActivity(addPostIntent);
            }
        });

        // return view for fragment
        return mView;
    }
}