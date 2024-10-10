package com.example.shipcaptain

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shipcaptain.ui.theme.ShipCaptainTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShipCaptainTheme {
                ShipCaptain()
            }
        }
    }
}

@Composable
fun ShipCaptain() {
    val treasuresFound = remember{ mutableStateOf(0) }
    val direction = remember { mutableStateOf(" North ")}
    val stormOrTreasure = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Treasures found: ${treasuresFound.value}")
        Text("Direction: ${direction.value}")
        Text(stormOrTreasure.value)
//   Hello

        Button(onClick = {
            direction.value = "North"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
                stormOrTreasure.value = "We found a Treasure"
            }
            else{
                stormOrTreasure.value = "We got a Storm"
            }
        }) {
            Text("Go North")
        }

        Button(onClick = {
            direction.value = "East"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
                stormOrTreasure.value = "We found a Treasure"
            }
            else{
                stormOrTreasure.value = "We got a Storm"
            }
        }) {
            Text("Go East")
        }

        Button(onClick = {
            direction.value = "West"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
                stormOrTreasure.value = "We found a Treasure"
            }
            else{
                stormOrTreasure.value = "We got a Storm"
            }
        }) {
            Text("Go West")
        }

        Button(onClick = {
            direction.value = "South"
            if(Random.nextBoolean()){
                treasuresFound.value += 1
                stormOrTreasure.value = "We found a Treasure"
            }
            else{
                stormOrTreasure.value = "We got a Storm"
            }
        }) {
            Text("Go South")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ShipCaptainPreview() {
    ShipCaptainTheme {
        ShipCaptain()
    }
}