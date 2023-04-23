package com.example.indiasforestmatrix.Navigation.ui.Aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.indiasforestmatrix.R;

public class AboutusFragment extends Fragment {

    private AboutusViewModel aboutusViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aboutusViewModel =
                ViewModelProviders.of(this).get(AboutusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aboutus, container, false);
      //  final TextView textView = root.findViewById(R.id.nav_aboutus);
        aboutusViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
       //         textView.setText(s);
            }
        });
        return root;
    }
}