package org.d3ifcool.patungan;

/*
* This class for load custom fonts
* */

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;


public class Font extends AppCompatActivity {

    //declare typeface data type variable to store the assets path
    private Typeface mFontPathSource;

    // declare string data type variable to store fonts name
    private String mFontName;

    // list for store custom fonts
    private ArrayList<Font> fontList = new ArrayList<>();

    // default empty param constructor
    public Font(){}

    // custom constructor to set the font path and names
    public Font(Typeface fontPathSource, String fontName) {
        this.mFontPathSource = fontPathSource;
        this.mFontName = fontName;
    }

    // method for add fonts to array list
    /*
    * @param = newFont: Font
    * */
    public void addFont(Font newFont) {
        fontList.add(newFont);
    }

    // method for get fonts from array list
    /*
    * @param = fontName:String
    * */
    public Typeface getFont(String fontName) {
        Typeface font = null;
        for (int i = 0; i < fontList.size(); i++) {
            if(fontName.equals(fontList.get(i).mFontName))
                font = fontList.get(i).mFontPathSource;
        }
        return font;
    }
}