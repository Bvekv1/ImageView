package com.screencrack.imageview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdoRose, rdoRiver;
    ImageView imgShow;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoRose = findViewById(R.id.rdoRose);
        rdoRiver = findViewById(R.id.rdoRiver);
        imgShow = findViewById(R.id.imgShow);

        rdoRose.setOnClickListener(this);
        rdoRiver.setOnClickListener(this);
        builder= new AlertDialog.Builder(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdoRose:
                builder.setMessage("Do you want to load image ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rdoRose.setChecked(false);
                    imgShow.setImageResource(R.drawable.rose);
                    Toast.makeText(getApplicationContext(),"You clicked yes", Toast.LENGTH_SHORT).show();
                }
            })
                .setNegativeButton("No", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rdoRose.setChecked(false);
                    imgShow.setImageDrawable(null);
                    Toast.makeText(getApplicationContext(),"You clicked no", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                }
            });
                AlertDialog bibek =builder.create();
                bibek.setTitle("Alert Box Rose");
                bibek.show();
                break;
                //creating dialog box



            case R.id.rdoRiver:
                builder.setMessage("Do you want to load image ?")
                 .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         rdoRiver.setChecked(false);
                         imgShow.setImageResource(R.drawable.river);
                         Toast.makeText(getApplicationContext(), "You clicked yes", Toast.LENGTH_SHORT).show();

                     }
                 })
             .setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     rdoRiver.setChecked(false);
                     imgShow.setImageDrawable(null);
                     Toast.makeText(getApplicationContext(), "You clicked no", Toast.LENGTH_SHORT).show();
                     dialog.cancel();


                 }
             });
                AlertDialog alert =builder.create();
                alert.setTitle("Alert Box River");
                alert.show();
                break;






        }
    }
}
