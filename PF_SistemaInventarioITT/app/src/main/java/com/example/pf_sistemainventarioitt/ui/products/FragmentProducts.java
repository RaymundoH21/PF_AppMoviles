package com.example.pf_sistemainventarioitt.ui.products;

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
import com.example.pf_sistemainventarioitt.databinding.FragmentHomeBinding;
import com.example.pf_sistemainventarioitt.databinding.FragmentProductsFragmentBinding;
import com.example.pf_sistemainventarioitt.ui.home.HomeViewModel;

public class FragmentProducts extends Fragment {

    private FragmentProductsViewModel productsViewModel;
    private FragmentProductsFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        productsViewModel =
                new ViewModelProvider(this).get(FragmentProductsViewModel.class);

        binding = FragmentProductsFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProducts;
        productsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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