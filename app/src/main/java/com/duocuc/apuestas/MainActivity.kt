package com.duocuc.apuestas



import android.R.style.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.duocuc.apuestas.ui.theme.ApuestasTheme
import com.duocuc.apuestas.ui.theme.CounterScreen
import com.duocuc.apuestas.viewModel.CounterViewModel


class MainActivity : ComponentActivity() {
    private val viewModel = CounterViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApuestasTheme {
                CounterScreen(viewModel)
            }
        }
    }
}