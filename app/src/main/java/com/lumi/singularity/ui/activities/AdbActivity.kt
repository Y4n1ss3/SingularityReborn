package com.lumi.singularity.ui.activities

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lumi.singularity.ui.theme.SingularityRebornTheme
import java.io.File

class AdbActivity : ComponentActivity() {

    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var scriptPath: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPrefs = getSharedPreferences("singularity_prefs", MODE_PRIVATE)

        // Match upstream: extract native lib path into a shell wrapper script
        val nativeLibPath = File(applicationInfo.nativeLibraryDir, "libsingularity_root_helper.so").absolutePath
        val extDir = getExternalFilesDir(null) ?: filesDir
        val scriptFile = File(extDir, "start_root_helper.sh")
        scriptFile.writeText("#!/system/bin/sh\nexec \"$nativeLibPath\" \"\$@\"\n")
        scriptPath = scriptFile.absolutePath

        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AdbScreen(scriptPath, sharedPrefs)
                }
            }
        }
    }

    @Composable
    private fun AdbScreen(scriptPath: String, prefs: SharedPreferences) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("ADB Manager", style = MaterialTheme.typography.headlineLarge)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("Root Helper", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "Script: $scriptPath",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        "Use this screen to manage ADB connections with root privileges.",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}