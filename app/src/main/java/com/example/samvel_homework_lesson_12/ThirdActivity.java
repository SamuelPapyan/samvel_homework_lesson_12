package com.example.samvel_homework_lesson_12;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ThirdActivity extends AppCompatActivity {
    private AppCompatButton alertDialogue1;
    private AppCompatButton alertDialogue2;
    private AppCompatButton alertDialogue3;
    private AppCompatButton alertDialogue4;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialogs);

        alertDialogue1 = findViewById(R.id.alertDialogButton1);
        alertDialogue2 = findViewById(R.id.alertDialogButton2);
        alertDialogue3 = findViewById(R.id.alertDialogButton3);
        alertDialogue4 = findViewById(R.id.alertDialogButton4);
        if(alertDialogue1 != null){
            alertDialogue1.setOnClickListener(v->{
                setAlertDialogue1();
            });
        }
        if(alertDialogue2 != null){
            alertDialogue2.setOnClickListener(v->{
                setAlertDialogue1();
            });
        }
        if(alertDialogue3 != null){
            alertDialogue3.setOnClickListener(v->{
                setAlertDialogue1();
            });
        }
        if(alertDialogue4 != null){
            alertDialogue4.setOnClickListener(v->{
                setAlertDialogue1();
            });
        }
    }
    public void setAlertDialogue1(){
        View view = LayoutInflater.from(this).inflate(R.layout.alert_1,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        view.findViewById(R.id.yes_delete_button).setOnClickListener(v->dialog.dismiss());
    }
    public void setAlertDialogue2(){
        View view = LayoutInflater.from(this).inflate(R.layout.alert_2,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        view.findViewById(R.id.cancel_button).setOnClickListener(v->dialog.dismiss());
        view.findViewById(R.id.delete_button).setOnClickListener(v->dialog.dismiss());
    }
    public void setAlertDialogue3(){
        View view = LayoutInflater.from(this).inflate(R.layout.alert_3,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        view.findViewById(R.id.ok_button).setOnClickListener(v->dialog.dismiss());
    }
    public void setAlertDialogue4(){
        View view = LayoutInflater.from(this).inflate(R.layout.alert_4,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}