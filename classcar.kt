class Car {
    var brand = ""
    var model = ""
    var year = 0
}
fun main(){
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "Toyota"
    c2.model = "Corolla"
    c2.year = 1998

    val c3 = Car()
    c3.brand = "BMW"
    c3.model = "X5"
    c3.year = 1999

    val c4 = Car()
    c4.brand = "Mercedes"
    c4.model = "E-200"
    c4.year = 2000

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)

    println(c3.brand)
    println(c3.model)
    println(c3.year)

    println(c4.brand)
    println(c4.model)
    println(c4.year)
}
