package com.examrdonoso.exam.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examrdonoso.exam.fr.aficiones.Fragmento1;
import com.examrdonoso.exam.fr.aficiones.Fragmento2;
import com.examrdonoso.exam.fr.aficiones.Fragmento3;


public class Paginador extends FragmentPagerAdapter {

    private final Context context;

    public Paginador(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragmento1();
            case 1:
                return new Fragmento2();
            case 2:
                return new Fragmento3();
            default:
                return new Fragmento1();
        }
    }

    @Override
    public int getCount() {
        return 3; // Número de fragments
    }
}

