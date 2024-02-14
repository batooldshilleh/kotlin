fun main()  {
    printEarnings(10.0, 20.0)
    printEarnings(55.2, 25.8)
    printEarnings(12.88, 62.5)
}

fun printEarnings(sold: Double, salaryy: Double) {
    var salary = salaryy
    if (sold < 10.0)
    	salary = salary * 0.10
    else if (sold >=10.0 && sold <= 50.0)
    	salary = salary * 0.20
    else if (sold > 50.0)
    	salary = salary * 0.30
    println("Earnings: $salary")
}
