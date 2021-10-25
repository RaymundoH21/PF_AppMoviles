package com.example.pf_sistemainventarioitt.ui.sections;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentSectionsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragmentSectionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el menu de los departamentos de la institucion");
    }

    public LiveData<String> getText() {
        return mText;
    }
}