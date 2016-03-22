package com.example.lego.teamchuchumadness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lego on 21.03.16.
 */
public class TeamAdapter extends ArrayAdapter<String> {

    private String[] mContacts ;
    private Context mContext;

    public TeamAdapter(Context context, int textViewResourceId, String[] res) {
        super(context, textViewResourceId, res);
        this.mContext = context;
        this.mContacts = res;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;

        if (convertView == null) {
            grid = new View(mContext);
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.cell_grid, parent, false);
        } else {
            grid = (View) convertView;
        }

        ImageView imageView = (ImageView) grid.findViewById(R.id.imagepart);
        TextView textView = (TextView) grid.findViewById(R.id.textpart);

        imageView.setImageResource(R.drawable.fl);
        textView.setText(mContacts[position]);
        return grid;
    }
}
