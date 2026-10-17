package com.lumi.singularity.utils

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

/**
 * Root utilities - check for root access and execute commands
 */
object RootUtils {
    
    private const val TAG = "RootUtils"
    
    /**
     * Check if device has root access
     */
    fun isRooted(): Boolean {
        return try {
            val process = Runtime.getRuntime().exec(arrayOf("su", "-c", "id"))
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            val output = reader.readLine()
            process.waitFor()
            output?.contains("uid=0") == true
        } catch (e: Exception) {
            Log.w(TAG, "Root check failed: ${e.message}")
            false
        }
    }
    
    /**
     * Execute a shell command with root privileges
     */
    fun executeRootCommand(command: String): CommandResult {
        return try {
            val process = Runtime.getRuntime().exec(arrayOf("su", "-c", command))
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            val errorReader = BufferedReader(InputStreamReader(process.errorStream))
            
            val output = StringBuilder()
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                output.appendLine(line)
            }
            
            val error = StringBuilder()
            while (errorReader.readLine().also { line = it } != null) {
                error.appendLine(line)
            }
            
            val exitCode = process.waitFor()
            
            CommandResult(
                success = exitCode == 0,
                output = output.toString().trim(),
                error = error.toString().trim(),
                exitCode = exitCode
            )
        } catch (e: Exception) {
            Log.e(TAG, "Command execution failed: ${e.message}")
            CommandResult(false, "", e.message ?: "Unknown error", -1)
        }
    }
    
    /**
     * Execute a shell script file with root privileges
     */
    fun executeScript(scriptPath: String): CommandResult {
        return executeRootCommand("sh $scriptPath")
    }
    
    data class CommandResult(
        val success: Boolean,
        val output: String,
        val error: String,
        val exitCode: Int
    )
}

/**
 * Asset extraction utilities - OPTIMIZED
 */
object AssetUtils {
    
    private const val TAG = "AssetUtils"
    
    // Cache pour éviter les extractions répétées
    private val extractedAssets = mutableSetOf<String>()
    
    /**
     * Extract a single asset file to target directory - with cache check
     */
    fun extractAsset(context: Context, assetPath: String, targetDir: File): File? {
        return try {
            if (!targetDir.exists()) {
                targetDir.mkdirs()
            }
            
            val fileName = File(assetPath).name
            val outputFile = File(targetDir, fileName)
            
            // Skip if already extracted and file exists
            if (outputFile.exists() && outputFile.length() > 0) {
                Log.d(TAG, "Already extracted: $assetPath")
                return outputFile
            }
            
            context.assets.open(assetPath).use { input ->
                outputFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            
            // Make scripts and binaries executable
            if (assetPath.endsWith(".sh") || !assetPath.contains(".")) {
                outputFile.setExecutable(true, false)
            }
            
            Log.i(TAG, "Extracted: $assetPath -> ${outputFile.absolutePath}")
            outputFile
        } catch (e: Exception) {
            Log.e(TAG, "Failed to extract $assetPath: ${e.message}")
            null
        }
    }
    
    /**
     * Extract all files from an asset directory recursively - with cache
     */
    fun extractAssetDirectory(context: Context, assetDir: String, targetDir: File) {
        // Check if already extracted
        if (extractedAssets.contains(assetDir) && targetDir.exists() && targetDir.listFiles()?.isNotEmpty() == true) {
            Log.d(TAG, "Directory already extracted: $assetDir")
            return
        }
        
        try {
            val assets = context.assets.list(assetDir) ?: return
            
            if (!targetDir.exists()) {
                targetDir.mkdirs()
            }
            
            assets.forEach { assetName ->
                val assetPath = "$assetDir/$assetName"
                
                // Try to list as directory
                val subAssets = context.assets.list(assetPath)
                if (subAssets != null && subAssets.isNotEmpty()) {
                    // It's a directory, recurse
                    extractAssetDirectory(context, assetPath, File(targetDir, assetName))
                } else {
                    // It's a file, extract it
                    extractAsset(context, assetPath, targetDir)
                }
            }
            
            extractedAssets.add(assetDir)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to extract directory $assetDir: ${e.message}")
        }
    }
    
    /**
     * Extract exploit binaries
     */
    fun extractExploitAssets(context: Context): File {
        val exploitDir = File(context.filesDir, "exploit")
        extractAssetDirectory(context, "exploit", exploitDir)
        return exploitDir
    }
    
    /**
     * Extract fugu exploit files
     */
    fun extractFuguAssets(context: Context): File {
        val fuguDir = File(context.filesDir, "fugu")
        extractAssetDirectory(context, "fugu", fuguDir)
        return fuguDir
    }
    
    /**
     * Extract payload scripts - CACHED
     */
    fun extractPayloadAssets(context: Context): File {
        val payloadsDir = File(context.filesDir, "payloads")
        extractAssetDirectory(context, "payloads", payloadsDir)
        return payloadsDir
    }
    
    /**
     * Clear extraction cache (force re-extraction)
     */
    fun clearCache() {
        extractedAssets.clear()
    }
}
