package com.lumi.singularity.ui.activities

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lumi.singularity.ui.theme.SingularityRebornTheme

class LedColorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SingularityRebornTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    LedColorScreen(this)
                }
            }
        }
    }

    @Composable
    private fun LedColorScreen(context: Context) {
        val prefs = remember { context.getSharedPreferences("singularity_prefs", Context.MODE_PRIVATE) }
        var red by remember { mutableStateOf(prefs.getInt("led_red", 255)) }
        var green by remember { mutableStateOf(prefs.getInt("led_green", 255)) }
        var blue by remember { mutableStateOf(prefs.getInt("led_blue", 255)) }

        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Custom LED Color", style = MaterialTheme.typography.headlineLarge)
            Box(modifier = Modifier.size(120.dp).clip(CircleShape).background(Color(red, green, blue)).border(2.dp, MaterialTheme.colorScheme.outline, CircleShape))
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Red: $red"); Slider(value = red.toFloat(), onValueChange = { red = it.toInt() }, valueRange = 0f..255f)
                    Text("Green: $green"); Slider(value = green.toFloat(), onValueChange = { green = it.toInt() }, valueRange = 0f..255f)
                    Text("Blue: $blue"); Slider(value = blue.toFloat(), onValueChange = { blue = it.toInt() }, valueRange = 0f..255f)
                }
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally)) {
                listOf(Triple(255,0,0) to "Red", Triple(0,255,0) to "Green", Triple(0,0,255) to "Blue", Triple(255,255,255) to "White").forEach { (rgb, name) ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(modifier = Modifier.size(48.dp).clip(CircleShape).background(Color(rgb.first, rgb.second, rgb.third)).clickable { red = rgb.first; green = rgb.second; blue = rgb.third })
                        Text(name, style = MaterialTheme.typography.labelSmall)
                    }
                }
            }
            Button(onClick = { prefs.edit().putInt("led_red", red).putInt("led_green", green).putInt("led_blue", blue).apply(); finish() }, modifier = Modifier.fillMaxWidth()) { Text("Save & Apply") }
        }
    }
}