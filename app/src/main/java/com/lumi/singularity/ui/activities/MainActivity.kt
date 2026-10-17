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
import android.os.Build

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

    companion object {
        // Firmware sets from upstream APK
        val SUPPORTED_MODELS_BASIC = setOf("eureka", "panther")
        val SUPPORTED_MODELS_FULL = setOf("hollywood", "eureka", "panther", "xse_panther", "seacliff")
        
        val FIRMWARE_SET_1 = setOf(
            "52106880032500150", "52106880035500150", "52106880036800150", "52106880038100150",
            "52106880041300150", "52106880041500150", "52106880052400150", "52150470014600150",
            "52150470020900150", "52150470026300150", "52150470027100150", "52150470030200150",
            "52150470034100150", "52150470034600150", "52175280016700150", "52175280018900150",
            "52175280022600150", "52175280027400150", "52175280028600150", "52175280031200150",
            "52175280039900150", "52202280016300150", "52202280019500150", "52202280021800150",
            "52202280025400150", "52202280027400150", "52202280028100150", "52222680019700150",
            "52222680020900150", "52222680023900150", "52222680024500150", "52222680026600150",
            "52222680028100150", "52222680032600150", "52242990012600150", "52242990017700150",
            "52242990018400150", "52242990019700150", "52242990021400150", "52242990023000150",
            "52242990023400150", "52242990024200150"
        )

        // Firmware set 2 from upstream APK (set z)
        val FIRMWARE_SET_2 = setOf(
            "2921110037200610", "2921110038400610", "2921110041700610", "2921110053000610",
            "3296320014500610", "3296320020900610", "3296320026500610", "3296320027400610",
            "3296320030600610", "3296320034600610", "3296320034800610", "3451870014800610",
            "3451870018000610", "3451870019900610", "3451870024000610", "3451870029100610",
            "3451870030300610", "3451870033000610", "3594280009600610", "3594280014400610",
            "3594280016000610", "3594280019200610", "3594280021600610", "3594280025400610",
            "3594280027100610", "3594280027800610", "3697600015800610", "3697600019500610",
            "3697600020700610", "3697600023700610", "3697600024300610", "3697600027800610",
            "3697600032300610", "3814840012900610", "3814840015800610", "3814840018300610",
            "3814840019100610", "3814840020600610", "3814840021800610", "3814840023400610",
            "3814840023900610", "3814840024700610"
        )

        // Firmware set 3 from upstream APK (set A)
        val FIRMWARE_SET_3 = setOf(
            "51943020036500520", "51943020043400520", "51943020048700520", "51943020050500520",
            "51943020052200520", "51943020055900520", "51943020065300520", "52083180010100520",
            "52083180015100520", "52083180022600520", "52083180023600520", "52083180027000520",
            "52083180031500520", "52083180032000520", "52168470022300520", "52168470026700520",
            "52168470029300520", "52168470033700520", "52168470039400520", "52168470040700520",
            "52168470043600520", "52168470052900520", "52270740013000520", "52270740021500520",
            "52270740024300520", "52270740028400520", "52270740031100520", "52270740034800520",
            "52270740036900520", "52270740038100520", "52345320022000520", "52345320026300520",
            "52345320027600520", "52345320031000520", "52345320031600520", "52345320035400520",
            "52345320040100520", "52433670017700520", "52433670023300520", "52433670026500520",
            "52433670028200520", "52433670030600520", "52433670032200520", "52433670034300520",
            "52433670035200520", "52433670036000520"
        )

        // Firmware set 4 from upstream APK (set B)
        val FIRMWARE_SET_4 = setOf(
            "51360500027200340", "51360500032000340", "51360500035000340", "51360500037600340",
            "51360500040800340", "51360500051900340", "51412760014500340", "51412760020900340",
            "51412760025900340", "51412760027100340", "51412760030200340", "51412760034600340",
            "51436340028700340", "51436340031400340", "51436340040000340", "51463340027700340",
            "51483620019200340", "51483620020700340", "51483620023800340", "51483620024400340",
            "51483620026500340", "51483620027600340", "51483620032400340", "51503870018000340",
            "51503870018800340", "51503870019200340", "51503870020100340", "51503870021300340",
            "51503870023600340", "51503870024400340"
        )

        // Firmware set 5 from upstream APK (set C)
        val FIRMWARE_SET_5 = setOf(
            "712720041601570", "712720049401570", "752170024601570", "772360028001570",
            "772360030601570", "772360039101570", "796930021201570", "796930024901570",
            "796930026601570", "796930027301570", "836890021501570", "836890023601570",
            "836890024401570"
        )

        fun isModelSupported(): Boolean {
            return SUPPORTED_MODELS_FULL.contains(Build.PRODUCT)
        }

        fun isBasicModelSupported(): Boolean {
            return SUPPORTED_MODELS_BASIC.contains(Build.PRODUCT)
        }

        fun isFirmwareSupported(): Boolean {
            val incremental = Build.VERSION.INCREMENTAL
            return FIRMWARE_SET_1.contains(incremental) ||
                   FIRMWARE_SET_2.contains(incremental) ||
                   FIRMWARE_SET_3.contains(incremental) ||
                   FIRMWARE_SET_4.contains(incremental) ||
                   FIRMWARE_SET_5.contains(incremental)
        }
    }

}

