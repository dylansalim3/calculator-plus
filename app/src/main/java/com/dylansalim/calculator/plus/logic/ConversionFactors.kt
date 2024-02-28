package com.dylansalim.calculator.plus.logic

object ConversionFactors {
    fun allUnits() = listOf(
        ConversionUnit(Category.LENGTH, "km", "Kilometer", 1000.0),
        ConversionUnit(Category.LENGTH, "hm", "Hectometer", 100.0),
        ConversionUnit(Category.LENGTH, "m", "Meter", 1.0),
        ConversionUnit(Category.LENGTH, "dm", "Decimeter", 0.1),
        ConversionUnit(Category.LENGTH, "cm", "Centimeter", 0.01),
        ConversionUnit(Category.LENGTH, "mm", "Millimeter", 0.0010),
        ConversionUnit(Category.LENGTH, "\u00b5m", "Micrometer", 1.0E-6),
        ConversionUnit(Category.LENGTH, "nm", "Nanometer", 1.0E-9),
        ConversionUnit(Category.LENGTH, "\u00c5", "Angstrom", 1.0E-10),
        ConversionUnit(Category.LENGTH, "pm", "Picometer", 1.0E-12),
        ConversionUnit(Category.LENGTH, "fm", "Femtometer", 1.0E-15),
        ConversionUnit(Category.LENGTH, "in", "Inches", 0.0254),
        ConversionUnit(Category.LENGTH, "mi", "Miles", 1609.344),
        ConversionUnit(Category.LENGTH, "nmi", "Nautical Miles", 1852.0),
        ConversionUnit(Category.LENGTH, "ft", "Feet", 0.3048),
        ConversionUnit(Category.LENGTH, "yd", "Yard", 0.9144),
        ConversionUnit(Category.LENGTH, "l.y.", "Light-Year", 9.46073E15),
        ConversionUnit(Category.LENGTH, "pc", "Parsec", 3.085678E16),
        ConversionUnit(Category.LENGTH, "px", "Pixel", 0.000264583),
        ConversionUnit(Category.LENGTH, "pt", "Point", 0.0003527778),
        ConversionUnit(Category.LENGTH, "p", "Pica", 0.0042333333),
        ConversionUnit(Category.LENGTH, "em", "Quad", 0.0042175176),
        ConversionUnit(Category.MASS, "t", "Ton", 1.0E3),
        ConversionUnit(Category.MASS, "kg", "Kilogram", 1.0),
        ConversionUnit(Category.MASS, "g", "Gram", 1.0E-3),
        ConversionUnit(Category.MASS, "mg", "Milligram", 1.0E-6),
        ConversionUnit(Category.MASS, "\u00b5g", "Mikrogram", 1.0E-6),
        ConversionUnit(Category.MASS, "ng", "Nanogram", 1.0E-9),
        ConversionUnit(Category.MASS, "pg", "Picogram", 1.0E-12),
        ConversionUnit(Category.MASS, "fg", "Femtogram", 1.0E-15),
        ConversionUnit(Category.MASS, "oz", "Ounce (US)", 0.028),
        ConversionUnit(Category.MASS, "lb", "Pounds (US)", 0.45359237),
        ConversionUnit(Category.TIME, "wk", "Week", 604800.0),
        ConversionUnit(Category.TIME, "d", "Day", 86400.0),
        ConversionUnit(Category.TIME, "h", "Hour", 3600.0),
        ConversionUnit(Category.TIME, "m", "Minute", 60.0),
        ConversionUnit(Category.TIME, "s", "Second", 1.0),
        ConversionUnit(Category.TIME, "ms", "Millisecond", 1E-3),
        ConversionUnit(Category.TIME, "\u00b5s", "Microsecond", 1E-6),
        ConversionUnit(Category.TIME, "ns", "Nanosecond", 1E-9),
        ConversionUnit(Category.TIME, "ps", "Picosecond", 1E-12),
        ConversionUnit(Category.TIME, "fs", "Femtosecond", 1E-15),
        ConversionUnit(Category.AREA, "km\u00b2", "Square Kilometer", 1.0E6),
        ConversionUnit(Category.AREA, "m\u00b2", "Meter", 1.0),
        ConversionUnit(Category.AREA, "cm\u00b2", "Square Centimeter", 1.0E-4),
        ConversionUnit(Category.AREA, "mm\u00b2", "Square Millimeter", 1.0E-6),
        ConversionUnit(Category.AREA, "\u00b5m\u00b2", "Square Mikrometer", 1.0E-12),
        ConversionUnit(Category.AREA, "nm\u00b2", "Square Nanometer", 1.0E-18),
        ConversionUnit(Category.AREA, "\u00c5\u00b2", "Square \u00c5ngstrom", 1.0E-20),
        ConversionUnit(Category.AREA, "pm\u00b2", "Square Picometer", 1.0E-24),
        ConversionUnit(Category.AREA, "fm\u00b2", "Square Femtometer", 1.0E-30),
        ConversionUnit(Category.AREA, "ha", "Hectare", 1.0E5),
        ConversionUnit(Category.AREA, "ac", "Acre", 4046.8564224),
        ConversionUnit(Category.AREA, "a", "Ares", 100.0),
        ConversionUnit(Category.AREA, "in\u00b2", "Square Inch", 0.00064516),
        ConversionUnit(Category.AREA, "ft\u00b2", "Square Foot", 0.09290304),
        ConversionUnit(Category.ANGLE, "deg", "Degree", Math.PI / 180.0),
        ConversionUnit(Category.ANGLE, "rad", "Radian", 1.0),
        ConversionUnit(Category.ANGLE, "grad", "Gradian", 0.9),
        ConversionUnit(Category.VOLUME, "mm\u00b3", "Cubic Millimeter", 1.0E-9),
        ConversionUnit(Category.VOLUME, "ml", "Milliliter", 1.0E-6),
        ConversionUnit(Category.VOLUME, "l", "Liter", 1.0E-3),
        ConversionUnit(Category.VOLUME, "m\u00b3", "Cubic Meter", 1.0E0),
        ConversionUnit(Category.VOLUME, "gal", "US Gallon", 0.0037854118),
        ConversionUnit(Category.VOLUME, "ft\u00b3", "Cubic Foot", 0.0283168466),
        ConversionUnit(Category.VOLUME, "in\u00b3", "Cubic Inch", 0.0000163871),
        ConversionUnit(Category.VOLTAGE, "mV", "Millivolt", 1.0E-3),
        ConversionUnit(Category.VOLTAGE, "V", "Volt", 1.0E0),
        ConversionUnit(Category.VOLTAGE, "kV", "Kilovolt", 1.0E3),
        ConversionUnit(Category.VOLTAGE, "MV", "Megavolt", 1.0E6),
        ConversionUnit(Category.CURRENT, "pA", "Picoampere", 1.0E-12),
        ConversionUnit(Category.CURRENT, "nA", "Nanoampere", 1.0E-9),
        ConversionUnit(Category.CURRENT, "\u00b5A", "Microampere", 1.0E-6),
        ConversionUnit(Category.CURRENT, "mA", "Milliampere", 1.0E-3),
        ConversionUnit(Category.CURRENT, "A", "Ampere", 1.0),
        ConversionUnit(Category.CURRENT, "kA", "Kiloampere", 1.0E3),
        ConversionUnit(Category.SPEED, "mm/s", "Millimeter per second", 1.0E-3),
        ConversionUnit(Category.SPEED, "m/s", "Meter per second", 1.0E0),
        ConversionUnit(Category.SPEED, "km/h", "Kilometer per hour", 0.2777777778),
        ConversionUnit(Category.SPEED, "mph", "Miles per hour", 0.44704),
        ConversionUnit(Category.SPEED, "kt", "Knot", 0.51444444444444),
        ConversionUnit(Category.SPEED, "M", "Mach", 0.00293866995797),
        ConversionUnit(Category.TEMPERATURE_GRADIENT, "K/s", "Kelvin per second", 1.0),
        ConversionUnit(Category.TEMPERATURE_GRADIENT, "K/min", "Kelvin per minute", 0.0166666667),
        ConversionUnit(Category.TEMPERATURE_GRADIENT, "K/h", "Kelvin per hour", 0.0002777778),
        ConversionUnit(Category.ELECTRIC, "e-", "Elementary charge", 1.6022E-19),
        ConversionUnit(Category.ELECTRIC, "pC", "Picocoulomb", 1.0E-12),
        ConversionUnit(Category.ELECTRIC, "nC", "Nanocoulomb", 1.0E-9),
        ConversionUnit(Category.ELECTRIC, "\u00b5C", "Microcoulomb", 1.0E-6),
        ConversionUnit(Category.ELECTRIC, "mC", "Millicoulomb", 1.0E-3),
        ConversionUnit(Category.ELECTRIC, "C", "Coulomb", 1.0E0),
        ConversionUnit(Category.ENERGY, "mJ", "Millijoule", 1.0E-3),
        ConversionUnit(Category.ENERGY, "J", "Joule", 1.0E0),
        ConversionUnit(Category.ENERGY, "kJ", "Kilojoule", 1.0E3),
        (ConversionUnit(Category.ENERGY, "MJ", "Megajoule", 1.0E6)),
        ConversionUnit(Category.ENERGY, "cal", "Calory", 4.1868),
        ConversionUnit(Category.ENERGY, "kcal", "Kilocalory", 4186.8),
        ConversionUnit(Category.ENERGY, "W*s", "Watt second", 1.0E0),
        ConversionUnit(Category.ENERGY, "W*h", "Watt hour", 3600.0),
        ConversionUnit(Category.ENERGY, "kW*s", "Kilowatt second", 1000.0),
        ConversionUnit(Category.ENERGY, "kW*h", "Kilowatt hour", 3600000.0),
        ConversionUnit(Category.FORCE, "N", "Newton", 1.0),
        ConversionUnit(Category.FORCE, "kp", "Kilogram-Force", 9.80665),
        ConversionUnit(Category.FORCE, "lbf", "Pound-Force", 4.4482216153),
        ConversionUnit(Category.ACCELERATION, "m/s\u00b2", "Meter per squaresecond", 1.0E0),
        ConversionUnit(Category.ACCELERATION, "in/s\u00b2", "Inch per squaresecond", 0.0254),
        ConversionUnit(Category.ACCELERATION, "g", "Gravity", 9.80665),
        ConversionUnit(Category.PRESSURE, "mPa", "Millipascal", 1.0E-3),
        ConversionUnit(Category.PRESSURE, "Pa", "Pascal", 1.0E0),
        ConversionUnit(Category.PRESSURE, "hPa", "Hectopascal", 1.0E2),
        (ConversionUnit(Category.PRESSURE, "kPa", "Kilopascal", 1.0E3)),
        ConversionUnit(Category.PRESSURE, "bar", "Bar", 1.0E5),
        ConversionUnit(Category.PRESSURE, "mbar", "Millibar", 1.0E2),
        (ConversionUnit(Category.PRESSURE, "Torr", "Torr", 133.322368421)),
        ConversionUnit(Category.PRESSURE, "psi", "Pound per Square Inch", 6894.757293178),
        ConversionUnit(Category.PRESSURE, "psf", "Pound per Square Foot", 47.88026),
        (ConversionUnit(Category.PRESSURE, "atm", "Atmosphere", 101325.0)),
        ConversionUnit(Category.TORQUE, "Nm", "Newton Meter", 1.0),
        ConversionUnit(Category.TORQUE, "m kg", "Meter Kilogram", 0.101971621),
        ConversionUnit(Category.TORQUE, "ft lbf", "Foot-Pound Force", 1.3558179483),
        ConversionUnit(Category.TORQUE, "in lbf", "Inch-Pound Force", 0.112984829),
        ConversionUnit(Category.DATA, "b", "Bit", 1.0),
        ConversionUnit(Category.DATA, "Kb", "KiloBit", 1024.0),
        ConversionUnit(Category.DATA, "Mb", "Megabit", 1048576.0),
        ConversionUnit(Category.DATA, "Gb", "Gigabit", 1073741824.0),
        ConversionUnit(Category.DATA, "B", "Byte", 8.0),
        ConversionUnit(Category.DATA, "KB", "Kilobyte", 8192.0),
        ConversionUnit(Category.DATA, "MB", "Megabyte", 8388608.0),
        ConversionUnit(Category.DATA, "GB", "Gigabyte", 8.589934592E9),
        ConversionUnit(Category.DATA, "TB", "Terabyte", 8.796093E12),
        ConversionUnit(Category.LUMINANCE, "cd/m\u00b2", "Candela per Square Meter", 1.0),
        ConversionUnit(Category.LUMINANCE, "cd/cm\u00b2", "Candela per Square CentiMeter", 10000.0),
        ConversionUnit(Category.LUMINANCE, "cd/in\u00b2", "Candela per Square Inch", 1550.0031),
        ConversionUnit(Category.LUMINANCE, "cd/ft\u00b2", "Candela per Square Foot", 10.7639104167),
        ConversionUnit(Category.LUMINANCE, "L", "Lambert", 3183.09886183),
        ConversionUnit(Category.LUMINANCE, "fL", "Footlambert", 3.4262590996),
        ConversionUnit(Category.LUMINOUS_FLUX, "lm/m\u00b2", "Lux", 1.0),
        ConversionUnit(Category.LUMINOUS_FLUX, "lm/cm\u00b2", "Phot", 10000.0),
        ConversionUnit(Category.LUMINOUS_FLUX, "lm/ft\u00b2", "Footcandle", 10.7639104167),
        ConversionUnit(Category.LUMINOUS_FLUX, "lm/in\u00b2", "Lumen per Square Inch", 1550.0031),
        ConversionUnit(Category.WORK, "mW", "Milliwatt", 1.0E-3),
        ConversionUnit(Category.WORK, "W", "Watt", 1.0E0),
        ConversionUnit(Category.WORK, "kW", "Kilowatt", 1.0E3),
        ConversionUnit(Category.WORK, "MW", "Megawatt", 1.0E6),
        ConversionUnit(Category.WORK, "GW", "Gigawatt", 1.0E9),
        ConversionUnit(Category.WORK, "hp", "Horsepower", 735.49875),
        ConversionUnit(Category.WORK, "J/s", "Joule per second", 1.0E0),
        ConversionUnit(Category.CSS, "px", "Pixel", 1.0),
        ConversionUnit(Category.CSS, "pt", "Point", 0.75),
        ConversionUnit(Category.BLOOD_GLUCOSE, "mg/dl", "Milligram per deciliter", 0.0555),
        ConversionUnit(Category.BLOOD_GLUCOSE, "mmol/l", "Millimols per liter", 1.0)
    )

    fun convert(value: Double, from: ConversionUnit, to: ConversionUnit): Number {
        require(!(to.category !== from.category)) { "units have to be of the same type" }
        return (value * from.factor) * from.category.factor / to.factor
    }
}