package com.lumi.singularity.ui.activities

import android.os.Bundle
import android.util.Log
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
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

class AdbRootActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isFuguSetup = intent.getBooleanExtra("is_fugu_setup", false)
        val usePort5555 = intent.getBooleanExtra("use_port_5555", false)
        val binaryName = intent.getStringExtra("binary_name") ?: "FUGU"

        // Match upstream: check verified boot state
        val verifiedBootState = try {
            val process = Runtime.getRuntime().exec("getprop ro.boot.verifiedbootstate")
            val result = BufferedReader(InputStreamReader(process.inputStream)).readText().trim()
            process.waitFor()
            result
        } catch (e: Exception) {
            Log.e("AdbRootActivity", "Failed to read ro.boot.verifiedbootstate", e)
            ""
        }

        val isBootloaderUnlocked = verifiedBootState == "orange"
        if (!isFuguSetup && !isBootloaderUnlocked) {
            Log.w("AdbRootActivity", "Magisk/patch flow opened on locked bootloader (verifiedbootstate='$verifiedBootState') — patch button will be locked")
        }
        val canPatch = isFuguSetup || !isBootloaderUnlocked
        val isAdbRootable = intent.getBooleanExtra("is_adb_rootable", false)

        // Persist bootloader state if changed (like upstream)
        val sharedPrefs = getSharedPreferences("singularity_prefs", MODE_PRIVATE)
        if (sharedPrefs.getBoolean("is_unlocked_bootloader", false) != isBootloaderUnlocked) {
            sharedPrefs.edit().putBoolean("is_unlocked_bootloader", isBootloaderUnlocked).apply()
        }

        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AdbRootScreen(
                        binaryName = binaryName,
                        verifiedBootState = verifiedBootState,
                        canPatch = canPatch,
                        isBootloaderUnlocked = isBootloaderUnlocked,
                        usePort5555 = usePort5555,
                        isAdbRootable = isAdbRootable
                    )
                }
            }
        }
    }

    private fun getAdbBinary(): File? {
        val file = File(applicationInfo.nativeLibraryDir, "libadb.so")
        return if (file.exists()) file else null
    }

    @Composable
    private fun AdbRootScreen(
        binaryName: String,
        verifiedBootState: String,
        canPatch: Boolean,
        isBootloaderUnlocked: Boolean,
        usePort5555: Boolean,
        isAdbRootable: Boolean
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("ADB Root", style = MaterialTheme.typography.headlineLarge)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("Status", style = MaterialTheme.typography.titleMedium)
                    Text("Binary: $binaryName")
                    Text("Bootloader: ${if (isBootloaderUnlocked) "Unlocked" else "Locked"} ($verifiedBootState)")
                    Text("ADB Rootable: ${if (isAdbRootable) "Yes" else "No"}")
                    Text("Port 5555: ${if (usePort5555) "Yes" else "No"}")
                }
            }

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text("Actions", style = MaterialTheme.typography.titleMedium)
                    Button(
                        onClick = { /* Start ADB root */ },
                        modifier = Modifier.fillMaxWidth(),
                        enabled = canPatch
                    ) { Text("Enable Root ADB") }
                }
            }
        }
    }
}