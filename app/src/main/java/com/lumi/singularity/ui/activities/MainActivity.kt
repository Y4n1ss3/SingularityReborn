package com.lumi.singularity.ui.activities

import android.content.Intent
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
import com.lumi.singularity.model.DeviceModel
import com.lumi.singularity.model.FirmwareChecker
import com.lumi.singularity.system.ExploitService
import com.lumi.singularity.system.PayloadService
import com.lumi.singularity.utils.AssetUtils
import com.lumi.singularity.utils.RootUtils
import com.lumi.singularity.ui.theme.SingularityRebornTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Pre-extract assets in background for faster exploit execution
        val scope = kotlinx.coroutines.CoroutineScope(Dispatchers.IO)
        scope.launch {
            val startTime = System.currentTimeMillis()
            AssetUtils.extractExploitAssets(applicationContext)
            AssetUtils.extractFuguAssets(applicationContext)
            AssetUtils.extractPayloadAssets(applicationContext)
            android.util.Log.i("MainActivity", "Assets pre-extracted in ${System.currentTimeMillis() - startTime}ms")
        }
        
        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }

    @Composable
    fun MainScreen() {
        var isRooted by remember { mutableStateOf(RootUtils.isRooted()) }
        var selectedPayloads by remember { mutableStateOf(setOf<String>()) }
        val device = DeviceModel.getCurrent()
        val isSupported = FirmwareChecker.isSupported()
        val firmwareVersion = FirmwareChecker.getFirmwareVersion()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Singularity Reborn", style = MaterialTheme.typography.headlineLarge)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("Device Status", style = MaterialTheme.typography.titleMedium)
                    Text("Model: ${device.name}")
                    Text("Firmware: $firmwareVersion")
                    Text("Supported: ${if (isSupported) "Yes" else "No"}")
                    Text("Root: ${if (isRooted) "Available" else "Not Found"}")
                }
            }

            Button(
                onClick = { isRooted = RootUtils.isRooted() },
                modifier = Modifier.fillMaxWidth()
            ) { Text("Refresh Root Status") }

            // Exploit Section
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text("Step 1: Obtain Root", style = MaterialTheme.typography.titleMedium)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(
                            onClick = {
                                startService(Intent(this@MainActivity, ExploitService::class.java)
                                    .putExtra("exploit_type", "cheese"))
                            },
                            modifier = Modifier.weight(1f),
                            enabled = isSupported
                        ) { Text("Cheese") }
                        Button(
                            onClick = {
                                startService(Intent(this@MainActivity, ExploitService::class.java)
                                    .putExtra("exploit_type", "fugu"))
                            },
                            modifier = Modifier.weight(1f),
                            enabled = isSupported
                        ) { Text("Fugu") }
                    }
                }
            }

            // Payloads Section
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("Step 2: Select Payloads", style = MaterialTheme.typography.titleMedium)
                    val payloads = listOf(
                        "singularity_magisk" to "Install Magisk (Root)",
                        "disable_ota" to "Block OTA Updates",
                        "bootanimation" to "Custom Boot Animation",
                        "persistent_port" to "Persistent ADB Port",
                        "disable_wifi" to "Disable WiFi Telemetry",
                        "french_keyboard" to "Virtual Keyboard French AZERTY (Surface Projection)",
                        "cast_1080p60" to "Cast 1080p/60fps to Mobile (HD Streaming)",
                        "chromecast" to "Cast to Chromecast (No Meta App Required)",
                        "soft_reboot" to "Soft Reboot (Zygisk fix)"
                    )
                    payloads.forEach { (id, label) ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = id in selectedPayloads,
                                onCheckedChange = { checked ->
                                    selectedPayloads = if (checked) selectedPayloads + id
                                                       else selectedPayloads - id
                                }
                            )
                            Text(label, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
            }

            Button(
                onClick = {
                    startService(Intent(this@MainActivity, PayloadService::class.java)
                        .putStringArrayListExtra("payloads", ArrayList(selectedPayloads)))
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = isRooted && selectedPayloads.isNotEmpty()
            ) { Text("Execute Payloads") }
        }
    }
}