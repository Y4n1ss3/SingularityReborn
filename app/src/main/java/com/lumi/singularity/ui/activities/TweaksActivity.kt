package com.lumi.singularity.ui.activities

import android.content.Context
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
import com.lumi.singularity.system.DnsBlockerService
import com.lumi.singularity.system.TweakService
import com.lumi.singularity.ui.theme.SingularityRebornTheme

class TweaksActivity : ComponentActivity() {

    private val sharedPrefs by lazy {
        getSharedPreferences("singularity_prefs", Context.MODE_PRIVATE)
    }

    // Read "is_rooted" from intent like upstream
    val isRooted: Boolean get() = intent?.getBooleanExtra("is_rooted", false) ?: false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TweaksScreen()
                }
            }
        }
    }

    private fun sendCustomLedIntent() {
        val red = sharedPrefs.getInt("led_red", 255)
        val green = sharedPrefs.getInt("led_green", 255)
        val blue = sharedPrefs.getInt("led_blue", 255)
        val intent = Intent(this, TweakService::class.java).apply {
            action = TweakService.ACTION_START_CUSTOM_LED
            putExtra("RED", red)
            putExtra("GREEN", green)
            putExtra("BLUE", blue)
        }
        startService(intent)
    }

    @Composable
    fun TweaksScreen() {
        // Initialize toggle states from sharedPrefs running-state flags (matching upstream)
        var killSwitchEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("kill_switch_running", false)
        ) }
        var rgbLedEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("rgb_led_is_running", false)
        ) }
        var customLedEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("custom_led_is_running", false)
        ) }
        var powerLedEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("power_led_is_running", false)
        ) }
        var minFreqEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("min_freq_is_running", false)
        ) }
        var maxFreqEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("max_freq_is_running", false)
        ) }
        var usbInterceptorEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("usb_interceptor_running", false)
        ) }
        var otaBlockerEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("ota_blocker_running", false)
        ) }
        var fanOverrideEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("fan_override_is_running", false)
        ) }
        var chargeLimitEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("charge_limit_is_running", false)
        ) }
        var linkFixEnabled by remember { mutableStateOf(
            sharedPrefs.getBoolean("link_fix_running", false)
        ) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Tweaks", style = MaterialTheme.typography.headlineLarge)

            // Kill Switch (DnsBlockerService) - matches upstream TweaksActivity
            TweakSwitch("Kill Switch", killSwitchEnabled) { enabled ->
                killSwitchEnabled = enabled
                val action = if (enabled) DnsBlockerService.ACTION_START else DnsBlockerService.ACTION_STOP
                startService(Intent(this@TweaksActivity, DnsBlockerService::class.java).setAction(action))
            }

            TweakSwitch("RGB LED", rgbLedEnabled) { enabled ->
                rgbLedEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_RGB else TweakService.ACTION_STOP_RGB
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            // Custom LED sends RED/GREEN/BLUE extras from saved prefs (matching upstream)
            TweakSwitch("Custom LED", customLedEnabled) { enabled ->
                customLedEnabled = enabled
                if (enabled) {
                    sendCustomLedIntent()
                } else {
                    startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(TweakService.ACTION_STOP_CUSTOM_LED))
                }
            }

            TweakSwitch("Power LED", powerLedEnabled) { enabled ->
                powerLedEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_POWER_LED else TweakService.ACTION_STOP_POWER_LED
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("Min Freq Lock", minFreqEnabled) { enabled ->
                minFreqEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_MIN_FREQ else TweakService.ACTION_STOP_MIN_FREQ
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("Max Freq Lock", maxFreqEnabled) { enabled ->
                maxFreqEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_MAX_FREQ else TweakService.ACTION_STOP_MAX_FREQ
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("USB Interceptor", usbInterceptorEnabled) { enabled ->
                usbInterceptorEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_USB_INTERCEPTOR else TweakService.ACTION_STOP_USB_INTERCEPTOR
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("OTA Blocker", otaBlockerEnabled) { enabled ->
                otaBlockerEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_OTA_BLOCKER else TweakService.ACTION_STOP_OTA_BLOCKER
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("Fan Override", fanOverrideEnabled) { enabled ->
                fanOverrideEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_FAN_OVERRIDE else TweakService.ACTION_STOP_FAN_OVERRIDE
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("Charge Limit", chargeLimitEnabled) { enabled ->
                chargeLimitEnabled = enabled
                val action = if (enabled) TweakService.ACTION_SET_CHARGE_LIMIT else TweakService.ACTION_STOP_CHARGE_LIMIT
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }

            TweakSwitch("Link Fix", linkFixEnabled) { enabled ->
                linkFixEnabled = enabled
                val action = if (enabled) TweakService.ACTION_START_LINK_FIX else TweakService.ACTION_STOP_LINK_FIX
                startService(Intent(this@TweaksActivity, TweakService::class.java).setAction(action))
            }
        }
    }

    @Composable
    fun TweakSwitch(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(label, style = MaterialTheme.typography.bodyLarge)
                Switch(checked = checked, onCheckedChange = onCheckedChange)
            }
        }
    }
}

