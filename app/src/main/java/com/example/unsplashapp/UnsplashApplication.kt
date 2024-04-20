package com.example.unsplashapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//This class will be used by our dagger hilt to generate all the necessary code required
@HiltAndroidApp
class UnsplashApplication : Application(){

}