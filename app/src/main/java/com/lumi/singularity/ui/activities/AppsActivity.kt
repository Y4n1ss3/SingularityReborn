package com.lumi.singularity.ui.activities

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

class AppsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val isRooted = intent.getBooleanExtra("is_rooted", false)

        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppsScreen(isRooted)
                }
            }
        }
    }

    @Composable
    private fun AppsScreen(isRooted: Boolean) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Install Apps", style = MaterialTheme.typography.headlineLarge)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("App Installer", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "Browse and install applications from the curated list.",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text("Root access: ${if (isRooted) "Available" else "Not available"}")
                }
            }
        }
    }
}