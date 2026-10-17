package com.lumi.singularity.system

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.lumi.singularity.R
import kotlinx.coroutines.*
import java.io.File

class TweakService : Service() {
    private val supervisorScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private val workerScope = CoroutineScope(Dispatchers.IO)
    
    private val sharedPrefs: SharedPreferences by lazy {
        getSharedPreferences("singularity_prefs", MODE_PRIVATE)
    }

    private var chargeWatchReceiver: BroadcastReceiver? = null
    private var isCharging = false
    private var chargeWatchActive = false

    private var rgbLedRunning = false
    private var customLedRunning = false
    private var powerLedRunning = false
    private var minFreqRunning = false
    private var maxFreqRunning = false
    private var usbInterceptorRunning = false
    private var otaBlockerRunning = false
    private var persistProtectRunning = false
    private var gpuMinFreqRunning = false
    private var gpuMaxFreqRunning = false
    private var fanOverrideRunning = false
    private var chargeLimitRunning = false
    private var hideMc2Running = false
    private var fridaRunning = false
    private var linkFixRunning = false
    private var ovrLoaderOverrideRunning = false

    // Script file references (matching upstream fields E–S)
    private lateinit var rgbScriptFile: File            // E
    private lateinit var customLedScriptFile: File      // F
    private lateinit var powerLedScriptFile: File       // G
    private lateinit var minFreqScriptFile: File        // H
    private lateinit var maxFreqScriptFile: File        // I
    private lateinit var usbInterceptorScriptFile: File // J
    private lateinit var otaBlockerScriptFile: File     // K
    private lateinit var persistProtectScriptFile: File // L
    private lateinit var gpuMinFreqScriptFile: File     // M
    private lateinit var gpuMaxFreqScriptFile: File     // N
    private lateinit var fanOverrideScriptFile: File    // O
    private lateinit var fanTargetRpmFile: File         // P
    private lateinit var fanSleepEnabledFile: File      // Q
    private lateinit var chargeLimitScriptFile: File    // R
    private lateinit var hideMc2ScriptFile: File        // S

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()

        // Initialize all script File references in filesDir (parity with upstream onCreate)
        rgbScriptFile = File(filesDir, "rgb_led.sh")
        customLedScriptFile = File(filesDir, "custom_led.sh")
        powerLedScriptFile = File(filesDir, "power_led.sh")
        minFreqScriptFile = File(filesDir, "min_freq_lock.sh")
        maxFreqScriptFile = File(filesDir, "max_freq_lock.sh")
        usbInterceptorScriptFile = File(filesDir, "usb_interceptor.sh")
        otaBlockerScriptFile = File(filesDir, "ota_blocker.sh")
        File(filesDir, "ovr_loader_override.sh") // Created but not assigned — upstream does the same
        persistProtectScriptFile = File(filesDir, "persist_protect.sh")
        gpuMinFreqScriptFile = File(filesDir, "gpu_min_freq_lock.sh")
        gpuMaxFreqScriptFile = File(filesDir, "gpu_max_freq_lock.sh")
        fanOverrideScriptFile = File(filesDir, "fan_override.sh")
        fanTargetRpmFile = File(filesDir, "fan_target_rpm")
        fanSleepEnabledFile = File(filesDir, "fan_sleep_enabled")
        chargeLimitScriptFile = File(filesDir, "charge_limit.sh")
        hideMc2ScriptFile = File(filesDir, "hide_mc2.sh")

        startForeground(NOTIFICATION_ID, buildNotification())
        
        if (sharedPrefs.getBoolean("prox_sensor_disabled", false)) {
            // Upstream: prox_sensor_disabled starts charge watch, not direct sysfs toggle
            if (!chargeWatchActive) {
                chargeWatchActive = true
                startChargeWatch()
            }
        }
        
        // Note: upstream charge_notif_enabled starts a separate notification watcher (d4 case 8),
        // not the charge watch. That feature is not yet implemented in Reborn.
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val action = intent?.action
        if (action == null) {
            supervisorScope.launch { restoreRunningServices() }
            return START_STICKY
        }
        supervisorScope.launch { handleAction(action, intent) }
        return START_STICKY
    }


    private suspend fun handleAction(action: String, intent: Intent) {
        when (action) {
            ACTION_START_RGB -> startRgbLed(intent)
            ACTION_STOP_RGB -> stopRgbLed()
            ACTION_START_CUSTOM_LED -> startCustomLed(intent)
            ACTION_STOP_CUSTOM_LED -> stopCustomLed()
            ACTION_START_POWER_LED -> startPowerLed()
            ACTION_STOP_POWER_LED -> stopPowerLed()
            ACTION_START_MIN_FREQ -> startMinFreqLock(intent)
            ACTION_STOP_MIN_FREQ -> stopMinFreqLock()
            ACTION_START_MAX_FREQ -> startMaxFreqLock(intent)
            ACTION_STOP_MAX_FREQ -> stopMaxFreqLock()
            ACTION_START_USB_INTERCEPTOR -> startUsbInterceptor()
            ACTION_STOP_USB_INTERCEPTOR -> stopUsbInterceptor()
            ACTION_START_OTA_BLOCKER -> startOtaBlocker()
            ACTION_STOP_OTA_BLOCKER -> stopOtaBlocker()
            ACTION_START_PERSIST_PROTECT -> startPersistProtect()
            ACTION_STOP_PERSIST_PROTECT -> stopPersistProtect()
            ACTION_START_GPU_MIN_FREQ -> startGpuMinFreqLock(intent)
            ACTION_STOP_GPU_MIN_FREQ -> stopGpuMinFreqLock()
            ACTION_START_GPU_MAX_FREQ -> startGpuMaxFreqLock(intent)
            ACTION_STOP_GPU_MAX_FREQ -> stopGpuMaxFreqLock()
            ACTION_START_FAN_OVERRIDE -> startFanOverride(intent)
            ACTION_STOP_FAN_OVERRIDE -> stopFanOverride()
            ACTION_SET_FAN_RPM -> setFanRpm()
            ACTION_SET_CHARGE_LIMIT -> setChargeLimit(intent)
            ACTION_STOP_CHARGE_LIMIT -> stopChargeLimit()
            ACTION_START_HIDE_MC2 -> startHideMc2()
            ACTION_STOP_HIDE_MC2 -> stopHideMc2()
            ACTION_START_LINK_FIX -> startLinkFix()
            ACTION_STOP_LINK_FIX -> stopLinkFix()
            ACTION_START_FRIDA -> startFrida()
            ACTION_STOP_FRIDA -> stopFrida()
            ACTION_DISABLE_PROX_SENSOR -> disableProximitySensor()
            ACTION_ENABLE_PROX_SENSOR -> enableProximitySensor()
            ACTION_START_PROX_CHARGE_WATCH -> startProxChargeWatch()
            ACTION_STOP_PROX_CHARGE_WATCH -> stopProxChargeWatch()
            ACTION_STOP_ALL -> stopAllTweaks()
        }
    }

    private suspend fun restoreRunningServices() {
        if (sharedPrefs.getBoolean("rgb_led_is_running", false)) startRgbLed(Intent())
        if (sharedPrefs.getBoolean("custom_led_is_running", false)) startCustomLed(Intent())
        if (sharedPrefs.getBoolean("power_led_is_running", false)) startPowerLed()
        if (sharedPrefs.getBoolean("min_freq_is_running", false)) startMinFreqLock(Intent())
        if (sharedPrefs.getBoolean("max_freq_is_running", false)) startMaxFreqLock(Intent())
        if (sharedPrefs.getBoolean("usb_interceptor_running", false)) startUsbInterceptor()
        if (sharedPrefs.getBoolean("ota_blocker_running", false)) startOtaBlocker()
        if (sharedPrefs.getBoolean("persist_protect_running", false)) startPersistProtect()
        if (sharedPrefs.getBoolean("gpu_min_freq_is_running", false)) startGpuMinFreqLock(Intent())
        if (sharedPrefs.getBoolean("gpu_max_freq_is_running", false)) startGpuMaxFreqLock(Intent())
        if (sharedPrefs.getBoolean("fan_override_is_running", false)) startFanOverride(Intent())
        if (sharedPrefs.getBoolean("charge_limit_is_running", false)) setChargeLimit(Intent())
        if (sharedPrefs.getBoolean("hide_mc2_running", false)) startHideMc2()
        if (sharedPrefs.getBoolean("frida_is_running", false)) startFrida()
        if (sharedPrefs.getBoolean("link_fix_running", false)) startLinkFix()
        if (sharedPrefs.getBoolean("ovr_loader_override_running", false)) startOvrLoaderOverride()
    }

    // ── Script write helper (parity with upstream TweakService.b()) ──
    /**
     * Writes [content] to [file] only if the file doesn't exist or its content
     * differs from [content]. After writing, sets the file executable (chmod 755).
     * This is byte-for-byte identical to the upstream `TweakService.b(File, String)`.
     */
    private fun writeScript(file: File, content: String) {
        if (file.exists() && file.readText() == content) return
        file.writeText(content)
        file.setExecutable(true, false)
    }

    private suspend fun startRgbLed(intent: Intent) {
        if (rgbLedRunning) return
        // Kill other LED scripts first (parity with upstream)
        executeRootCommand(
            "pkill -f rgb_led.sh || true\n" +
            "pkill -f custom_led.sh || true\n" +
            "pkill -f power_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
        writeScript(rgbScriptFile, SCRIPT_RGB_LED)
        executeRootCommand("nohup ${rgbScriptFile.absolutePath} > /dev/null 2>&1 &")
        rgbLedRunning = true
        customLedRunning = false
        powerLedRunning = false
        sharedPrefs.edit()
            .putBoolean("rgb_led_is_running", true)
            .putBoolean("custom_led_is_running", false)
            .putBoolean("power_led_is_running", false)
            .apply()
    }

    private suspend fun stopRgbLed() {
        rgbLedRunning = false
        sharedPrefs.edit().putBoolean("rgb_led_is_running", false).apply()
        executeRootCommand(
            "pkill -f rgb_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
    }

    private suspend fun startCustomLed(intent: Intent) {
        if (customLedRunning) return
        val red = intent.getIntExtra("RED", 255)
        val green = intent.getIntExtra("GREEN", 255)
        val blue = intent.getIntExtra("BLUE", 255)
        val script = "#!/system/bin/sh\n" +
            "RED_LED=\"/sys/class/leds/red/brightness\"\n" +
            "GREEN_LED=\"/sys/class/leds/green/brightness\"\n" +
            "BLUE_LED=\"/sys/class/leds/blue/brightness\"\n" +
            "while true; do\n" +
            "    echo $red > \"\$RED_LED\"\n" +
            "    echo $green > \"\$GREEN_LED\"\n" +
            "    echo $blue > \"\$BLUE_LED\"\n" +
            "    sleep 1\n" +
            "done"
        executeRootCommand(
            "pkill -f rgb_led.sh || true\n" +
            "pkill -f custom_led.sh || true\n" +
            "pkill -f power_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
        writeScript(customLedScriptFile, script)
        executeRootCommand("nohup ${customLedScriptFile.absolutePath} > /dev/null 2>&1 &")
        customLedRunning = true
        rgbLedRunning = false
        powerLedRunning = false
        sharedPrefs.edit()
            .putBoolean("custom_led_is_running", true)
            .putBoolean("rgb_led_is_running", false)
            .putBoolean("power_led_is_running", false)
            .apply()
    }

    private suspend fun stopCustomLed() {
        customLedRunning = false
        sharedPrefs.edit().putBoolean("custom_led_is_running", false).apply()
        executeRootCommand(
            "pkill -f custom_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
    }

    private suspend fun startPowerLed() {
        if (powerLedRunning) return
        executeRootCommand(
            "pkill -f rgb_led.sh || true\n" +
            "pkill -f custom_led.sh || true\n" +
            "pkill -f power_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
        writeScript(powerLedScriptFile, SCRIPT_POWER_LED)
        executeRootCommand("nohup ${powerLedScriptFile.absolutePath} > /dev/null 2>&1 &")
        powerLedRunning = true
        rgbLedRunning = false
        customLedRunning = false
        sharedPrefs.edit()
            .putBoolean("power_led_is_running", true)
            .putBoolean("rgb_led_is_running", false)
            .putBoolean("custom_led_is_running", false)
            .apply()
    }

    private suspend fun stopPowerLed() {
        powerLedRunning = false
        sharedPrefs.edit().putBoolean("power_led_is_running", false).apply()
        executeRootCommand(
            "pkill -f power_led.sh || true\n" +
            "echo 0 > /sys/class/leds/red/brightness\n" +
            "echo 0 > /sys/class/leds/green/brightness\n" +
            "echo 0 > /sys/class/leds/blue/brightness"
        )
    }

    private suspend fun startMinFreqLock(intent: Intent) {
        if (minFreqRunning) return
        minFreqRunning = true
        sharedPrefs.edit().putBoolean("min_freq_is_running", true).apply()
        val freqLittle = intent.getStringExtra("FREQ_LITTLE") ?: ""
        val freqMiddle = intent.getStringExtra("FREQ_MIDDLE") ?: ""
        val freqBig = intent.getStringExtra("FREQ_BIG") ?: ""
        val script = buildCpuFreqScript("scaling_min_freq", freqLittle, freqMiddle, freqBig)
        writeScript(minFreqScriptFile, script)
        executeRootCommand("pkill -f min_freq_lock.sh || true")
        executeRootCommand("nohup ${minFreqScriptFile.absolutePath} > /dev/null 2>&1 &")
    }

    private suspend fun stopMinFreqLock() {
        minFreqRunning = false
        sharedPrefs.edit().putBoolean("min_freq_is_running", false).apply()
        executeRootCommand("pkill -f min_freq_lock.sh || true")
    }

    private suspend fun startMaxFreqLock(intent: Intent) {
        if (maxFreqRunning) return
        maxFreqRunning = true
        sharedPrefs.edit().putBoolean("max_freq_is_running", true).apply()
        val freqLittle = intent.getStringExtra("FREQ_LITTLE") ?: ""
        val freqMiddle = intent.getStringExtra("FREQ_MIDDLE") ?: ""
        val freqBig = intent.getStringExtra("FREQ_BIG") ?: ""
        val script = buildCpuFreqScript("scaling_max_freq", freqLittle, freqMiddle, freqBig)
        writeScript(maxFreqScriptFile, script)
        executeRootCommand("pkill -f max_freq_lock.sh || true")
        executeRootCommand("nohup ${maxFreqScriptFile.absolutePath} > /dev/null 2>&1 &")
    }

    private suspend fun stopMaxFreqLock() {
        maxFreqRunning = false
        sharedPrefs.edit().putBoolean("max_freq_is_running", false).apply()
        executeRootCommand("pkill -f max_freq_lock.sh || true")
    }

    private suspend fun startUsbInterceptor() {
        if (usbInterceptorRunning) return
        writeScript(usbInterceptorScriptFile, SCRIPT_USB_INTERCEPTOR)
        executeRootCommand("pkill -f usb_interceptor.sh || true")
        executeRootCommand("nohup ${usbInterceptorScriptFile.absolutePath} > /dev/null 2>&1 &")
        usbInterceptorRunning = true
        sharedPrefs.edit().putBoolean("usb_interceptor_running", true).apply()
    }

    private suspend fun stopUsbInterceptor() {
        usbInterceptorRunning = false
        sharedPrefs.edit().putBoolean("usb_interceptor_running", false).apply()
        executeRootCommand("pkill -f usb_interceptor.sh || true")
    }

    private suspend fun startOtaBlocker() {
        if (otaBlockerRunning) return
        writeScript(otaBlockerScriptFile, SCRIPT_OTA_BLOCKER)
        executeRootCommand("pkill -f ota_blocker.sh || true")
        executeRootCommand("nohup ${otaBlockerScriptFile.absolutePath} > /dev/null 2>&1 &")
        otaBlockerRunning = true
        sharedPrefs.edit().putBoolean("ota_blocker_running", true).apply()
    }

    private suspend fun stopOtaBlocker() {
        otaBlockerRunning = false
        sharedPrefs.edit().putBoolean("ota_blocker_running", false).apply()
        executeRootCommand("pkill -f ota_blocker.sh || true")
    }

    private suspend fun startPersistProtect() {
        if (persistProtectRunning) return
        writeScript(persistProtectScriptFile, SCRIPT_PERSIST_PROTECT)
        executeRootCommand("pkill -f persist_protect.sh || true")
        executeRootCommand("nohup ${persistProtectScriptFile.absolutePath} > /dev/null 2>&1 &")
        persistProtectRunning = true
        sharedPrefs.edit().putBoolean("persist_protect_running", true).apply()
    }

    private suspend fun stopPersistProtect() {
        persistProtectRunning = false
        sharedPrefs.edit().putBoolean("persist_protect_running", false).apply()
        executeRootCommand("pkill -f persist_protect.sh || true")
    }

    private suspend fun startGpuMinFreqLock(intent: Intent) {
        if (gpuMinFreqRunning) return
        gpuMinFreqRunning = true
        sharedPrefs.edit().putBoolean("gpu_min_freq_is_running", true).apply()
        val freq = intent.getStringExtra("FREQ") ?: ""
        val script = """
            #!/system/bin/sh
            while true; do
                echo "$freq" > /sys/class/kgsl/kgsl-3d0/min_clock_mhz
                sleep 2
            done
        """.trimIndent()
        writeScript(gpuMinFreqScriptFile, script)
        executeRootCommand("pkill -f gpu_min_freq_lock.sh || true")
        executeRootCommand("nohup ${gpuMinFreqScriptFile.absolutePath} > /dev/null 2>&1 &")
    }

    private suspend fun stopGpuMinFreqLock() {
        gpuMinFreqRunning = false
        sharedPrefs.edit().putBoolean("gpu_min_freq_is_running", false).apply()
        executeRootCommand("pkill -f gpu_min_freq_lock.sh || true")
    }

    private suspend fun startGpuMaxFreqLock(intent: Intent) {
        if (gpuMaxFreqRunning) return
        gpuMaxFreqRunning = true
        sharedPrefs.edit().putBoolean("gpu_max_freq_is_running", true).apply()
        val freqMhz = intent.getStringExtra("FREQ") ?: ""
        val freqHz = freqMhz.toLongOrNull()?.let { it * 1000000L }?.toString() ?: "0"
        val script = """
            #!/system/bin/sh
            while true; do
                echo "$freqMhz" > /sys/class/kgsl/kgsl-3d0/max_clock_mhz 2>/dev/null
                echo "$freqHz" > /sys/class/kgsl/kgsl-3d0/devfreq/max_freq 2>/dev/null
                echo "$freqHz" > /sys/class/kgsl/kgsl-3d0/max_gpuclk 2>/dev/null
                sleep 2
            done
        """.trimIndent()
        writeScript(gpuMaxFreqScriptFile, script)
        executeRootCommand("pkill -f gpu_max_freq_lock.sh || true")
        executeRootCommand("nohup ${gpuMaxFreqScriptFile.absolutePath} > /dev/null 2>&1 &")
    }

    private suspend fun stopGpuMaxFreqLock() {
        gpuMaxFreqRunning = false
        sharedPrefs.edit().putBoolean("gpu_max_freq_is_running", false).apply()
        executeRootCommand("pkill -f gpu_max_freq_lock.sh || true")
    }

    private suspend fun startFanOverride(intent: Intent) {
        if (fanOverrideRunning) return
        fanOverrideRunning = true
        sharedPrefs.edit().putBoolean("fan_override_is_running", true).apply()
        val rawRpm = intent.getIntExtra("TARGET_RPM", 3000)
        // Upstream parity: iv.e() coerces RPM to device-specific valid range
        // Quest 3 (rh0.g, ordinal 3): iv.d = [3000, 4000, 5000, 6500, 7500] → min=3000, max=7500
        val targetRpm = rawRpm.coerceIn(FAN_RPM_MIN, FAN_RPM_MAX)
        val sleepEnabled = sharedPrefs.getBoolean("fan_sleep_lower_enabled", false)
        fanTargetRpmFile.writeText(targetRpm.toString())
        fanSleepEnabledFile.writeText(if (sleepEnabled) "1" else "0")
        val script = buildFanOverrideScript(targetRpm, sleepEnabled)
        writeScript(fanOverrideScriptFile, script)
        executeRootCommand("pkill -f fan_override.sh || true")
        executeRootCommand("nohup ${fanOverrideScriptFile.absolutePath} > /dev/null 2>&1 &")
    }

    private suspend fun stopFanOverride() {
        fanOverrideRunning = false
        sharedPrefs.edit().putBoolean("fan_override_is_running", false).apply()
        executeRootCommand("pkill -f fan_override.sh || true")
    }

    /**
     * Hot-update fan RPM without restarting the script (parity with upstream o3.java SET_FAN_RPM).
     * The running fan_override.sh reads fanTargetRpmFile each iteration, so writing the new value
     * is sufficient — no script restart needed.
     */
    private fun setFanRpm() {
        val rawRpm = sharedPrefs.getInt("fan_override_target_rpm", 3000)
        // Upstream parity: coerce to Quest 3 valid range [3000, 7500] (iv.d list)
        val targetRpm = rawRpm.coerceIn(FAN_RPM_MIN, FAN_RPM_MAX)
        fanTargetRpmFile.writeText(targetRpm.toString())
        fanOverrideRunning = true
        sharedPrefs.edit().putBoolean("fan_override_is_running", true).apply()
    }

    private suspend fun setChargeLimit(intent: Intent) {
        val percent = intent.getIntExtra("PERCENT", 80)
        val limit = percent.coerceIn(50, 100)
        // Always kill existing script first (parity with upstream ne.java case 1)
        executeRootCommand("pkill -f charge_limit.sh || true")
        if (limit >= 100) {
            // Disable: reset input_suspend and hardware charge_capacity_limit (parity with upstream z9 case 5+6)
            executeRootCommand(
                "echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null || true\n" +
                "echo 100 > /sys/class/power_supply/battery/charge_capacity_limit 2>/dev/null || true"
            )
            chargeLimitRunning = false
            sharedPrefs.edit().putBoolean("charge_limit_is_running", false).apply()
            return
        }
        val limitResume = limit - 2
        val script = "#!/system/bin/sh\n" +
            "while true; do\n" +
            "    cap=\$(cat /sys/class/power_supply/battery/capacity 2>/dev/null)\n" +
            "    if [ -n \"\$cap\" ]; then\n" +
            "        if [ \"\$cap\" -ge $limit ]; then\n" +
            "            echo 1 > /sys/class/power_supply/battery/input_suspend 2>/dev/null\n" +
            "        elif [ \"\$cap\" -le $limitResume ]; then\n" +
            "            echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null\n" +
            "        fi\n" +
            "    fi\n" +
            "    sleep 5\n" +
            "done"
        writeScript(chargeLimitScriptFile, script)
        executeRootCommand("pkill -f charge_limit.sh || true")
        executeRootCommand("nohup ${chargeLimitScriptFile.absolutePath} > /dev/null 2>&1 &")
        chargeLimitRunning = true
        sharedPrefs.edit().putBoolean("charge_limit_is_running", true).apply()
    }

    private suspend fun stopChargeLimit() {
        chargeLimitRunning = false
        sharedPrefs.edit().putBoolean("charge_limit_is_running", false).apply()
        executeRootCommand(
            "pkill -f charge_limit.sh || true\n" +
            "echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null || true\n" +
            "echo 100 > /sys/class/power_supply/battery/charge_capacity_limit 2>/dev/null || true"
        )
    }

    // Alias: upstream has no separate START_HIDE_MC2; delegates to startLinkFix()
    private suspend fun startHideMc2() = startLinkFix()

    // Alias: upstream has no separate STOP_HIDE_MC2; delegates to stopLinkFix()
    private suspend fun stopHideMc2() = stopLinkFix()

    private suspend fun startOvrLoaderOverride() {
        if (ovrLoaderOverrideRunning) return
        ovrLoaderOverrideRunning = true
        sharedPrefs.edit().putBoolean("ovr_loader_override_running", true).apply()
        // Upstream creates the file reference but does not actively write/launch a script for ovr_loader_override.
        // This is a placeholder matching upstream parity (the feature is detected in ps but has no standalone script).
    }

    // Upstream: START_LINK_FIX = hide_mc2 (mw0 case 6). No separate HIDE_MC2 action exists upstream.
    private suspend fun startLinkFix() {
        if (linkFixRunning) return
        writeScript(hideMc2ScriptFile, SCRIPT_HIDE_MC2)
        executeRootCommand(
            "pkill -f hide_mc2.sh || true\n" +
            "rm -f /data/local/tmp/hide_mc2.pid || true"
        )
        executeRootCommand("nohup ${hideMc2ScriptFile.absolutePath} > /dev/null 2>&1 &")
        linkFixRunning = true
        hideMc2Running = true
        sharedPrefs.edit()
            .putBoolean("link_fix_running", true)
            .putBoolean("hide_mc2_running", true)
            .apply()
    }

    // Upstream: STOP_LINK_FIX = stop hide_mc2 (mw0 case 20)
    private suspend fun stopLinkFix() {
        linkFixRunning = false
        hideMc2Running = false
        sharedPrefs.edit()
            .putBoolean("link_fix_running", false)
            .putBoolean("hide_mc2_running", false)
            .apply()
        executeRootCommand(
            "pkill -f hide_mc2.sh || true\n" +
            "rm -f /data/local/tmp/hide_mc2.pid || true"
        )
    }


    private suspend fun startFrida() {
        if (fridaRunning) return
        fridaRunning = true
        sharedPrefs.edit().putBoolean("frida_is_running", true).apply()
        // Frida binary lives at /data/local/tmp/ (not a script in filesDir)
        executeRootCommand(
            "pkill -f frida-server || true\n" +
            "chmod 755 /data/local/tmp/frida-server\n" +
            "nohup /data/local/tmp/frida-server -D > /dev/null 2>&1 &"
        )
    }

    private suspend fun stopFrida() {
        fridaRunning = false
        sharedPrefs.edit().putBoolean("frida_is_running", false).apply()
        executeRootCommand("pkill -f frida-server >/dev/null 2>&1 || true")
    }

    // Upstream parity: prox_sensor_disabled starts/stops charge watch (e()/g()), NOT direct sysfs toggle.
    // The upstream never writes to /sys/class/sensors/proximity_sensor/enable.
    private fun disableProximitySensor() {
        sharedPrefs.edit().putBoolean("prox_sensor_disabled", true).apply()
        if (!chargeWatchActive) {
            chargeWatchActive = true
            startChargeWatch()
        }
    }

    private fun enableProximitySensor() {
        sharedPrefs.edit().putBoolean("prox_sensor_disabled", false).apply()
        if (chargeWatchActive) {
            chargeWatchActive = false
            stopChargeWatch()
        }
    }

    private fun startProxChargeWatch() {
        if (chargeWatchActive) return
        chargeWatchActive = true
        startChargeWatch()
    }

    private fun stopProxChargeWatch() {
        chargeWatchActive = false
        stopChargeWatch()
    }

    private var chargeWatchDebounceJob: Job? = null
    
    private fun startChargeWatch() {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        
        // Upstream parity: jh0.java posts j (case 7) with 1500ms delay on EVERY power event.
        // The delayed Runnable checks BATTERY_CHANGED to determine actual state,
        // then sends automation_disable (plugged) or prox_close (unplugged).
        // This provides debouncing for rapid connect/disconnect events.
        chargeWatchReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                // Cancel any pending check (parity with handler.removeCallbacks)
                chargeWatchDebounceJob?.cancel()
                
                // Post delayed check (parity with handler.postDelayed(j, 1500))
                chargeWatchDebounceJob = workerScope.launch {
                    delay(1500)
                    
                    // Check actual battery state via BATTERY_CHANGED (parity with j.java case 7)
                    val batteryStatus = registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
                    val plugged = batteryStatus?.getIntExtra("plugged", 0) ?: 0
                    val isPlugged = (plugged and (android.os.BatteryManager.BATTERY_PLUGGED_AC or android.os.BatteryManager.BATTERY_PLUGGED_USB)) != 0
                    
                    if (isPlugged && !isCharging) {
                        // Plugged in and wasn't charging before
                        isCharging = true
                        executeRootCommand("am broadcast -a com.oculus.vrpowermanager.automation_disable")
                    } else if (!isPlugged && isCharging) {
                        // Unplugged and was charging
                        isCharging = false
                        executeRootCommand("am broadcast -a com.oculus.vrpowermanager.prox_close")
                    }
                }
            }
        }
        
        registerReceiver(chargeWatchReceiver, filter)
        
        // Upstream parity: initial battery state check is delayed by 1500ms (Handler.postDelayed)
        // to let the system stabilize before reading BATTERY_CHANGED.
        workerScope.launch {
            delay(1500)
            val batteryStatus = registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
            val plugged = batteryStatus?.getIntExtra("plugged", 0) ?: 0
            isCharging = (plugged and (android.os.BatteryManager.BATTERY_PLUGGED_AC or android.os.BatteryManager.BATTERY_PLUGGED_USB)) != 0
        }
    }

    private fun stopChargeWatch() {
        chargeWatchDebounceJob?.cancel()
        chargeWatchDebounceJob = null
        chargeWatchReceiver?.let {
            try {
                unregisterReceiver(it)
            } catch (e: IllegalArgumentException) {
                // Already unregistered
            }
        }
        chargeWatchReceiver = null
    }


    private suspend fun stopAllTweaks() {
        // Comprehensive kill-all matching upstream b80.java case 8
        executeRootCommand(
            "pkill -f rgb_led.sh || true\n" +
            "pkill -f custom_led.sh || true\n" +
            "pkill -f power_led.sh || true\n" +
            "pkill -f min_freq_lock.sh || true\n" +
            "pkill -f max_freq_lock.sh || true\n" +
            "pkill -f gpu_min_freq_lock.sh || true\n" +
            "pkill -f gpu_max_freq_lock.sh || true\n" +
            "pkill -f fan_override.sh || true\n" +
            "pkill -f charge_limit.sh || true\n" +
            "echo 0 > /sys/class/power_supply/battery/input_suspend 2>/dev/null || true\n" +
            "echo 100 > /sys/class/power_supply/battery/charge_capacity_limit 2>/dev/null || true\n" +
            "pkill -f usb_interceptor.sh || true\n" +
            "pkill -f ota_blocker.sh || true\n" +
            "pkill -f ovr_loader_override.sh || true\n" +
            "pkill -f frida-server || true\n" +
            "pkill -f hide_mc2.sh || true\n" +
            "rm -f /data/local/tmp/hide_mc2.pid || true"
        )
        // Reset all running flags
        rgbLedRunning = false; customLedRunning = false; powerLedRunning = false
        minFreqRunning = false; maxFreqRunning = false
        usbInterceptorRunning = false; otaBlockerRunning = false
        persistProtectRunning = false; gpuMinFreqRunning = false
        gpuMaxFreqRunning = false; fanOverrideRunning = false
        chargeLimitRunning = false; hideMc2Running = false
        fridaRunning = false; linkFixRunning = false
        ovrLoaderOverrideRunning = false
    }

    private fun executeRootCommand(command: String) {
        try {
            val process = Runtime.getRuntime().exec(arrayOf("su", "-c", command))
            process.waitFor()
        } catch (e: Exception) {
            Log.e("TweakService", "Error executing command: $command", e)
        }
    }

    private fun buildNotification(): Notification {
        val channelId = "tweak_service_channel"
        val channelName = "Tweak Service"
        
        val channel = NotificationChannel(
            channelId,
            channelName,
            NotificationManager.IMPORTANCE_LOW
        ).apply {
            setShowBadge(false)
        }
        
        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager.createNotificationChannel(channel)
        
        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setContentTitle("Singularity Tweaks Active")
            .setContentText("Persistent tweaks are being managed.")
            .setSmallIcon(R.drawable.ic_lock_power_off)
            .setOngoing(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
        
        val stopIntent = Intent(this, TweakService::class.java).apply {
            action = ACTION_STOP_ALL
        }
        val stopPendingIntent = PendingIntent.getService(
            this,
            0,
            stopIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        notificationBuilder.addAction(R.drawable.ic_lock_power_off, "STOP_ALL", stopPendingIntent)
        
        return notificationBuilder.build()
    }

    override fun onDestroy() {
        super.onDestroy()
        stopAllTweaksBlocking()
        supervisorScope.cancel()
        workerScope.cancel()
        stopChargeWatch()

        // Reset all running-state prefs (parity with upstream onDestroy)
        sharedPrefs.edit().apply {
            putBoolean("rgb_led_is_running", false)
            putBoolean("custom_led_is_running", false)
            putBoolean("power_led_is_running", false)
            putBoolean("usb_interceptor_running", false)
            putBoolean("ota_blocker_running", false)
            putBoolean("ovr_loader_override_running", false)
            putBoolean("min_freq_is_running", false)
            putBoolean("max_freq_is_running", false)
            putBoolean("gpu_min_freq_is_running", false)
            putBoolean("gpu_max_freq_is_running", false)
            putBoolean("fan_override_is_running", false)
            putBoolean("charge_limit_is_running", false)
            putBoolean("frida_is_running", false)
            putBoolean("link_fix_running", false)
            putBoolean("hide_mc2_running", false)
            putBoolean("persist_protect_running", false)
            apply()
        }
    }

    private fun stopAllTweaksBlocking() {
        runBlocking(Dispatchers.IO) {
            stopRgbLed()
            stopCustomLed()
            stopPowerLed()
            stopMinFreqLock()
            stopMaxFreqLock()
            stopUsbInterceptor()
            stopOtaBlocker()
            stopPersistProtect()
            stopGpuMinFreqLock()
            stopGpuMaxFreqLock()
            stopFanOverride()
            stopChargeLimit()
            stopHideMc2()
            stopFrida()
            stopLinkFix()
        }
    }

    // ── Dynamic script builders (parity with upstream z9/ro/hv/ne classes) ──

    /**
     * Builds a CPU frequency lock script for [target] (scaling_min_freq or scaling_max_freq).
     * Quest 3/3S has 3 CPU clusters: little (cpu0-3), middle (cpu4-5), big (cpu6-7).
     */
    private fun buildCpuFreqScript(target: String, freqLittle: String, freqMiddle: String, freqBig: String): String {
        val sb = StringBuilder("#!/system/bin/sh\nwhile true; do\n")
        // Little cluster: cpu0-3
        if (freqLittle.isNotEmpty()) {
            for (cpu in 0..3) {
                sb.append("    echo \"$freqLittle\" > /sys/devices/system/cpu/cpu$cpu/cpufreq/$target\n")
            }
        }
        // Middle cluster: cpu4-5
        if (freqMiddle.isNotEmpty()) {
            for (cpu in 4..5) {
                sb.append("    echo \"$freqMiddle\" > /sys/devices/system/cpu/cpu$cpu/cpufreq/$target\n")
            }
        }
        // Big cluster: cpu6-7
        if (freqBig.isNotEmpty()) {
            for (cpu in 6..7) {
                sb.append("    echo \"$freqBig\" > /sys/devices/system/cpu/cpu$cpu/cpufreq/$target\n")
            }
        }
        sb.append("    sleep 2\ndone")
        return sb.toString()
    }

    /**
     * Builds a fan override script that monitors sleep state and adjusts fan RPM.
     * Quest 3/3S uses thermal zone-based fan control.
     *
     * Upstream parity (hv.java): Reads RPM from fanTargetRpmFile each iteration,
     * falling back to [targetRpm] if the file is empty. This enables setFanRpm()
     * hot-update without restarting the script.
     */
    /**
     * Build the fan override shell script.
     *
     * CRITICAL Quest 3 hardware fact: cooling_device0 (pwm-tach-fan0) uses discrete
     * levels 0-4 (max_state=4), NOT raw RPM values. Upstream iv.d maps RPMs to indices:
     *   level 0 = 3000 RPM (minimum)
     *   level 1 = 4000 RPM
     *   level 2 = 5000 RPM
     *   level 3 = 6500 RPM
     *   level 4 = 7500 RPM (maximum)
     *
     * Writing raw RPM (e.g. 5000) to cur_state would be clamped to max_state (4),
     * making the fan always run at maximum. The script must convert RPM → level.
     */
    private fun buildFanOverrideScript(targetRpm: Int, sleepEnabled: Boolean): String {
        val sleepFile = fanSleepEnabledFile.absolutePath
        val rpmFile = fanTargetRpmFile.absolutePath
        return "#!/system/bin/sh\n" +
            "FAN_PATH=\"/sys/class/thermal/cooling_device0/cur_state\"\n" +
            "was_asleep=0\n" +
            "while true; do\n" +
            "    rpm=\$(cat \"$rpmFile\" 2>/dev/null)\n" +
            "    if [ -z \"\$rpm\" ]; then rpm=$targetRpm; fi\n" +
            "    # Convert RPM to Quest 3 fan level (0-4)\n" +
            "    # Upstream parity: iv.d = [3000, 4000, 5000, 6500, 7500]\n" +
            "    if [ \"\$rpm\" -le 3000 ]; then level=0\n" +
            "    elif [ \"\$rpm\" -le 4000 ]; then level=1\n" +
            "    elif [ \"\$rpm\" -le 5000 ]; then level=2\n" +
            "    elif [ \"\$rpm\" -le 6500 ]; then level=3\n" +
            "    else level=4\n" +
            "    fi\n" +
            "    sleep_mode=\$(cat \"$sleepFile\" 2>/dev/null)\n" +
            "    asleep=0\n" +
            "    if [ \"\$sleep_mode\" = \"1\" ]; then\n" +
            "        wakefulness=\$(dumpsys power 2>/dev/null | grep -m1 'mWakefulness=')\n" +
            "        case \"\$wakefulness\" in\n" +
            "            *Asleep*) asleep=1 ;;\n" +
            "        esac\n" +
            "    fi\n" +
            "    if [ \"\$asleep\" = \"1\" ]; then\n" +
            "        if [ \"\$was_asleep\" != \"1\" ]; then\n" +
            "            echo 0 > \"\$FAN_PATH\" 2>/dev/null\n" +
            "        fi\n" +
            "    else\n" +
            "        if [ \"\$was_asleep\" != \"0\" ]; then\n" +
            "            echo \$level > \"\$FAN_PATH\" 2>/dev/null\n" +
            "        fi\n" +
            "        echo \$level > \"\$FAN_PATH\" 2>/dev/null\n" +
            "    fi\n" +
            "    was_asleep=\$asleep\n" +
            "    sleep 5\n" +
            "done"
    }

    companion object {
        const val NOTIFICATION_ID = 2
        
        // Upstream parity: Quest 3 fan RPM range from iv.d = [3000, 4000, 5000, 6500, 7500]
        // iv.e() coerces: y80.h(rpm, min=3000, max=7500)
        const val FAN_RPM_MIN = 3000
        const val FAN_RPM_MAX = 7500
        
        const val ACTION_START_RGB = "com.lumi.singularity.START_RGB"
        const val ACTION_STOP_RGB = "com.lumi.singularity.STOP_RGB"
        const val ACTION_START_CUSTOM_LED = "com.lumi.singularity.START_CUSTOM_LED"
        const val ACTION_STOP_CUSTOM_LED = "com.lumi.singularity.STOP_CUSTOM_LED"
        const val ACTION_START_POWER_LED = "com.lumi.singularity.START_POWER_LED"
        const val ACTION_STOP_POWER_LED = "com.lumi.singularity.STOP_POWER_LED"
        const val ACTION_START_MIN_FREQ = "com.lumi.singularity.START_MIN_FREQ"
        const val ACTION_STOP_MIN_FREQ = "com.lumi.singularity.STOP_MIN_FREQ"
        const val ACTION_START_MAX_FREQ = "com.lumi.singularity.START_MAX_FREQ"
        const val ACTION_STOP_MAX_FREQ = "com.lumi.singularity.STOP_MAX_FREQ"
        const val ACTION_START_USB_INTERCEPTOR = "com.lumi.singularity.START_USB_INTERCEPTOR"
        const val ACTION_STOP_USB_INTERCEPTOR = "com.lumi.singularity.STOP_USB_INTERCEPTOR"
        const val ACTION_START_OTA_BLOCKER = "com.lumi.singularity.START_OTA_BLOCKER"
        const val ACTION_STOP_OTA_BLOCKER = "com.lumi.singularity.STOP_OTA_BLOCKER"
        const val ACTION_START_PERSIST_PROTECT = "com.lumi.singularity.START_PERSIST_PROTECT"
        const val ACTION_STOP_PERSIST_PROTECT = "com.lumi.singularity.STOP_PERSIST_PROTECT"
        const val ACTION_START_GPU_MIN_FREQ = "com.lumi.singularity.START_GPU_MIN_FREQ"
        const val ACTION_STOP_GPU_MIN_FREQ = "com.lumi.singularity.STOP_GPU_MIN_FREQ"
        const val ACTION_START_GPU_MAX_FREQ = "com.lumi.singularity.START_GPU_MAX_FREQ"
        const val ACTION_STOP_GPU_MAX_FREQ = "com.lumi.singularity.STOP_GPU_MAX_FREQ"
        const val ACTION_START_FAN_OVERRIDE = "com.lumi.singularity.START_FAN_OVERRIDE"
        const val ACTION_STOP_FAN_OVERRIDE = "com.lumi.singularity.STOP_FAN_OVERRIDE"
        const val ACTION_SET_FAN_RPM = "com.lumi.singularity.SET_FAN_RPM"
        const val ACTION_SET_CHARGE_LIMIT = "com.lumi.singularity.SET_CHARGE_LIMIT"
        const val ACTION_STOP_CHARGE_LIMIT = "com.lumi.singularity.STOP_CHARGE_LIMIT"
        const val ACTION_START_HIDE_MC2 = "com.lumi.singularity.START_HIDE_MC2"
        const val ACTION_STOP_HIDE_MC2 = "com.lumi.singularity.STOP_HIDE_MC2"
        const val ACTION_START_LINK_FIX = "com.lumi.singularity.START_LINK_FIX"
        const val ACTION_STOP_LINK_FIX = "com.lumi.singularity.STOP_LINK_FIX"
        const val ACTION_START_FRIDA = "com.lumi.singularity.START_FRIDA"
        const val ACTION_STOP_FRIDA = "com.lumi.singularity.STOP_FRIDA"
        const val ACTION_DISABLE_PROX_SENSOR = "com.lumi.singularity.DISABLE_PROX_SENSOR"
        const val ACTION_ENABLE_PROX_SENSOR = "com.lumi.singularity.ENABLE_PROX_SENSOR"
        const val ACTION_START_PROX_CHARGE_WATCH = "com.lumi.singularity.START_PROX_CHARGE_WATCH"
        const val ACTION_STOP_PROX_CHARGE_WATCH = "com.lumi.singularity.STOP_PROX_CHARGE_WATCH"
        const val ACTION_STOP_ALL = "com.lumi.singularity.STOP_ALL"

        // ── Static shell script contents (parity with upstream TweakService constructor + mw0.java) ──

        /** Rainbow RGB LED cycling script (upstream: mw0.java case 12, field E) */
        const val SCRIPT_RGB_LED = "#!/system/bin/sh\n" +
            "RED_LED=\"/sys/class/leds/red/brightness\"\n" +
            "GREEN_LED=\"/sys/class/leds/green/brightness\"\n" +
            "BLUE_LED=\"/sys/class/leds/blue/brightness\"\n" +
            "set_rgb() { echo \"${1}\" > \"\$RED_LED\"; echo \"${2}\" > \"\$GREEN_LED\"; echo \"${3}\" > \"\$BLUE_LED\"; }\n" +
            "clamp() { if [ \"\$1\" -lt 0 ]; then echo 0; elif [ \"\$1\" -gt 255 ]; then echo 255; else echo \"\$1\"; fi; }\n" +
            "trap \"set_rgb 0 0 0; exit\" INT TERM\n" +
            "while true; do\n" +
            "    for i in \$(seq 0 5 255); do set_rgb \$(clamp \$((255 - i))) \$(clamp \${i}) 0; sleep 0.005; done\n" +
            "    for i in \$(seq 0 5 255); do set_rgb 0 \$(clamp \$((255 - i))) \$(clamp \${i}); sleep 0.005; done\n" +
            "    for i in \$(seq 0 5 255); do set_rgb \$(clamp \${i}) 0 \$(clamp \$((255 - i))); sleep 0.005; done\n" +
            "done"

        /** Battery-level LED indicator script (upstream: mw0.java case 11, field G) */
        const val SCRIPT_POWER_LED = "#!/system/bin/sh\n\n" +
            "RED_LED=\"/sys/class/leds/red/brightness\"\n" +
            "GREEN_LED=\"/sys/class/leds/green/brightness\"\n" +
            "BLUE_LED=\"/sys/class/leds/blue/brightness\"\n" +
            "BATTERY_PATH=\"/sys/class/power_supply/battery/capacity\"\n\n" +
            "set_led() {\n" +
            "    echo \"\$1\" > \"\$RED_LED\"\n" +
            "    echo \"\$2\" > \"\$GREEN_LED\"\n" +
            "    echo \"\$3\" > \"\$BLUE_LED\"\n" +
            "}\n\n" +
            "while true; do\n" +
            "    battery_level=\$(cat \"\$BATTERY_PATH\")\n\n" +
            "    if [ \"\$battery_level\" -ge 95 ]; then\n" +
            "        set_led 0 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 90 ]; then\n" +
            "        set_led 64 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 80 ]; then\n" +
            "        set_led 128 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 70 ]; then\n" +
            "        set_led 180 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 60 ]; then\n" +
            "        set_led 220 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 50 ]; then\n" +
            "        set_led 255 255 0\n" +
            "    elif [ \"\$battery_level\" -ge 40 ]; then\n" +
            "        set_led 255 180 0\n" +
            "    elif [ \"\$battery_level\" -ge 30 ]; then\n" +
            "        set_led 255 128 0\n" +
            "    elif [ \"\$battery_level\" -ge 20 ]; then\n" +
            "        set_led 255 64 0\n" +
            "    elif [ \"\$battery_level\" -ge 10 ]; then\n" +
            "        set_led 255 32 0\n" +
            "    else\n" +
            "        set_led 255 0 0\n" +
            "    fi\n" +
            "    sleep 5\n" +
            "done"

        /** Persist partition read-only protector (upstream: TweakService constructor field k) */
        const val SCRIPT_PERSIST_PROTECT = "#!/system/bin/sh\n" +
            "PERSIST_PATH=\"/dev/block/bootdevice/by-name/persist\"\n\n" +
            "while true; do\n" +
            "    ro=\$(blockdev --getro \"\$PERSIST_PATH\" 2>/dev/null)\n" +
            "    if [ \"\$ro\" != \"1\" ]; then\n" +
            "        blockdev --setro \"\$PERSIST_PATH\" 2>/dev/null\n" +
            "    fi\n" +
            "    sleep 15\n" +
            "done"

        /** USB MTP interceptor for Steam Link / Virtual Desktop (upstream: constructor field i) */
        const val SCRIPT_USB_INTERCEPTOR = "#!/system/bin/sh\n\n" +
            "logcat -c\n\n" +
            "(\n" +
            "    was_visible=false\n" +
            "    while true; do\n" +
            "        if dumpsys activity activities 2>/dev/null | grep -E \"com.valvesoftware.steamlinkvr|VirtualDesktop.Android\" | grep -q \"visible=true\"; then\n" +
            "            was_visible=true\n" +
            "        else\n" +
            "            if [ \"\$was_visible\" = \"true\" ]; then\n" +
            "                usb_state=\$(dumpsys usb 2>/dev/null | awk -F= '/kernel_state=/{print \$2; exit}')\n" +
            "                if [ \"\$usb_state\" = \"CONFIGURED\" ]; then\n" +
            "                    svc usb setFunctions mtp\n" +
            "                    am force-stop com.oculus.notification_proxy\n" +
            "                fi\n" +
            "            fi\n" +
            "            was_visible=false\n" +
            "        fi\n" +
            "        sleep 2\n" +
            "    done\n" +
            ") &\n\n" +
            "logcat -T 0 OculusNotificationListenerService:D *:S | while read -r line; do\n" +
            "    case \"\$line\" in\n" +
            "        *\"Notification posted:\"*\"usb_connect_enable_mtp\"*)\n" +
            "            if dumpsys activity activities 2>/dev/null | grep -E \"com.valvesoftware.steamlinkvr|VirtualDesktop.Android\" | grep -q \"visible=true\"; then\n" +
            "                :\n" +
            "            else\n" +
            "                svc usb setFunctions mtp\n" +
            "                am force-stop com.oculus.notification_proxy\n" +
            "            fi\n" +
            "            ;;\n" +
            "    esac\n" +
            "done"

        /** OTA update blocker (upstream: constructor field j) */
        const val SCRIPT_OTA_BLOCKER = "#!/system/bin/sh\n" +
            "STATUS_FILE=\"/data/adb/singularity/sl_ota_status.txt\"\n\n" +
            "touch \"\$STATUS_FILE\"\n" +
            "chmod 666 \"\$STATUS_FILE\"\n" +
            "echo \"Listening...\" > \"\$STATUS_FILE\"\n\n" +
            "FAIL_COUNT=0\n" +
            "while true; do\n" +
            "    CLIENT=\$(command -v update_engine_client 2>/dev/null)\n" +
            "    if [ -z \"\$CLIENT\" ] || [ ! -x \"\$CLIENT\" ]; then\n" +
            "        echo \"update_engine_client not available - monitor stopped\" > \"\$STATUS_FILE\"\n" +
            "        break\n" +
            "    fi\n\n" +
            "    START_TS=\$(date +%s)\n" +
            "    update_engine_client --follow 2>&1 | while read -r line; do\n" +
            "        case \"\$line\" in\n" +
            "            *\"UPDATE_AVAILABLE\"*|*\"DOWNLOADING\"*|*\"VERIFYING\"*|*\"FINALIZING\"*)\n" +
            "                echo \"Action detected: Canceling...\" > \"\$STATUS_FILE\"\n" +
            "                update_engine_client --cancel\n" +
            "                ;;\n" +
            "            *\"UPDATED_NEED_REBOOT\"*)\n" +
            "                echo \"Reboot pending: Resetting...\" > \"\$STATUS_FILE\"\n" +
            "                update_engine_client --reset_status\n" +
            "                ;;\n" +
            "            *\"IDLE\"*)\n" +
            "                echo \"Idle\" > \"\$STATUS_FILE\"\n" +
            "                ;;\n" +
            "        esac\n" +
            "    done\n" +
            "    END_TS=\$(date +%s)\n\n" +
            "    if [ \$((END_TS - START_TS)) -lt 2 ]; then\n" +
            "        FAIL_COUNT=\$((FAIL_COUNT + 1))\n" +
            "    else\n" +
            "        FAIL_COUNT=0\n" +
            "    fi\n\n" +
            "    if [ \"\$FAIL_COUNT\" -ge 5 ]; then\n" +
            "        echo \"update_engine_client failing repeatedly - monitor stopped\" > \"\$STATUS_FILE\"\n" +
            "        break\n" +
            "    fi\n\n" +
            "    sleep 5\n" +
            "done"

        /** Hide libmc2.so for Link streaming (upstream: constructor field l, file S) */
        const val SCRIPT_HIDE_MC2 = "#!/system/bin/sh\n" +
            "PKG=com.oculus.xrstreamingclient\n" +
            "LIB=/odm/lib64/libmc2.so\n" +
            "EMPTY=/data/local/tmp/empty_mc2.so\n" +
            "LOG=/data/local/tmp/hide_mc2.log\n\n" +
            "log() { echo \"\$(date '+%m-%d %T') \$*\" >> \"\$LOG\"; }\n\n" +
            "until [ \"\$(getprop sys.boot_completed)\" = \"1\" ]; do sleep 2; done\n\n" +
            "if [ -x /data/adb/magisk/busybox ] && /data/adb/magisk/busybox --list | grep -qx nsenter; then\n" +
            "  NSENTER=\"/data/adb/magisk/busybox nsenter\"\n" +
            "elif command -v nsenter >/dev/null 2>&1; then\n" +
            "  NSENTER=nsenter\n" +
            "else\n" +
            "  log \"ERROR: no nsenter found\"; exit 1\n" +
            "fi\n\n" +
            "[ -f \"\$EMPTY\" ] || : > \"\$EMPTY\"\n" +
            "chmod 644 \"\$EMPTY\"\n\n" +
            "PIDFILE=/data/local/tmp/hide_mc2.pid\n" +
            "if [ -f \"\$PIDFILE\" ] && kill -0 \"\$(cat \$PIDFILE)\" 2>/dev/null; then\n" +
            "  log \"already running as \$(cat \$PIDFILE), exiting\"; exit 0\n" +
            "fi\n" +
            "echo \$\$ > \"\$PIDFILE\"\n\n" +
            "log \"started (lib=\$LIB, nsenter=\$NSENTER)\"\n" +
            "last=\"\"; failpid=\"\"; fails=0\n" +
            "while true; do\n" +
            "  pid=\$(pidof \$PKG | awk '{print \$1}')\n" +
            "  if [ -n \"\$pid\" ] && [ \"\$pid\" != \"\$last\" ] && [ -e \"/proc/\$pid/ns/mnt\" ]; then\n" +
            "    if err=\$(\$NSENTER --mount=/proc/\$pid/ns/mnt -- /system/bin/mount -o bind \"\$EMPTY\" \"\$LIB\" 2>&1); then\n" +
            "      last=\$pid; fails=0\n" +
            "      if grep -q libmc2 /proc/\$pid/maps 2>/dev/null; then\n" +
            "        log \"pid \$pid: hidden, but libmc2 was ALREADY loaded (too late) - restart Link\"\n" +
            "      else\n" +
            "        log \"pid \$pid: libmc2.so hidden\"\n" +
            "      fi\n" +
            "    else\n" +
            "      [ \"\$pid\" != \"\$failpid\" ] && fails=0 && failpid=\$pid\n" +
            "      fails=\$((fails+1))\n" +
            "      [ \$fails -eq 1 ] || [ \$((fails % 100)) -eq 0 ] && log \"pid \$pid: mount failed (\$fails): \$err\"\n" +
            "      [ \$fails -ge 300 ] && { log \"pid \$pid: giving up on this pid\"; last=\$pid; }\n" +
            "    fi\n" +
            "  fi\n" +
            "  sleep 0.05\n" +
            "done"
    }
}
