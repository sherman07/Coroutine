package com.example.coroutine_progress

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Countdown_Timer(){
    var textData by remember {
        mutableStateOf("10 - 1")
    }
    val scope = rememberCoroutineScope()
    var showProgress by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = textData)

            Button(onClick = {

                showProgress = true
                

                scope.launch {
                    textData = Countdown_Data()
                    showProgress = false
                }
            }) {
                Text(text = "Countdown Timer!!!")

            }
        }

    }
}

suspend fun Countdown_Data() : String {
    for (i in 10 downTo 0){
        println(11-i)
        delay(1000)

    }
    return "Welcome to my space!"
}

///Countdown timer!
//  10 > 9 –> 8 ……..0, -> Welcome to my space!
//“Start button”