package org.swamy.k101.functions

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun printPersonDetails(name: String, age: Int = 0, dob: LocalDate = LocalDate.parse("1900-01-01")) {
    val message = """
        Person Details: 
            Name = $name, 
            Age = $age, 
            DOB = ${dob.format(DateTimeFormatter.ISO_DATE)}""".trimIndent()
    println(message)

}

fun main(args: Array<String>) {

    printName("Swamy")

    var result = add(10, 21)
    println("Result = $result")

    // Functions with default values
    println("\n\n ### Functions with default values")
    println("\tCalling printPersonDetails() with - \"Swamy\",  45, LocalDate.parse(\"1975-01-01\") ")
    printPersonDetails( "Swamy",  45, LocalDate.parse("1975-01-01"))

    // Functions with default values
println("\n\n \t Calling printPersonDetails() with - \"Swamy\",  45 ;; Leaving out the default value for dob")
    printPersonDetails( "Swamy",  45)

    // Functions with named values - order of parameters does not matter
    println("\n\n \t Calling printPersonDetails() with - dob = LocalDate.parse(\"1975-01-01\") , name = \"Swamy\" ")
    printPersonDetails(dob = LocalDate.parse("1975-01-01"), name = "Swamy")



/*    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
 */
}

/*
    * Unit type is similar to void in Java
    * Any is similar to Object in Java
 */

// Function definition
// fun <function_name>(<parameter_list>): <return_type> {
//      parameters are separated by comma, and each parameter is specified with its type
//          e.g. name: String, age: Int
//      return type is specified after the parameter list preceded by a colon (:)

//     <function_body>
// }

fun add(x: Int, y: Int): Int {

    println("\t\t Inside add() function; x = $x, y = $y")
    return x + y
}

fun printName(name: String) {
    println("My name is $name")
}


