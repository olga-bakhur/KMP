package di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

fun createPreferencesDataStore(context: Context): DataStore<Preferences> {
    return createPreferencesDataStore {
        context.filesDir.resolve(PREFERENCES_DATA_STORE_FILE_NAME).absolutePath
    }
}
