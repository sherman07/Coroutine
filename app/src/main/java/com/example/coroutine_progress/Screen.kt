package com.example.coroutine_progress

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
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
fun showProgressIndicator(){
    var textData by remember {
        mutableStateOf("No data")
    }
    var scope = rememberCoroutineScope()
    var showProgress by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = textData)

            if (showProgress) {
                CircularProgressIndicator()
            }
            Button(onClick = {


                showProgress = true

                scope.launch {
                    textData = fetchData()
                    showProgress = false
                }
            }) {
                Text(text = "Show")

            }
        }

    }

}

//挂起方法
suspend fun fetchData() : String {
    delay(5000)
    return "new Data fetch"
}
