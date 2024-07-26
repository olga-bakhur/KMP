package di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

// Provide through Di
fun createPreferencesDataStore(): DataStore<Preferences> {
    return di.createPreferencesDataStore {
        val directory = NSFileManager.defaultManager.URLForDirectory(
            directory = NSDocumentDirectory,
            inDomain = NSUserDomainMask,
            appropriateForURL = null,
            create = false,
            error = null
        )

        requireNotNull(directory).path + "/$PREFERENCES_DATA_STORE_FILE_NAME"
    }
}

