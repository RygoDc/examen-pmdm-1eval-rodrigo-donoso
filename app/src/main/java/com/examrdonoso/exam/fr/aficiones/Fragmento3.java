package com.examrdonoso.exam.fr.aficiones;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.examrdonoso.exam.R;


public class Fragmento3 extends Fragment {
    private Button callDialogButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f3, container, false);

        callDialogButton = callDialogButton.findViewById(R.id.callDialogButton);
        callDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getApplicationContext());
                dialogBuilder.setTitle("Rodrigo Donoso");
                dialogBuilder.setMessage("Hola Profesor");
                dialogBuilder.setCancelable(true);
                dialogBuilder.setPositiveButton("Aprobar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Aprobado", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });
                dialogBuilder.setNegativeButton("Suspenso", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Suspenso", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alertDialog = dialogBuilder.create();
                alertDialog.show();
            }
        });


        return view;
    }

    private Context getApplicationContext() {

        return null;
    }
}
