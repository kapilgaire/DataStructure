package array.kt

import java.util.*

fun main(args: Array<String>) {


    val read = Scanner(System.`in`)

    print("Enter length of array")
    val number: Int = read.nextInt()

    val numArray = IntArray(number)

    for (i in 0 until numArray.size) {
        print("Enter number")
        val num: Int = read.nextInt()
        numArray[i] = num

    }


    for ( i in   numArray.size downTo 1){
        println("rev $i")
    }

}