package com.example.lego.teamchuchumadness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;

        if (convertView == null) {
            grid = new View(mContext);
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.cell_grid, parent, false);
        } else {
            grid = (View) convertView;
        }
        mContacts = parent.getResources().getStringArray(R.array.country);

        ImageView imageView = (ImageView) grid.findViewById(R.id.imagepart);
        TextView textView = (TextView) grid.findViewById(R.id.textpart);

        imageView.setImageResource(R.drawable.fl);
        imageView.setMaxHeight(10);
        imageView.setMaxWidth(15);
        textView.setText(mContacts[position]);
        return grid;
    }

    // Конструктор
    public TeamAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId, context.getResources().getStringArray(R.array.country));
        // TODO Auto-generated constructor stub
        this.mContext = context;
    }




}
