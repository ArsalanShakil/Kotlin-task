// Exercise set 1: Kotlin basics exercises
// exercise 1
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    var high: Int? = null
    var low: Int? = null
    var count =0
    var sum = 0
  loop@do {
      val number = readLine()
      count++
      val numInt = number?.toIntOrNull()
      if(numInt != null) {
          high = maxOf(numInt, high ?: numInt)
          low = minOf(numInt, low ?: numInt)
          sum = sum + numInt
      }
      else if ("quit" == number){
          break@loop
      }
      else {
          count++
      }

  }while("quit"!=number)
    var average  = 0

    if(count == 1){
        println("smallest number = $low, largest number = $high, the count of numbers = 0, average = $average")
    }
    else{
        count--
        average = sum.div(count)
        println("smallest number = $low, largest number = $high, the count of numbers = $count, average = $average")
    }


}
