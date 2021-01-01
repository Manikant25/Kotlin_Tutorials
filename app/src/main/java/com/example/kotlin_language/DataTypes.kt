package com.example.kotlin_language

fun main()
{ //   var language = "French"
//    val score = 95
//    you can explicitly specify the type if you want to:
//    var language: String = "French"
//    val score: Int = 95
//
//    var language: String      // variable declaration of type String

//    language = "French"       // variable initialization
//
//    val score: Int          // variable declaration of type Int

//    score = 95             // variable initialization
//
//    var language           // Error
//    language = "French"

//    var language = "French"  //no error
//    language = "German"
//    val language = "French"
//    language = "German"      // Error
    val name:String
    name="Manikant"
    print(name)
    //===================================================================================================================//
    //Basic Data Types
    val language: Int
    val marks = 12.3

    val highestScore: Long = 9999
    println("$highestScore")
    val distance = 100L    // distance value of type Long
    // distance is of type Float
    val distance1 = 19.5F
    println("$distance1")

            var test: Number = 12.2
    println("$test")

    test = 12
    // Int smart cast from Number
    println("$test")

    test = 120L
    // Long smart cast from Number
    println("$test")


    val letter: Char
    letter = 'k'
    println("$letter")

//    var letter: Char = 65  // Error

//Boolean
    val flag = true
    println("$flag")


}