fun main() {  
   var numbers = arrayOf(2,6,11,-10,-5,29,1,0,9)
   calculateAndPrintStatistics(numbers)
}


fun calculateAndPrintStatistics(numbers: Array<Int>) {
    var sum = 0
    var count = 0
    var product = 1
    val divisorForAverage = 1
    
    for(number in numbers) {
        if(number > 0) {
	    if(number >= 10) {
	        sum += number
	        count++
        }
        
        if(number% 3 == 0) {
            product *= number
        }
      }
    }
    
    if(count != 0) {
        val average = sum / count
        println("The average = $average")
    }
    else {
        println("Ther is no number found to calculate average ")
    }
    
    println("The product = $product")
}
