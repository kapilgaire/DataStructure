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



    var max:Int = numArray[0]

    var min : Int = numArray[0]

    for (i in 0 until numArray.size){
        if(numArray[i]>max){
            max = numArray[i]
        }
        if(numArray[i]<min){
            min = numArray[i]
        }
    }

    println("max $max")
    println("min $min")



}