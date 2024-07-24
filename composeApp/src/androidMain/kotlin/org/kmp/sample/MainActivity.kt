package org.kmp.sample

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import preferences.createPreferencesDataStore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                prefs = remember {
                    createPreferencesDataStore(applicationContext)
                }
            )
        }
    }
}