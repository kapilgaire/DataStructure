package array.kt

import java.util.*

fun main(args: Array<String>) {
//    val fruits = arrayOf<String>("banana", "apple","grapes","orange","1","2")

//    for (fruit in fruits){
//        println(fruit)
//
//    }


//    try {
//        fruits.set(10,"kapil")
//    } catch (e: Exception) {
//        System.err.println(e.printStackTrace())
//    }

//    println("size of ${fruits.size}")
//    println(fruits.get(4))

    /*print("Enter length of array")
    val number :Int = readLine()!!.toInt()

    val numArray = IntArray(number)

    for (i in 0 until numArray.size ){
        print("Enter number")
        val num : Int = readLine()!!.toInt()
        println(i)
        numArray[i] = num

    }




    for (num in numArray){
        println("value ${num}")
    }*/

    val read = Scanner(System.`in`)

    print("Enter length of array")
    val number: Int = read.nextInt()

    val numArray = IntArray(number)

    for (i in 0 until numArray.size) {
        print("Enter number")
        val num: Int = read.nextInt()
        numArray[i] = num

    }


    println("Enter the number to find")
    val findNum: Int = read.nextInt()




    for (num in numArray) {
        if (num == findNum) {
            println("found $num")
            break
        } else {
            println("Not found $num")
        }
    }


}