package com.dylansalim.calculator.plus.navigation

sealed class Screens(val route: String) {
    object CalculatorScreen: Screens("standard_screen")
//    object ScientificScreen: Screens("scientific_screen")
//    object ProgrammerCal: Screens("programmer_screen")

    object ConverterScreen: Screens("converters_screen")
}