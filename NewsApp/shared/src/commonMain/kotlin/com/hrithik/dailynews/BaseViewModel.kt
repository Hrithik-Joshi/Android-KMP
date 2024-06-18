package com.hrithik.dailynews

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel() {

    //This property declares a CoroutineScope which is used to manage coroutines in the ViewModel.
    val scope: CoroutineScope

}