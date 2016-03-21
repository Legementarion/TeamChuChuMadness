package com.example.lego.teamchuchumadness;


import android.content.ActivityNotFoundException;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    ViewTeam myDialogFragment;
    Button teamLogo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialogFragment = new ViewTeam();
        teamLogo = (Button) findViewById(R.id.bt_choose_team);

        teamLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FragmentManager manager = getSupportFragmentManager();
                    myDialogFragment.show(manager, "dialog");
                } catch (ActivityNotFoundException e) {
                    String errorMessage = "ololo";
                    Toast toast = Toast.makeText(getApplicationContext(), errorMessage, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }


}
