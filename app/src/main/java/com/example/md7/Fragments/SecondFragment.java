package com.example.md7.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.md7.R;

public class SecondFragment extends Fragment {

    public static SecondFragment newIstance(Bundle bundle){
        SecondFragment sFragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putBundle("getArgs",bundle);
        sFragment.setArguments(args);
        return sFragment;
    }

    public SecondFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second,container,false);
    }
}
