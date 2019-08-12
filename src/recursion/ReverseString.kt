package recursion

fun main(args: Array<String>) {

    var demoStr: String = "hello this is kapil"


    println(reverseString(demoStr))
}

fun reverseString(demo: String): String {

    return if (demo.isEmpty()) {
        demo
    } else {

        reverseString(demo.substring(1)) + demo[0]
    }
}