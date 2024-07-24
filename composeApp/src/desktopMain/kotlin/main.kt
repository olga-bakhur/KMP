import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.initKoin
import preferences.PREFERENCES_DATA_STORE_FILE_NAME
import preferences.createPreferencesDataStore

fun main() {
    initKoin()

    val prefs = createPreferencesDataStore {
        PREFERENCES_DATA_STORE_FILE_NAME
    }

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KMPSample",
        ) {
            App(prefs = prefs)
        }
    }
}