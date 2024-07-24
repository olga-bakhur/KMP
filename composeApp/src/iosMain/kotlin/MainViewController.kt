import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin
import preferences.createPreferencesDataStore

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App(
        prefs = remember {
            createPreferencesDataStore()
        }
    )
}