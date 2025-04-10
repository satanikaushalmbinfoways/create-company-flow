package org.example.create.company.flow

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import createcompanyflow.composeapp.generated.resources.Res
import createcompanyflow.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme(
//        colors = MaterialTheme.colors.copy(background = Color.Green)
    ) {
        val navController = rememberNavController()
        Scaffold(
            contentWindowInsets = WindowInsets.systemBars
        ) { innerPadding ->
            Column(
                Modifier
                    .fillMaxWidth(),
            ) {
                NavHost(
                    navController = navController,
                    startDestination = ""
                ) {
                    
                }
            }
        }
    }
}