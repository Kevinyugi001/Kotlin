fun main(args: Array<String>) {
        val number = 2000
        println("List of even numbers from 500 to $number: ")
        for (i in 500..number) {
            if (i % 2 == 0) {
                println("$i ")
            }
        }
    }
