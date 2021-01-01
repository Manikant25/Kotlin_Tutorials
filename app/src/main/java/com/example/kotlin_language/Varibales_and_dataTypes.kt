package com.example.kotlin_language

import android.util.Log


fun main()
{
    val a : Int = 10
    val b : Int = 5
    val c : Int = 3
    val d : Int = 9

    var result : Int = a + b

    println( "Result a + b : $result")

    result = a - b

    println( "Result a - b : $result")

    result = a/b

    println( "Result a/b : $result")

    result = a*b

    println( "Result a*b : $result")

    result = a%b

    println("Result a%b : $result")

    result = a%c

    println( "Result a%c : $result")

    result = a*b - d/c

    println("Result a*b - d/c : $result")

    result = a*b + d/c

    println( "Result a*b + d/c : $result")

    result = (a*b + d)/c

    println("Result (a*b + d)/c : $result")

    val myAge : Int = 30
    val yearsLater : Int = 10

    val myAgeIn2030 : Int = myAge + yearsLater

//    Log.d("KotlinBeginners", "Result  : $myAgeIn2030")

    val myNumber1 : Float = 1.4f
    val myNumber2 : Float = 4.5f

    result = (myNumber1 + myNumber2).toInt()

    println("Result for conversion : $result")

    val resultForFloatingPoints : Float = myNumber1 + myNumber2

    println("resultForFloatingPoints : $resultForFloatingPoints")

    val firstCharacter : Char = 'a'
    val secondCharacter : Char = '1'

    println("firstCharacter : $firstCharacter")
    println( "secondCharacter : $secondCharacter")

    val myFirstString : String = "My name is : "
    val mySecondString : String = "Bita "
    val myThirdString : String = "and my age is 30"

    val resultOfStrings : String =  myFirstString + mySecondString + myThirdString
    val resultOfStringsTheSecond : String =  "$myFirstString$mySecondString$myThirdString"

    println( "resultOfStrings : $resultOfStrings")
    println( "resultOfStringsTheSecond : $resultOfStringsTheSecond")

    val isRaining : Boolean = true
    val isSunny : Boolean = false

    println("if it is Raining : $isRaining and if it is sunny : $isSunny")

    val intArray : Array<Int> = arrayOf(1, 5, 8, 100)
    val stringArray : Array<String> = arrayOf("Bita", "30", "android")
    val mixArray : Array<Any> = arrayOf(1, "Bita", 1.5f, true, 'b')

    println("intArray : ${intArray[0]}, ${stringArray[1]}, ${mixArray[3]}")

    println("resultOfStringsTheSecond : ${(4 < 10) && (5<10)}")
}