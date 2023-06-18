package org.swamy.k101.classes

class Person() {
    var name: String = ""
    var age: Int = 0
    var dob: String = ""

    // Secondary constructor - that takes the object attributes as parameters
    constructor(_name: String, _age: Int, _dob: String) : this() {
        this.name = _name
        this.age = _age
        this.dob = _dob
    }

    // Another constructor - that takes the object attributes as parameters
    constructor(_name: String, _dob: String) : this() {
        this.name = _name
        this.dob = _dob
    }

    fun printPersonDetails() {
        val message = """
            Person Details: 
                Name = $name, 
                Age = $age, 
                DOB = $dob""".trimIndent()
        println(message)
    }
}

fun main(args: Array<String>) {
    // Creating an object of Person class
    val person = Person()
    person.name = "Swamy"
    person.age = 45
    person.dob = "1975-01-01"
    person.printPersonDetails()

    // Creating an object of Person class using the secondary constructor
    val person2 = Person("Sarika", 40, "1980-01-01")
    person2.printPersonDetails()

    // Creating an object of Person class
    val person3 = Person()
    person3.printPersonDetails()
}