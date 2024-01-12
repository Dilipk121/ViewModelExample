package com.mine.viewmodelexample

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var counter = 0

    fun getInitialCounter():Int{
            return counter
    }

    fun getCounterPlus():Int{
        return ++counter
    }

    fun getCounterMinus():Int{
        return --counter
    }


}