package com.example.usodefragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.usodefragments.databinding.FragmentTriviaBinding;


public class TriviaFragment extends Fragment {
public static final String NAME_PARAM = "name";
private FragmentTriviaBinding binding;

    public TriviaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initBinding(inflater,container);
        obtainNameParam();
        return binding.getRoot();
    }

    private void initBinding(LayoutInflater inflater, ViewGroup container) {
        binding = FragmentTriviaBinding.inflate(inflater,container,false);
    }
    private void obtainNameParam(){
        String name= getArguments().getString(NAME_PARAM);
        Toast.makeText(getContext(),name,Toast.LENGTH_SHORT).show();
    }
}