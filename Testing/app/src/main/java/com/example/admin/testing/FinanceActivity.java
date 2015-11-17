package com.example.admin.testing;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog;
import android.widget.Button;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
/**
 * Created by Admin on 17.11.2015.
 */

public class FinanceActivity extends AppCompatActivity{

    FinanceFragment frag;
    FragmentTransaction ftrans;
    final Context context = this;
    private TextView final_text;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finance_main);

        frag = new FinanceFragment();
        ftrans = getFragmentManager().beginTransaction();
        ftrans.add(R.id.financeFL,frag);
        ftrans.commit();


    }
    public void onClick(View view)
    {
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.prompt, null);
        AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
        mDialogBuilder.setView(promptsView);
        final EditText userInput = (EditText) promptsView.findViewById(R.id.input_text);
        mDialogBuilder
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                //Вводим текст и отображаем в строке ввода на основном экране:

                            }
                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alertDialog = mDialogBuilder.create();

        //и отображаем его:
        alertDialog.show();


    }
}
