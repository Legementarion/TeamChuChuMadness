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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    Button teamclick;
    AlertDialog.Builder dialogBuilder;
    DialogFragment myDialogFragment;
    FragmentManager manager;
    private TeamAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamclick = (Button) findViewById(R.id.bt_choose_team);
        manager = getSupportFragmentManager();

        final GridView g = (GridView) findViewById(R.id.gridView);
        mAdapter = new TeamAdapter(getApplicationContext(),
                R.layout.team_logo_dialog);
//        g.setAdapter(mAdapter);
//        g.setOnItemSelectedListener(this);
//        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v,
//                                    int position, long id) {
//                // TODO Auto-generated method stub
//                String Message = "Выбранный элемент: "+ mAdapter.getItem(position);
////                Toast toast = Toast.makeText(this, Message, Toast.LENGTH_SHORT);
////                toast.show();
//
//            }
//        });

        teamclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialogFragment.show(manager, "dialog");
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String Message = "Выбранный элемент: "+ mAdapter.getItem(position);
        Toast toast = Toast.makeText(this, Message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        String Message = "Ничего не выбрано ";
        Toast toast = Toast.makeText(this, Message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
