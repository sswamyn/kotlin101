package org.swamy.k101

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val myName: String = "Swamy"

    val yourName: String

    println("My name is $myName")
    println("My name is ${myName.length} characters long")

    yourName = "Sarika and Suraj"
    println("Your name is $yourName")
    println("Your name is ${yourName.length} characters long")

    // Multiline string definition
    println("\n\n ### Multiline string definition")
    val multilineString = """
        This is a multiline string
           This is line 2, with some indentation  // Only the initial indentation is removed. 
        This is line 3
    """.trimIndent()
    println(multilineString)

    // if-else and when
   // ifElseWhenDemo()

    // Range; downTo, until, step
    //rangeDemo()

    // while and do-while
    //whileDemo()

    // label demo -- New to Kotlin
    //labelDemo()  // break@outer
    labelDemo2() // break@inner

}

fun whileDemo() {
    // while and do-while
    println("\n\n ### while and do-while")
    var x = 1 // try with 11 ; the code block will not be executed
    while (x <= 10) {
        println("\t x = $x")
        x++
    }

    println(" Let us try do-while")
    x = 1 // try with 11 ; the code block will be executed __at least once__
    do {
        println("\t x = $x")
        x++
    } while (x <= 10)
}

fun ifElseWhenDemo() {
    // if-else and when
    println("\n\n ### if-else and when")
    var position = 1

    if (position == 1) {
        println("First place")
    } else if (position == 2) {
        println("Second place")
    } else {
        println("Did not place")
    }

    when (position) {
        1 -> println("First place")
        2 -> println("Second place")
        else -> println("Did not place")
    }

}

fun rangeDemo() {
    // Range; downTo, until, step
    println("\n\n ### Range; downTo, until, step")

    println("Range 1..10")
    val aRange = 1..10
    for (i in aRange) {
        println("\t i = $i")
    }

    println("Range 1 until 10, with step 2")
    for (i in 1..10 step 2) {
        println("\t i = $i")
    }

    println("Range 10 downTo 1")
    val revRange = 10 downTo 1
    for (i in revRange) {
        println("\t i = $i")
    }

}

fun labelDemo() {
    // Label
    println("\n\n ### Label")
    outer@ for (i in 1..8) {
        println("i = $i")
        for (j in 1..5) {
            println("\t j = $j")
            if (i == 3 && j == 4) {
                break@outer
            }
            println("\t i = $i, j = $j")
        }
    }
}

fun labelDemo2() {
    // Label
    println("\n\n ### Label")
    outer@ for (i in 1..8) {
        println("i = $i")
        inner@ for (j in 1..5) {
            println("\t j = $j")
            //if (i == 3 && j == 4) {
            if (i >= 3 && j == 4) {
                break@inner
            }
            println("\t i = $i, j = $j")
        }
    }
}
