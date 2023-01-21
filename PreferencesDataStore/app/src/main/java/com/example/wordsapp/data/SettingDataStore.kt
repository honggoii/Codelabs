package com.example.wordsapp.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import java.util.prefs.Preferences

class SettingDataStore(context: Context) {
}

private const val LAYOUT_PREFERENCES_NAME = "layout_preferences"

private val Context.dataStore : DataStore<Preferences> by preferencesDataStore(
    name = LAYOUT_PREFERENCES_NAME
)