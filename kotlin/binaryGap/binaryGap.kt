// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(N: Int): Int {
    var binary = Integer.toBinaryString(N)
    if (binary.last().toString().equals("0")){
        binary = binary.substring(0,binary.toString().lastIndexOf("1"))
    }
    var gap = 0
    binary.split("1").filter {it != ""}.forEach {
        if (it.length > gap){
            gap = it.length
        }
    }
   return gap
}
