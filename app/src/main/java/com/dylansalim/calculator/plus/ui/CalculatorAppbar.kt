@file:OptIn(ExperimentalMaterial3Api::class)

package com.dylansalim.calculator.plus.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun CalculatorAppbar(title: String, onNavigationClick: () -> Unit) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        navigationIcon = {
            IconButton(onNavigationClick) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
            }
        }
    )
}