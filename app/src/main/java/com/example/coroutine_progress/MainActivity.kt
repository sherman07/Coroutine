package com.example.coroutine_progress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coroutine_progress.ui.theme.Coroutine_ProgressTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Coroutine_ProgressTheme {
                GreetingPreview()
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Coroutine_ProgressTheme {
        Countdown_Timer()
    }
}