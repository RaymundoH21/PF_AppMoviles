package com.example.pf_sistemainventarioitt.ui.docs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentDocsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragmentDocsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menu de Documentos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}