package com.example.colorpicker;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorsViewModel extends ViewModel {

    private ColorsViewModel colorsViewModel;
    private MutableLiveData<LinkedList<String>> colorsLL;


    public ColorsViewModel() {
        colorsLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList<>();
        colorsLL.setValue(l);

    }

    public void setColorsLL(LinkedList<String> l) {
        colorsLL.setValue(l);
    }

    public MutableLiveData<LinkedList<String>> getColors () {
        return colorsLL;
    }

    public void addColor(String c) {
        LinkedList<String> l = getColors().getValue();
        l.add(c);
        Log.i("COLORS", l.toString());
        colorsLL.setValue(l);
    }
}
