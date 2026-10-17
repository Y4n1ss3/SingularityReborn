package com.lumi.singularity.model

import android.os.Build

/**
 * Device model detection - maps device serial numbers to firmware versions
 */
enum class DeviceModel(val serialPrefix: String, val minFirmware: Long) {
    QUEST_2("5194302", 51943020036500520L),
    QUEST_3("5210688", 52106880032500150L),
    QUEST_3S("5215047", 52150470014600150L),
    QUEST_PRO("5217528", 52175280016700150L),
    UNKNOWN("", 0L);
    
    companion object {
        fun fromSerial(serial: String): DeviceModel {
            return values().firstOrNull { serial.startsWith(it.serialPrefix) } ?: UNKNOWN
        }
        
        fun getCurrent(): DeviceModel {
            val serial = Build.SERIAL ?: return UNKNOWN
            return fromSerial(serial)
        }
    }
}

/**
 * Firmware version detection and compatibility checking
 */
object FirmwareChecker {
    
    private const val TAG = "FirmwareChecker"
    
    /**
     * Check if current firmware is supported by reading fugu/targets JSON files
     */
    fun isSupported(): Boolean {
        val firmware = getFirmwareVersion()
        if (firmware == 0L) return false
        
        // Check if there's a matching JSON file in fugu/targets
        return try {
            // In a real implementation, this would read from assets
            // For now, check against known supported firmware versions
            val supportedFirmwares = getSupportedFirmwareList()
            firmware in supportedFirmwares
        } catch (e: Exception) {
            android.util.Log.e(TAG, "Failed to check firmware support", e)
            false
        }
    }
    
    /**
     * Get list of supported firmware versions from JSON files
     */
    private fun getSupportedFirmwareList(): Set<Long> {
        // These are extracted from the JSON filenames in fugu/targets/
        return setOf(
            // Quest 2/3 firmware versions
            52106880032500150L, 52106880035500150L, 52106880036800150L,
            52106880038100150L, 52106880041300150L, 52106880041500150L,
            52106880052400150L,
            // Quest 3S firmware versions
            52150470014600150L, 52150470020900150L, 52150470026300150L,
            52150470027100150L, 52150470030200150L, 52150470034100150L,
            52150470034600150L
        )
    }
    
    /**
     * Get current firmware version as Long
     */
    fun getFirmwareVersion(): Long {
        return try {
            android.os.Build.VERSION.INCREMENTAL.toLongOrNull() ?: 0L
        } catch (e: Exception) {
            0L
        }
    }
    
    /**
     * Get firmware version as String
     */
    fun getFirmwareVersionString(): String {
        return try {
            android.os.Build.VERSION.INCREMENTAL ?: "Unknown"
        } catch (e: Exception) {
            "Unknown"
        }
    }
    
    fun isQuest3(): Boolean = DeviceModel.getCurrent() == DeviceModel.QUEST_3
    fun isQuest3S(): Boolean = DeviceModel.getCurrent() == DeviceModel.QUEST_3S
    fun isQuestPro(): Boolean = DeviceModel.getCurrent() == DeviceModel.QUEST_PRO
}
