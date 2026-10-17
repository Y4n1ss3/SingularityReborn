package com.lumi.singularity.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lumi.singularity.ui.theme.SingularityRebornTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TerminalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val isRooted = intent.hasExtra("is_rooted") && intent.getBooleanExtra("is_rooted", false)

        setContent {
            SingularityRebornTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TerminalScreen(isRooted)
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun TerminalScreen(isRooted: Boolean) {
        var output by remember { mutableStateOf("Singularity Terminal\n\$ ") }
        var command by remember { mutableStateOf("") }
        val scope = rememberCoroutineScope()
        val scrollState = rememberScrollState()

        Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFF1E1E1E))
                    .padding(8.dp)
            ) {
                Text(
                    text = output,
                    style = TextStyle(color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace, fontSize = 12.sp),
                    modifier = Modifier.fillMaxSize().verticalScroll(scrollState)
                )
            }
            Row(modifier = Modifier.fillMaxWidth().padding(top = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text("$ ", modifier = Modifier.padding(end = 4.dp))
                TextField(
                    value = command,
                    onValueChange = { command = it },
                    modifier = Modifier.weight(1f),
                    singleLine = true,
                    label = { Text("Command") }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = {
                    val cmd = command
                    command = ""
                    scope.launch {
                        output += "$cmd\n"
                        val result = withContext(Dispatchers.IO) {
                            try {
                                val proc = if (isRooted) {
                                    Runtime.getRuntime().exec(arrayOf("su", "-c", cmd))
                                } else {
                                    Runtime.getRuntime().exec(cmd)
                                }
                                val stdout = proc.inputStream.bufferedReader().readText()
                                val stderr = proc.errorStream.bufferedReader().readText()
                                proc.waitFor()
                                buildString {
                                    if (stdout.isNotEmpty()) append(stdout)
                                    if (stderr.isNotEmpty()) append(stderr)
                                    if (isEmpty()) append("(no output)\n")
                                }
                            } catch (e: Exception) {
                                "Error: ${e.message}\n"
                            }
                        }
                        output += result + "$ "
                    }
                }) { Text("Run") }
            }
        }
    }
}