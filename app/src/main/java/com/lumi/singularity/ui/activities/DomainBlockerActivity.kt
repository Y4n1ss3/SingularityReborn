package com.lumi.singularity.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lumi.singularity.system.DnsBlockerService
import com.lumi.singularity.ui.theme.SingularityRebornTheme

class DomainBlockerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SingularityRebornTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DomainBlockerScreen()
                }
            }
        }
    }

    @Composable
    fun DomainBlockerScreen() {
        var isEnabled by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Domain Blocker", style = MaterialTheme.typography.headlineLarge)

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("DNS Kill Switch", style = MaterialTheme.typography.titleMedium)
                    Text(
                        "Blocks DNS queries to prevent tracking and telemetry.",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Enable", style = MaterialTheme.typography.bodyLarge)
                        Switch(
                            checked = isEnabled,
                            onCheckedChange = { enabled ->
                                isEnabled = enabled
                                val intent = Intent(this@DomainBlockerActivity, DnsBlockerService::class.java)
                                intent.action = if (enabled) DnsBlockerService.ACTION_START else DnsBlockerService.ACTION_STOP
                                startService(intent)
                            }
                        )
                    }
                }
            }
        }
    }
}
