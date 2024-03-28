package com.example.sayitahminuygulamasi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun sonucEkrani(navController: NavController , gelenSonuc:Boolean) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){

        if (gelenSonuc){
            Text(text = "KAZANDINIZ!", fontSize = 36.sp)
            Image(painter = painterResource(id = R.drawable.baseline_emoji_emotions_24), contentDescription = "açıklama")
        }
        else{
            Text(text = "KAYBETTİN!", fontSize = 36.sp)
            Image(painter = painterResource(id = R.drawable.baseline_face_5_24), contentDescription = "açıklama")

        }

        }
    }

