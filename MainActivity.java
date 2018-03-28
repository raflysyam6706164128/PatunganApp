package org.d3ifcool.patungan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare Font data type variable
    Font mFont;

    // declare TextView data type variable
    TextView mTitleTextView, mMottoTextView;

    // declare Button data type variable
    Button mRegisterButton, mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate new font object
        mFont = new Font();

        // method for add custom fonts
        mFont.addFont(new Font(
                Typeface.createFromAsset(getAssets(), getString(R.string.coquette_path)), getString(R.string.coquette)
        ));
        mFont.addFont(new Font(
                Typeface.createFromAsset(getAssets(), getString(R.string.gothamroundedlight_path)), getString(R.string.gothamroudedlight)
        ));

        mTitleTextView  = (TextView) findViewById(R.id.title_textview);
        mMottoTextView = (TextView) findViewById(R.id.motto_textview);
        mRegisterButton = (Button) findViewById(R.id.register_button);
        mLoginButton = (Button) findViewById(R.id.login_button);

        mTitleTextView.setTypeface(mFont.getFont("coquette"));
        mMottoTextView.setTypeface(mFont.getFont("gothamRoundedLight"), Typeface.BOLD);

        /*
         *listen to onclick event from register and login button
         */
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //go to register activity with intent
                Intent regIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(regIntent);
            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //go to login activity with intent
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}