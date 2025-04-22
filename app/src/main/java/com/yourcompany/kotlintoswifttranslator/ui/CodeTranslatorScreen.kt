package com.yourcompany.kotlintoswifttranslator.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CodeTranslatorScreen(
    kotlinCode: String,
    swiftCode: String,
    onKotlinCodeChange: (String) -> Unit,
    onTranslateClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Row to hold the two text fields side-by-side
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Takes up most of the vertical space
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Space between text fields
        ) {
            // Kotlin Code Input Area
            OutlinedTextField(
                value = kotlinCode,
                onValueChange = onKotlinCodeChange,
                label = { Text("Enter Kotlin Code") },
                modifier = Modifier
                    .weight(1f) // Each TextField takes half the width
                    .fillMaxHeight() // Fill the height of the Row
            )

            // Swift Code Output Area
            OutlinedTextField(
                value = swiftCode,
                onValueChange = { /* Swift code is output only, so read-only */ },
                label = { Text("Swift Code Output") },
                readOnly = true, // Make it read-only
                modifier = Modifier
                    .weight(1f) // Each TextField takes half the width
                    .fillMaxHeight() // Fill the height of the Row
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Space before button

        // Translate Button
        Button(
            onClick = onTranslateClick,
            modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button
        ) {
            Text("Translate to Swift")
        }
    }
}
