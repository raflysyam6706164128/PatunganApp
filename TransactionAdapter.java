package org.d3ifcool.patungan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/* Custom Transaction Adapter for listview */

public class TransactionAdapter extends ArrayAdapter<Transaction> {


    // parent constructor from ArrayAdapter Class
    /*
    * @param1 : context:Context
    * @param2 : transactions:ArrayList<Transaction>
    * */
    public TransactionAdapter(@NonNull Context context, @NonNull List<Transaction> transactions) {
        super(context, 0, transactions);
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

        // inflate custom list_view if list item null
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_transaction, parent, false);
        }

        // get position of Transaction
        Transaction currentTransaction = getItem(position);

        // get element with certain Id
        TextView fullNameTextView = (TextView) listItemView.findViewById(R.id.fullname_textview);

        // set textView Text
        fullNameTextView.setText("John Doe");

        // get element with certain Id
        TextView postTimeTextView = (TextView) listItemView.findViewById(R.id.posttime_textview);

        // set textView Text
        postTimeTextView.setText("2 minutes ago");


        // get element with certain id
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.transaction_textview);

        // set textView Text
        titleTextView.setText("Anda melakukan "+currentTransaction.getTransaksi()+" sebesar "+
        currentTransaction.getBiaya());

        // get element with certain id
        ImageView imgImageView = (ImageView) listItemView.findViewById(R.id.foto);

        //set image for ImageView
        imgImageView.setImageResource(currentTransaction.getImg());

        // get element with certain id
        TextView detailsButton = (TextView) listItemView.findViewById(R.id.details_textview);

        // set text for textview
        detailsButton.setText("Details");

        // return custom list view
        return listItemView;
    }
}