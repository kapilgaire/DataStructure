package recursion

fun main(args: Array<String>) {

    println(fact(5))

}

fun fact(x: Int): Int {

    return if (x <= 1)
        1
    else
        x * fact(x - 1)

}