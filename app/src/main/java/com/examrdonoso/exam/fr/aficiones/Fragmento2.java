package com.examrdonoso.exam.fr.aficiones;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.examrdonoso.exam.R;


public class Fragmento2 extends Fragment {
    private TextView welcomeText;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f2, container, false);

        welcomeText = view.findViewById(R.id.welcomeText);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("usuario", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("userName", "anónimo");

        welcomeText.setText("Hola " + name);

        return view;
    }
}
