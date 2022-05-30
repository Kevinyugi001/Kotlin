class student {
    var fullname = ""
    var fees = 0
    var course = ""
}
fun main(){
    val c1 = student()
    c1.fullname = "Mark John"
    c1.fees = 50000
    c1.course = "MIT"

    println(c1.fullname)
    println(c1.fees)
    println(c1.course)

}