package com.lumi.singularity.system

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.lumi.singularity.ui.activities.MainActivity
import com.scottyab.rootbeer.RootBeer
import kotlinx.coroutines.*

class BootReceiver : BroadcastReceiver() {
    
    private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_BOOT_COMPLETED) return
        
        val sharedPrefs = context.getSharedPreferences("singularity_prefs", 0)
        
        val rootOnBoot = sharedPrefs.getBoolean("root_on_boot", false)
        val blockerOnBoot = sharedPrefs.getBoolean("blocker_on_boot", false)
        val rgbOnBoot = sharedPrefs.getBoolean("rgb_on_boot", false)
        val customLedOnBoot = sharedPrefs.getBoolean("custom_led_on_boot", false)
        val powerLedOnBoot = sharedPrefs.getBoolean("power_led_on_boot", false)
        val minFreqOnBoot = sharedPrefs.getBoolean("min_freq_on_boot", false)
        val maxFreqOnBoot = sharedPrefs.getBoolean("max_freq_on_boot", false)
        val wirelessAdbOnBoot = sharedPrefs.getBoolean("wireless_adb_on_boot", false)
        val cycleWifiOnBoot = sharedPrefs.getBoolean("cycle_wifi_on_boot", false)
        val rootBlockerOnBoot = sharedPrefs.getBoolean("root_blocker_on_boot", false)
        val rootBlockerSetup = sharedPrefs.getBoolean("root_blocker_setup", false)
        val usbInterceptorOnBoot = sharedPrefs.getBoolean("usb_interceptor_on_boot", false)
        val otaBlockerOnBoot = sharedPrefs.getBoolean("ota_blocker_on_boot", true)
        val proxSensorDisabled = sharedPrefs.getBoolean("prox_sensor_disabled", false)
        val passthroughFixOnBoot = sharedPrefs.getBoolean("passthrough_fix_on_boot", false)
        val isUnlockedBootloader = sharedPrefs.getBoolean("is_unlocked_bootloader", false)
        val persistProtectToggleEnabled = sharedPrefs.getBoolean("persist_protect_toggle_enabled", false)
        val telemetryToggleEnabled = sharedPrefs.getBoolean("telemetry_toggle_enabled", false)
        val updateEngineToggleEnabled = sharedPrefs.getBoolean("update_engine_toggle_enabled", false)
        val metaBackdoorToggleEnabled = sharedPrefs.getBoolean("meta_backdoor_toggle_enabled", false)
        val gpuMinFreqOnBoot = sharedPrefs.getBoolean("gpu_min_freq_on_boot", false)
        val gpuMaxFreqOnBoot = sharedPrefs.getBoolean("gpu_max_freq_on_boot", false)
        val fanOverrideOnBoot = sharedPrefs.getBoolean("fan_override_on_boot", false)
        val chargeLimitOnBoot = sharedPrefs.getBoolean("charge_limit_on_boot", false)
        val fixControllersOnBoot = sharedPrefs.getBoolean("fix_controllers_on_boot", false)
        val doubleTapPassthroughEnabled = sharedPrefs.getBoolean("double_tap_passthrough_enabled", false)
        val guardianDisabled = sharedPrefs.getBoolean("guardian_disabled", false)
        val captivePortalDisabled = sharedPrefs.getBoolean("captive_portal_disabled", false)
        val linkFixOnBoot = sharedPrefs.getBoolean("link_fix_on_boot", false)
        
        scope.launch {
            if (rootOnBoot) {
                val rootBeer = RootBeer(context)
                if (!rootBeer.isRooted) {
                    val mainIntent = Intent(context, MainActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        putExtra("auto_root", true)
                    }
                    context.startActivity(mainIntent)
                }
            }
            
            if (customLedOnBoot) {
                val red = sharedPrefs.getInt("led_red", 255)
                val green = sharedPrefs.getInt("led_green", 255)
                val blue = sharedPrefs.getInt("led_blue", 255)
                val customLedIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_CUSTOM_LED
                    putExtra("RED", red)
                    putExtra("GREEN", green)
                    putExtra("BLUE", blue)
                }
                context.startService(customLedIntent)
            } else if (rgbOnBoot) {
                val rgbIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_RGB
                }
                context.startService(rgbIntent)
            } else if (powerLedOnBoot) {
                val powerLedIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_POWER_LED
                }
                context.startService(powerLedIntent)
            }
            
            if (!customLedOnBoot) sharedPrefs.edit().putBoolean("custom_led_is_running", false).apply()
            if (!rgbOnBoot) sharedPrefs.edit().putBoolean("rgb_led_is_running", false).apply()
            if (!powerLedOnBoot) sharedPrefs.edit().putBoolean("power_led_is_running", false).apply()
            
            if (minFreqOnBoot) {
                val minFreqIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_MIN_FREQ
                }
                context.startService(minFreqIntent)
            } else {
                sharedPrefs.edit().putBoolean("min_freq_is_running", false).apply()
            }
            
            if (maxFreqOnBoot) {
                val maxFreqIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_MAX_FREQ
                }
                context.startService(maxFreqIntent)
            }
            
            if (gpuMinFreqOnBoot) {
                val gpuMinIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_GPU_MIN_FREQ
                }
                context.startService(gpuMinIntent)
            } else {
                sharedPrefs.edit().putBoolean("gpu_min_freq_is_running", false).apply()
            }
            
            if (gpuMaxFreqOnBoot) {
                val gpuMaxIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_GPU_MAX_FREQ
                }
                context.startService(gpuMaxIntent)
            } else {
                sharedPrefs.edit().putBoolean("gpu_max_freq_is_running", false).apply()
            }
            
            if (fanOverrideOnBoot) {
                val fanIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_FAN_OVERRIDE
                }
                context.startService(fanIntent)
            } else {
                sharedPrefs.edit().putBoolean("fan_override_is_running", false).apply()
            }
            
            if (chargeLimitOnBoot) {
                // Start prox charge watch (like upstream when device type matches)
                val proxWatchIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_PROX_CHARGE_WATCH
                }
                context.startService(proxWatchIntent)
                // Also start the charge limit itself
                val chargeIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_SET_CHARGE_LIMIT
                }
                context.startService(chargeIntent)
            }
            
            if (linkFixOnBoot) {
                val linkFixIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_LINK_FIX
                }
                context.startService(linkFixIntent)
            } else {
                sharedPrefs.edit().putBoolean("link_fix_running", false).apply()
            }
            
            if (usbInterceptorOnBoot) {
                val usbIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_USB_INTERCEPTOR
                }
                context.startService(usbIntent)
            }
            
            if (otaBlockerOnBoot) {
                val otaIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_OTA_BLOCKER
                }
                context.startService(otaIntent)
            }
            
            if (proxSensorDisabled) {
                val proxIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_PROX_CHARGE_WATCH
                }
                context.startService(proxIntent)
            }
            
            if (persistProtectToggleEnabled) {
                val persistIntent = Intent(context, TweakService::class.java).apply {
                    action = TweakService.ACTION_START_PERSIST_PROTECT
                }

                context.startService(persistIntent)
            }
            if (telemetryToggleEnabled) {
                executeRootCommand("settings put global telemetry_enabled 0")
            }
            
            if (updateEngineToggleEnabled) {
                executeRootCommand("pm disable-user --user 0 com.oculus.systemux")
            }
            
            if (metaBackdoorToggleEnabled) {
                executeRootCommand("setprop persist.oculus.ingress_enabled 1")
            }
            
            if (fixControllersOnBoot) {
                executeRootCommand("sh /data/local/tmp/fix_controllers.sh")
            }
            
            if (doubleTapPassthroughEnabled) {
                executeRootCommand("settings put system double_tap_passthrough 1")
            }
            
            if (guardianDisabled) {
                executeRootCommand("settings put secure guardian_enabled 0")
            }
            
            if (captivePortalDisabled) {
                executeRootCommand("settings put global captive_portal_detection_enabled 0")
                executeRootCommand("settings put global captive_portal_mode 0")
            }
            
            if (wirelessAdbOnBoot) {
                delay(3000)
                executeRootCommand("setprop service.adb.tcp.port 5555")
                executeRootCommand("stop adbd")
                executeRootCommand("start adbd")
            }
            
            if (cycleWifiOnBoot) {
                delay(5000)
                executeRootCommand("svc wifi disable")
                delay(2000)
                executeRootCommand("svc wifi enable")
            }
            
            if (rootBlockerOnBoot) {
                delay(2000)
                if (rootBlockerSetup) {
                    executeRootCommand("sh /data/local/tmp/root_blocker.sh")
                }
            }
            
            if (blockerOnBoot) {
                delay(3000)
                executeRootCommand("sh /data/local/tmp/blocker.sh")
            }
            
            if (passthroughFixOnBoot) {
                executeRootCommand("settings put system passthrough_fix_enabled 1")
            }
            
            if (isUnlockedBootloader) {
                executeRootCommand("setprop persist.sys.bootloader.locked 0")
            }
            
            if (sharedPrefs.getBoolean("fps_on_boot", false)) {
                val fpsTarget = sharedPrefs.getInt("fps_target", 0)
                val fpsRatesString = sharedPrefs.getString("fps_available_rates", null)
                
                if (fpsTarget > 0 && fpsRatesString != null) {
                    val availableRates = fpsRatesString.split(",").mapNotNull { it.trim().toIntOrNull() }
                    
                    if (availableRates.contains(fpsTarget)) {
                        executeRootCommand("echo $fpsTarget > /sys/class/graphics/fb0/msm_fb_refresh_rate")
                    } else {
                        Log.w("BootReceiver", "FPS on Boot: no valid saved rate ($fpsTarget), skipped")
                    }
                }
            }
            
            val startAppOnBoot = sharedPrefs.getString("start_app_on_boot", null)
            if (!startAppOnBoot.isNullOrEmpty()) {
                try {
                    val launchIntent = context.packageManager.getLaunchIntentForPackage(startAppOnBoot)
                    launchIntent?.let {
                        it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        context.startActivity(it)
                    }
                } catch (e: Exception) {
                    Log.e("BootReceiver", "Error starting app: $startAppOnBoot", e)
                }
            }
        }
    }
    
    private fun executeRootCommand(command: String) {
        try {
            val process = Runtime.getRuntime().exec(arrayOf("su", "-c", command))
            process.waitFor()
        } catch (e: Exception) {
            Log.e("BootReceiver", "Error executing command: $command", e)
        }
    }
}
