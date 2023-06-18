package org.swamy.k101.classes

class Item(var name : String = "", var price : Double = 0.0, var quantity : Int = 0) {
//    var name : String = ""
//    var price : Double = 0.0
//    var quantity : Int = 0

    init {
       /* this.name = name
        this.price = price
        this.quantity = quantity*/
        var msg = this.printItemDetails()
        println("In the init block \n \t $msg")
    }

    fun printItemDetails() : String {
    val message = """
            Item Details: 
                Name = $name, 
                Price = $price, 
                Quantity = $quantity""".trimIndent()
        println(message)
        return message
    }
}

fun main(args: Array<String>) {
    // Creating an object of Item class
    val item = Item("Apple", 1.99, 10)
    item.printItemDetails()

    // Creating an object of Item class
    val item2 = Item("Orange", 2.99, 20)
    item2.printItemDetails()
 }