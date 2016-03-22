package com.example.lego.teamchuchumadness;

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
    String buff;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.team_logo_dialog, container, false);
        final GridView g = (GridView) rootView.findViewById(R.id.gridView);
        mAdapter = new TeamAdapter(inflater.getContext().getApplicationContext(),
                R.layout.team_logo_dialog, getResources().getStringArray(R.array.country));
        if (g.getAdapter() == null) {
            g.setAdapter(mAdapter);
            g.setOnItemSelectedListener(this);
        }
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                buff = ""+position;
                if (mAdapter.getContext().getResources().getStringArray(R.array.football_team1) == getResources().getStringArray(R.array.football_team1)){
                    dismiss();
                    Button teamLogo = (Button) getActivity().findViewById(R.id.bt_choose_team);
                    teamLogo.setText(buff);
                }
                mAdapter = new TeamAdapter(getContext().getApplicationContext(),
                        R.layout.team_logo_dialog, getResources().getStringArray(R.array.football_team1));
                g.setAdapter(mAdapter);
                Toast.makeText(parent.getContext(),""+position,Toast.LENGTH_SHORT).show();
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
