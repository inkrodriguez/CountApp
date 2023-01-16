package com.example.countapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var number = 0
    var numberCount = MutableLiveData<Int>()

    fun count() {
        numberCount.value = ++number
    }

}