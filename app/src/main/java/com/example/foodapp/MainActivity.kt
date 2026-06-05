package com.example.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.foodapp.ui.menu.view.MenuScreen
import com.example.foodapp.ui.menu.viewmodel.MenuViewModel
import com.example.foodapp.ui.theme.FoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme {
                val menuViewModel: MenuViewModel = viewModel()
                MenuScreen(viewModel = menuViewModel)
            }
        }
    }
}
