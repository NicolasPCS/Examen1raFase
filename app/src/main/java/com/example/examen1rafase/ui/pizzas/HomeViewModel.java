// Autor: Nicolás Esleyder Caytuiro Silva
// Fecha: 21/04/2022

package com.example.examen1rafase.ui.pizzas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pizzas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}