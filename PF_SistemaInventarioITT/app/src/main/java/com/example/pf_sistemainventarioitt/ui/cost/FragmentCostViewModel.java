package com.example.pf_sistemainventarioitt.ui.cost;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentCostViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragmentCostViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menu de gastos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}