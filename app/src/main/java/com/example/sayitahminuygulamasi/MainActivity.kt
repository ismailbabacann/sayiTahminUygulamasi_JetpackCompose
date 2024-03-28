package com.example.sayitahminuygulamasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.sayitahminuygulamasi.ui.theme.SayiTahminUygulamasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SayiTahminUygulamasiTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                  SayfaGecisleri()
                }
            }
        }
    }
}

@Composable
fun SayfaGecisleri(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = "Anasayfa"){
        composable("Anasayfa"){
            Anasayfa(navController)
        }
        composable("tahminEkrani"){
            TahminEkrani(navController)
        }
        composable("sonucEkrani/{sonuc}" , arguments = listOf(
            navArgument("sonuc"){type= NavType.BoolType}
        )){
            val sonuc = it.arguments?.getBoolean("sonuc")!!
            sonucEkrani(navController , sonuc)
        }
    }
}

@Composable
fun Anasayfa(navController: NavController) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){
        Text(text = "TAHMİN OYUNU", fontSize = 36.sp)
        Image(painter = painterResource(id = R.drawable.baseline_casino_24), contentDescription = "açıklama")


        Button(onClick = { navController.navigate("tahminEkrani")
        } , modifier = Modifier.size(width = 250.dp , height = 50.dp)) {
            Text(text = "OYUNA BAŞLA")
        }
    }

}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    SayiTahminUygulamasiTheme {
        SayfaGecisleri()

    }
}