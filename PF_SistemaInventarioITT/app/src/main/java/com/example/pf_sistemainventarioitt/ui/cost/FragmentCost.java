package com.example.pf_sistemainventarioitt.ui.cost;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pf_sistemainventarioitt.R;
import com.example.pf_sistemainventarioitt.databinding.FragmentCostFragmentBinding;
import com.example.pf_sistemainventarioitt.databinding.FragmentHomeBinding;
import com.example.pf_sistemainventarioitt.ui.home.HomeViewModel;

public class FragmentCost extends Fragment {

    private FragmentCostViewModel mCostViewModelm;
    private FragmentCostFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mCostViewModelm =
                new ViewModelProvider(this).get(FragmentCostViewModel.class);

        binding = FragmentCostFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCost;
        mCostViewModelm.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}