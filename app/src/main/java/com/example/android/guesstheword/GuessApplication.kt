package com.example.android.guesstheword

import android.app.Application
import timber.log.Timber


class GuessApplication : Application() {

    init {
        Timber.plant(Timber.DebugTree())
    }
}