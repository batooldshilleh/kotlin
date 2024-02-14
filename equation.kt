import kotlin.math.cbrt

fun main() {
    
   calculate(12)
}

fun calculate (num: Int){
    var sum = 0
    for(i in 1..num){
        var cubeRoot = cbrt(i.toDouble()).toInt()
        //println(cubeRoot)
         sum += cubeRoot
       
    }
    println(sum)
   
}
