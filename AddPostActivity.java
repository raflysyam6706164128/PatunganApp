package org.d3ifcool.patungan;

/*
* This activity for show form for add new post
* */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AddPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        // get text view element asociated with certain id
        TextView mPostButton = (TextView) findViewById(R.id.post_textview);

        // get text view element asociated with certain id
        ImageView mCloseButton = (ImageView) findViewById(R.id.close_button);

        // listen to onclick event on this textview
        mPostButton.setOnClickListener(new View.OnClickListener() {

            //implement method from setOnClickListener interface
            @Override
            public void onClick(View view) {

                //display toast when this textview clicked
                Toast.makeText(AddPostActivity.this, R.string.not_ready_feature,
                        Toast.LENGTH_LONG).show();
            }
        });

        // listen to onclick event on this textview
        mCloseButton.setOnClickListener(new View.OnClickListener() {

            //implement method from setOnClickListener interface
            @Override
            public void onClick(View view) {

                //display toast when this textview clicked
                Intent timelineIntent = new Intent(AddPostActivity.this, DashboardActivity.class);
                startActivity(timelineIntent);
            }
        });
    }
}