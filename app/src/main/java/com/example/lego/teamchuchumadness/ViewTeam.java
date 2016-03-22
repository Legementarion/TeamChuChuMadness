package com.example.lego.teamchuchumadness;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

/**
 * @author Lego on 21.03.2016.
 */
public class ViewTeam extends DialogFragment implements
        AdapterView.OnItemSelectedListener {

    private TeamAdapter mAdapter;
    private String[] temp;

    Integer[] mImage = new Integer[]{R.drawable.fl0, R.drawable.fl1,
            R.drawable.fl2, R.drawable.fl3, R.drawable.fl4,
            R.drawable.fl5, R.drawable.fl6, R.drawable.fl7,
            R.drawable.fl8, R.drawable.fl9,R.drawable.fl10};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.team_logo_dialog, container, false);
        final GridView g = (GridView) rootView.findViewById(R.id.gridView);
        temp = getResources().getStringArray(R.array.country);
        mAdapter = new TeamAdapter(inflater.getContext().getApplicationContext(),
                R.layout.team_logo_dialog, temp, mImage);
        if (g.getAdapter() == null) {
            g.setAdapter(mAdapter);
            g.setOnItemSelectedListener(this);
        }
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Button teamLogo = (Button) getActivity().findViewById(R.id.bt_choose_team);
                teamLogo.setText(temp[position]);
                Drawable img = getContext().getResources().getDrawable(mImage[position]);
                img.setBounds( 0, 0, 50, 35 );
                teamLogo.setCompoundDrawables( img, null, null, null );
                temp = getResources().getStringArray(R.array.football_team_Ukraine);
                mAdapter = new TeamAdapter(getContext().getApplicationContext(),
                        R.layout.team_logo_dialog, temp);
                g.setAdapter(mAdapter);
            }
        });


        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
