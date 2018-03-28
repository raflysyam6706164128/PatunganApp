package org.d3ifcool.patungan;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    // declare TextView data type variable
    TextView mEmailNotifHintTextView;

    // declare EditText data type variable
    EditText mEmailEditText, mFullNameEditText, mPasswordEditText;

    //declare Button data type variable
    Button mRegisterButton;

    // declare Typeface data type variable
    Typeface mGothamRounded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // get elements with certain id
        mEmailNotifHintTextView = (TextView) findViewById(R.id.emailNotifHint_textview);
        mEmailEditText = (EditText) findViewById(R.id.email_editText);
        mFullNameEditText = (EditText) findViewById(R.id.fullname_editText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);
        mRegisterButton = (Button) findViewById(R.id.register_button);

        // set .ttf font file path
        mGothamRounded = Typeface.createFromAsset(getAssets(), "fonts/GothamRoundedLight.ttf");

        // set typeface for editText
        mEmailEditText.setTypeface(mGothamRounded, Typeface.BOLD);

        // set typeface for editText
        mFullNameEditText.setTypeface(mGothamRounded, Typeface.BOLD);

        // set typeface for editText
        mPasswordEditText.setTypeface(mGothamRounded, Typeface.BOLD);

    }

    // method for register user
    public void makeUser(View view) {

        //displaying not ready feature message with Toast
        Toast.makeText(RegisterActivity.this, "Fitur Masih Belum Tersedia!",
                Toast.LENGTH_LONG).show();
    }
}