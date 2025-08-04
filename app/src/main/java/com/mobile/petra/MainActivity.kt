package com.mobile.petra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mobile.petra.presentation.views.EndpointTest
import com.mobile.petra.presentation.views.auth.sign_in.LoginScreen
import com.mobile.petra.ui.theme.PetraTheme

class MainActivity : ComponentActivity() {

//    private lateinit var productVm: ProductViewModel


    override fun onCreate(savedInstanceState: Bundle?) {

//        productVm = ViewModelProvider(this)[ProductViewModel::class.java]

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PetraTheme {
        Greeting("Android")
    }
}