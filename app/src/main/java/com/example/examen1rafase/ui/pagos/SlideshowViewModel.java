// Autor: Nicolás Esleyder Caytuiro Silva
// Fecha: 21/04/2022

package com.example.examen1rafase.ui.pagos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pagos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}