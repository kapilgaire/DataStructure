package array.sort

fun main(args: Array<String>) {

    var numArray  = intArrayOf(23,54,32,45,65,65,76,78,23,23,2,2)

    var len: Int = numArray.size

    for(i in 0 until  len ){
//        println(numArray[i])

        var min_index = i

        for (j in i+1 until len){

//            println(numArray[j])

            if(numArray[j]< numArray[min_index]){
                min_index = j

                //swap
                var temp = numArray[min_index]
                numArray[min_index] = numArray[i]
                numArray[i] = temp
            }
        }

    }

    for (numb in numArray){
        println(numb)
    }

}