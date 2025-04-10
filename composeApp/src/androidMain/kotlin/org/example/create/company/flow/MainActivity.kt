package org.example.create.company.flow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.Black.toArgb(), Color.Black.toArgb()),
            navigationBarStyle = SystemBarStyle.light(scrim = Color.Transparent.toArgb(), darkScrim = Color.Transparent.toArgb())
        )
        setContent {
            App()
        }
    }
}
