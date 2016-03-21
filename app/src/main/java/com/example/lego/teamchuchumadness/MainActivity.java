package com.example.lego.teamchuchumadness;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private TextView mSelectText;
    private TeamAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_logo_dialog);

//        mSelectText = (TextView) findViewById(R.id.info);
        final GridView g = (GridView) findViewById(R.id.gridView);
        mAdapter = new TeamAdapter(getApplicationContext(),
               R.layout.team_logo_dialog);
        g.setAdapter(mAdapter);
        g.setOnItemSelectedListener(this);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // TODO Auto-generated method stub
//                mSelectText.setText("Выбранный элемент: "
//                        + mAdapter.getItem(position));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
//        mSelectText.setText("Выбранный элемент: " + mAdapter.getItem(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
//        mSelectText.setText("Выбранный элемент: ничего");
    }
}
