object FizzBuzz extends App{
    val count = readInt()
    println("count = " + count)
    type FizzBuzz = (Int) => Int
    def divisioning(div :Int)(x : Int) = x % div
    val fizz = divisioning(3)(_)
    val buzz = divisioning(5)(_)

    def getResult(number :Int) = {
        (fizz(number), buzz(number)) match{
            case(0,0) => "fizzbuzz"
            case(0,_) => "fizz"
            case(_,0) => "buzz"
            case _=> number.toString
        }
    }

    for(i <- 1 to count) yield {println(getResult(i))}
}