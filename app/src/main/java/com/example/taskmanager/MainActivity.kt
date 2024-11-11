package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting(
                        stringResource(R.string.text1),
                        stringResource(R.string.text2),

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text1: String, text2: String,modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

        Column(

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
            
        )  {
            Image(
                painter = image,
                contentDescription = null,
            )
            Text(
                text = text1,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(
                     // start = 0.dp,
                     top = 24.dp,
                     //  end = 0.dp,
                     bottom = 8.dp)

            )
            Text(
                text = text2,
                fontSize = 16.sp,//размер в масштабируемых пикселях
                textAlign = TextAlign.Center,
                modifier = modifier
            )
        }

}
//параметры предпросмотра
@Preview(
    showBackground = true,
    showSystemUi= true // показывает рамку устройства в првеью композа
)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Greeting(stringResource(R.string.text1),stringResource(R.string.text2))
    }
}