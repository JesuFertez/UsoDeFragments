package com.example.usodefragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usodefragments.databinding.FragmentWinnerBinding;


public class WinnerFragment extends Fragment {

private FragmentWinnerBinding binding;

public WinnerFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initBinding(inflater,container);
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentWinnerBinding.inflate(inflater,container,false);
    }


}