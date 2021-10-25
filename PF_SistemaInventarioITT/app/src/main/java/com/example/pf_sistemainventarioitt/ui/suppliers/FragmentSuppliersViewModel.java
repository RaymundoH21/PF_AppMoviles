package com.example.pf_sistemainventarioitt.ui.suppliers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentSuppliersViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragmentSuppliersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menu de los proveedores");
    }

    public LiveData<String> getText() {
        return mText;
    }
}