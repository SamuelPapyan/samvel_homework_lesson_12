package com.example.samvel_homework_lesson_12;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ThirdActivity extends AppCompatActivity {
    private AppCompatButton alertDialogue1;
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialogs);

        alertDialogue1 = findViewById(R.id.alertDialogButton1);
        if(alertDialogue1 != null){
            alertDialogue1.setOnClickListener(v->{
                setAlertDialogue1();
            });
        }
    }
    public void setAlertDialogue1(){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Are you sure?")
                .setIcon(R.drawable.info_icon)
                .setMessage("You won't be albe to recover this file.")
                .setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        setAlertDialogue2();
                    }
                })
                .setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .create();
    }
    public void setAlertDialogue2(){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Deleted!")
                .setMessage("Your imaginary file was deleted.")
                .setIcon(R.drawable.check_icon)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).create();
    }

}