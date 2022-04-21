// Autor: Nicolás Esleyder Caytuiro Silva
// Fecha: 21/04/2022

package com.example.examen1rafase.ui.bebidas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bebidas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}