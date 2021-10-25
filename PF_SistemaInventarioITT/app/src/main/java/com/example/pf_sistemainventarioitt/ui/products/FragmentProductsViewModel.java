package com.example.pf_sistemainventarioitt.ui.products;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentProductsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragmentProductsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menu de productos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}