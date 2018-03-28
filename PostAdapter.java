package org.d3ifcool.patungan;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/* Custom adapter for Post listView */

public class PostAdapter extends ArrayAdapter<Post> {

    // parent constructor from ArrayAdapter Class
    /*
    * @param1 : context:Context
    * @param2 : transactions:ArrayList<Transaction>
    * */
    public PostAdapter(@NonNull Context context, @NonNull List<Post> posts) {
        super(context, 0, posts);
    }

    // method for get view for custom list view
    /*
    * @param1 : position:Integer
    * @param2 : convertView:View
    * @param3 : parent:ViewGroup
    * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // initialize with convertView
        View listItemView = convertView;

        if (listItemView == null) {

            // inflate custom list_view if list item null
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_timeline, parent, false);
        }

        // get position of Post
        Post currentPost = getItem(position);

        // get element with certain Id
        TextView fullNameTextView = (TextView) listItemView.findViewById(R.id.fullname_textview);

        // set textView Text
        fullNameTextView.setText("John Doe");

        // get element with certain Id
        TextView postTimeTextView = (TextView) listItemView.findViewById(R.id.posttime_textview);

        // set textView Text
        postTimeTextView.setText("2 minutes ago");

        // get element with certain Id
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textview);

        // set textView Text
        titleTextView.setText(currentPost.getPostTitle());

        // get element with certain Id
        TextView dueDateTextView = (TextView) listItemView.findViewById(R.id.duedate_textview);

        // set textView Text
        dueDateTextView.setText("Deadline : "+currentPost.getDue());

        // get element with certain Id
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_textview);

        // set textView Text
        priceTextView.setText("Harga : Rp "+Long.toString(currentPost.getPrice()));

        // get element with certain Id
        ImageView imgImageView = (ImageView) listItemView.findViewById(R.id.foto);

        // set image for imageView
        imgImageView.setImageResource(currentPost.getImg());

        // get element with certain Id
        TextView detailsButton = (TextView) listItemView.findViewById(R.id.details_textview);

        // set textView Text
        detailsButton.setText("Details");


        // return custom list view
        return listItemView;
    }
}