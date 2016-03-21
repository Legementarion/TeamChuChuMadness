package com.example.lego.teamchuchumadness;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * @author Lego on 21.03.2016.
 */
public class ViewTeam extends DialogFragment implements
        AdapterView.OnItemSelectedListener {


    private TeamAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.team_logo_dialog, container, false);
        final GridView g = (GridView) rootView.findViewById(R.id.gridView);
        mAdapter = new TeamAdapter(inflater.getContext().getApplicationContext(),
                R.layout.team_logo_dialog);
        g.setAdapter(mAdapter);
        g.setOnItemSelectedListener(this);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // TODO Auto-generated method stub
            }
        });

        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
