package com.example.md7.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.md7.R;

public class FirstFragment extends Fragment {

    public static FirstFragment newIstance(Bundle bundle){
        FirstFragment fFragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putBundle("getArgs",bundle);
        fFragment.setArguments(args);
        return fFragment;
    }

    public FirstFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }
}
