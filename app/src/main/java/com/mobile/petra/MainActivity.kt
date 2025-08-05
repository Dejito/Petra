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
import com.mobile.petra.presentation.views.auth.sign_up.SignUpScreen
import com.mobile.petra.presentation.views.products.ProductListingScreen
import com.mobile.petra.router.AppNavigators
import com.mobile.petra.ui.theme.PetraTheme

class MainActivity : ComponentActivity() {

//    private lateinit var productVm: ProductViewModel


    override fun onCreate(savedInstanceState: Bundle?) {

//        productVm = ViewModelProvider(this)[ProductViewModel::class.java]

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetraTheme {
                ProductListingScreen()
//                    AppNavigators()
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