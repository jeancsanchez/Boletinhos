package app.boletinhos.preferences

import android.content.SharedPreferences
import androidx.core.content.edit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserPreferences @Inject constructor(
    private val prefs: SharedPreferences
) {
    var isCrashReportEnabled: Boolean get() = prefs.getBoolean(CRASH_REPORTING_ENABLED, false)
        set(value) {
            prefs.edit {
                putBoolean(CRASH_REPORTING_ENABLED, value)
            }
        }

    companion object {
        const val PREFS_NAME = "APP_PREFS"
        private const val CRASH_REPORTING_ENABLED = "crash_reporting_enabled"
    }
}