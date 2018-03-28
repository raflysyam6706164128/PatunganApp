package org.d3ifcool.patungan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    // declare EditText data type variable
    private EditText mEmailEditText, mPasswordEditText;

    // declare String for username and password static credentials
    private String mUsername = getString(R.string.username_login), mPassword=getString(R.string.password_login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //get elements with certain Id
        TextView loginTitleTextView = (TextView) findViewById(R.id.loginTitle_textview);
        mEmailEditText = (EditText) findViewById(R.id.email_editText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);
        TextView forgotPasswordTextView = (TextView) findViewById(R.id.forgot_password_textview);
        Button mLoginButton = (Button) findViewById(R.id.login_button);


        /*
            load custom fonts from assets
         */
        Typeface gothamRoundedBook = Typeface.createFromAsset(getAssets(), getString(R.string.gothamroundedbook_path));

        /*
            set element with custom fonts.
         */
        mEmailEditText.setTypeface(gothamRoundedBook);
        mPasswordEditText.setTypeface(gothamRoundedBook);

        // listen to onclick event on mLoginButton
        mLoginButton.setOnClickListener(new View.OnClickListener() {

            //implementing onclick method from onClickListener interface
            @Override
            public void onClick(View view) {

                // get value from email editText
                String usernameInputed = mEmailEditText.getText().toString();

                // get value from password editText
                String passwordInputed = mPasswordEditText.getText().toString();

                // validate edittext value
                if(usernameInputed.equals(mUsername) && passwordInputed.equals(mPassword)) {

                    // if (true) go to dashboard activity with intent
                    Intent dashboardIntent = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(dashboardIntent);

                } else {
                    // if(false) display Toast with wrong credential message
                    Toast.makeText(LoginActivity.this, R.string.invalid_login,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}