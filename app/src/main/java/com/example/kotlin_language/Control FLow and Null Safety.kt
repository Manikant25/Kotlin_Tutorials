package com.example.kotlin_language

import android.util.Log

fun main()
{
    val number: Int = 19

    var result: String = ""

    result = if (number % 2 == 0) {
        "even"
    } else {
        "odd"
    }

   println(result)

    val myFirstNumber: Float = 45.6f
    val mySecondNumber: Float = 50.9f

    val max = if (myFirstNumber > mySecondNumber) {
        myFirstNumber
    } else {
        mySecondNumber
    }

    println( "max number is : $max")

    val age: Int = 30

    val ageRange = if (age <= 12) {
        "child"
    } else if (age > 12 && age < 17) {
        "Teen"
    } else if (age in 18..21) {
        "Young Adult"
    } else if (age in 22..30) {
        "Adult"
    } else if (age in 31..50) {
        "Middle Age"
    } else {
        "Old"
    }

    println( ageRange)


    val dayOfWeek: Int = 7

    val day = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }

    println("day of week is : $day")


    val toDo = when (dayOfWeek) {
        in 1..5 -> "Go to School"
        in 6..7 -> "Have fun, it is weekend"
        else -> "Invalid day"
    }
    println( "What to do today : $toDo")

    val myNumber = 156

    val numberOfDigits = when (myNumber) {
        in 1..9 -> "One Digit Number"
        in 10..99 -> "Two Digits Number"
        in 100..999 -> "Three Digits Number"
        else -> "Four or More Than Four Digits"
    }

    println( "Number of Digits are : $numberOfDigits")

    val numberTypeGuess: Any = 19.000000

    val numberDataType = when (numberTypeGuess) {

        is Int -> "Int"
        is Float -> "Float"
        is String -> "String"
        is Boolean -> "Boolean"
        is Array<*> -> "Array"
        else -> "Invalid Data Type or Haven't been studied yet"
    }
    println( "Number Type is : $numberDataType")

    var myNumberIncreasing: Int = 1

    while (myNumberIncreasing < 10) {
        myNumberIncreasing += 1
        println("While, My Increased Number is : $myNumberIncreasing")
    }

    do {
        myNumberIncreasing += 1
        println("Do-while, My Increased Number is : $myNumberIncreasing")
    } while (myNumberIncreasing < 10)


    for (i in 1..5) {
        println( "i in Range is : $i")
    }

    for (i in 5 downTo 1) {
        println("i in Reversed Range is : $i")
    }

    for (i in 5..20 step 2) {
        println("i in Advance 2 : $i")
    }

    val myArray: Array<String> =
            arrayOf("android", "Q", "Kotlin", "practice as much as you can", "developer")

    for (element in myArray) {
        println("elements of Array : $element ")
    }

    for (index in myArray.indices) {
        println("myArray[$index] = ${myArray[index]} ")
    }

    for ((index, element) in myArray.withIndex()) {
        println("myArray[$index] = $element")
    }

    val myString: String? = "Bita"

    println("null safe operator : ${myString?.length}")

    myString?.let {
        println( "let operator : ${it.length}")
    }

    val length = if (myString != null) {
        myString.length
    } else {
        -1
    }

    val length2 = myString?.length ?: -1

    println("elvis operator : $length")
    println("elvis operator : $length2")

    val length3 = myString!!.length
    println( "double bang operator : $length3")
}