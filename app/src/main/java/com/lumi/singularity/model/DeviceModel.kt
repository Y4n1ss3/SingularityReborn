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
    
    // Cache for supported firmware versions
    private var cachedSupportedFirmwares: Set<Long>? = null
    
    /**
     * Check if current firmware is supported by reading fugu/targets JSON files
     */
    fun isSupported(): Boolean {
        val firmware = getFirmwareVersion()
        if (firmware == 0L) return false
        
        // Check if there's a matching JSON file in fugu/targets
        return try {
            val supportedFirmwares = getSupportedFirmwareList()
            firmware in supportedFirmwares
        } catch (e: Exception) {
            android.util.Log.e(TAG, "Failed to check firmware support", e)
            false
        }
    }
    
    /**
     * Get list of supported firmware versions from JSON files in assets
     */
    private fun getSupportedFirmwareList(): Set<Long> {
        // Return cached value if available
        cachedSupportedFirmwares?.let { return it }
        
        // Parse firmware versions from JSON filenames in fugu/targets/
        // Filename format: q2_52242990012600150.json, q3_51943020036500520.json, etc.
        val supportedFirmwares = mutableSetOf<Long>()
        
        try {
            // This will be called with context when needed
            // For now, we'll use a static list extracted from the APK
            // In production, this should read from assets dynamically
            supportedFirmwares.addAll(getStaticFirmwareList())
        } catch (e: Exception) {
            android.util.Log.e(TAG, "Failed to parse firmware list", e)
        }
        
        cachedSupportedFirmwares = supportedFirmwares
        return supportedFirmwares
    }
    
    /**
     * Static firmware list extracted from APK assets (fugu/targets/ JSON files)
     * This matches the firmware versions supported by the original APK
     */
    private fun getStaticFirmwareList(): Set<Long> {
        return setOf(
            // Quest 3 (5210688...) - v68 to v72
            52106880032500150L, 52106880035500150L, 52106880036800150L,
            52106880038100150L, 52106880041300150L, 52106880041500150L,
            52106880052400150L,
            // Quest 3S (5215047...) - v65 to v72
            52150470014600150L, 52150470020900150L, 52150470026300150L,
            52150470027100150L, 52150470030200150L, 52150470034100150L,
            52150470034600150L, 52150470034600150L,
            // Quest Pro (5217528...) - v65 to v72
            52175280016700150L, 52175280018900150L, 52175280022600150L,
            52175280027400150L, 52175280028600150L, 52175280031200150L,
            52175280039900150L,
            // Quest 2 (5194302...) - v62 to v66
            51943020036500520L, 51943020043400520L, 51943020048700520L,
            51943020050500520L, 51943020052200520L, 51943020055900520L,
            51943020065300520L,
            // Additional Quest 2 (5208318...) - v64 to v66
            52083180010100520L, 52083180015100520L, 52083180022600520L,
            52083180023600520L, 52083180027000520L, 52083180031500520L,
            52083180032000520L,
            // Additional Quest 2 (5216847...) - v66
            52168470022300520L, 52168470026700520L, 52168470029300520L,
            // Quest 3 (5220228...) - v68 to v72
            52202280016300150L, 52202280019500150L, 52202280021800150L,
            52202280025400150L, 52202280027400150L, 52202280028100150L,
            // Quest 3 (5222268...) - v69 to v72
            52222680019700150L, 52222680020900150L, 52222680023900150L,
            52222680024500150L, 52222680026600150L, 52222680028100150L,
            52222680032600150L,
            // Quest 3 (5224299...) - v70 to v72
            52242990012600150L, 52242990017700150L, 52242990018400150L,
            52242990019700150L, 52242990021400150L, 52242990023000150L,
            52242990023400150L, 52242990024200150L
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
