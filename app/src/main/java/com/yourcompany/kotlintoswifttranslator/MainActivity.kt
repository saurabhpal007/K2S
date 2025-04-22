package com.yourcompany.kotlintoswifttranslator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.yourcompany.kotlintoswifttranslator.ui.CodeTranslatorScreen
// Theme import removed as com.yourcompany.kotlintoswifttranslator.ui.theme.KotlinToSwiftTranslatorTheme does not exist

class MainActivity : ComponentActivity() {

    // Obtain the ViewModel using the activity-ktx delegate
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // KotlinToSwiftTranslatorTheme wrapper removed as the theme file doesn't exist
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background // Still using MaterialTheme colors
            ) {
                // Call the main screen Composable, passing state and event handlers
                CodeTranslatorScreen(
                    kotlinCode = viewModel.kotlinCode,
                    swiftCode = viewModel.swiftCode,
                    onKotlinCodeChange = viewModel::onKotlinCodeChange, // Pass function reference
                    onTranslateClick = viewModel::translateKotlinToSwift // Pass function reference
                )
            }
        }
    }
}
