package com.dylansalim.calculator.plus.logic

data class ConversionUnit(
    val category: Category,
    val unitShort: String?,
    val unitName: String,
    var factor: Double,
)