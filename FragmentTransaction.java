package org.d3ifcool.patungan;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentTransaction extends Fragment {

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

        // inflate the transaction_fragment layout resource
        mView = inflater.inflate(R.layout.transaction_fragment, container, false);

        // declare array list to store Transaction data type
        ArrayList<Transaction> posts = new ArrayList<>();

        // add new post to array list
        posts.add(new Transaction("patungan", 500000, R.drawable.userphoto));
        posts.add(new Transaction("patungan", 60000, R.drawable.userphoto));
        posts.add(new Transaction("top up", 500000, R.drawable.userphoto));

        // get custom listview with certain id
        ListView timelineListView = (ListView) mView.findViewById(R.id.transaction_listView);

        // instantiate custom adapter to listview
        /*
        * @param 1: Context
        * @param 2: posts:ArrayList<post>
        * */
        TransactionAdapter transactionAdapter = new TransactionAdapter(getActivity(), posts);

        // set listview adapter with custom postAdapter
        timelineListView.setAdapter(transactionAdapter);

        // return view for fragment
        return mView;
    }
}