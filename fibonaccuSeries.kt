fun main() {
    
     fibonacci(5)
    
}

fun fibonacci(number: Int){
    var term1 = 0 
    var term2 = 1
    println("the fibonaccu series for $number is :")
    for(element in 1..number){
        println(term1)
        val nextTerm = term1 + term2
        term1 = term2 
        term2 = nextTerm
    }
}
