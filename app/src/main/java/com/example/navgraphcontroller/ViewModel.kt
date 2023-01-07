package com.example.navgraphcontroller

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel:ViewModel() {

    var count3 = MutableLiveData<Int>()

    init{
        count3.value = 0
    }

}