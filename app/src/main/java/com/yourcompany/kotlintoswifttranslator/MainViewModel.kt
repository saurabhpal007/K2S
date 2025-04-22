package com.yourcompany.kotlintoswifttranslator

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // State holder for the Kotlin code input
    var kotlinCode by mutableStateOf("")
        private set // Make setter private if only ViewModel should change it directly

    // State holder for the Swift code output
    var swiftCode by mutableStateOf("")
        private set // Make setter private as only translation logic should change it

    /**
     * Updates the Kotlin code state.
     * Called by the UI when the input TextField changes.
     */
    fun onKotlinCodeChange(newCode: String) {
        kotlinCode = newCode
    }

    /**
     * Placeholder function to trigger the Kotlin to Swift translation.
     * This will eventually contain or call the actual translation logic.
     */
    fun translateKotlinToSwift() {
        // TODO: Implement actual Kotlin to Swift translation logic here
        // For now, just setting placeholder text
        swiftCode = "Swift code for:\n${kotlinCode}"
    }
}
