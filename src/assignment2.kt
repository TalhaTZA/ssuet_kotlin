/**
 * Created by lab2 on 27-May-18.
 */

fun main(args: Array<String>) {


    //tableGenerate()

    //calculator()

    markSheet()

}


fun markSheet() {

    var marks = IntArray(5, { i -> i * 0 });
    var obtainedMarks : Float = 0.0f

    for (i in 0 until marks.size) {
        println("Enter the marks of ${i + 1} subject:");
        var marksOfSubject: String? = readLine()
        if (marksOfSubject != null)
            marks[i] = marksOfSubject.toInt()
        else
            marks[i]=0

    }


    for (i in 0 until  marks.size) {
        println("The marks of ${i + 1} subject:${marks[i]}")
        obtainedMarks+=marks[i]
    }

    println("perecntage is ${(obtainedMarks*100)/500}")


}

fun calculator() {

    print("Enter first number:")
    var stringNumber1: String? = readLine()
    var intNumber1: Int? = stringNumber1?.toInt() ?: 1

    print("Enter second number:")
    var stringNumber2: String? = readLine()
    var intNumber2: Int? = stringNumber2?.toInt() ?: 1

    print("Enter operation:")
    var operation: String? = readLine()

    when (operation) {

        "*" -> {
            println("${intNumber1!! * intNumber2!!}")
        }
        "+" -> {
            println("${intNumber1!! + intNumber2!!}")
        }
        "-" -> {
            println("${intNumber1!! - intNumber2!!}")
        }
        "/" -> {
            println("${intNumber1!! / intNumber2!!}")
        }
        "%" -> {
            println("${intNumber1!! % intNumber2!!}")
        }

        else -> {
            print("wrong operation")
        }

    }


}


fun tableGenerate() {
    print("Enter the table you wan to print:")
    var stringNumber: String? = readLine()
    var intNumber: Int? = stringNumber?.toInt() ?: 1

    print("Enter the range you wan to print:")
    var stringNumberRange: String? = readLine()
    var intNumberRange: Int? = stringNumberRange?.toInt() ?: 0


    for (i in 1 until intNumberRange!! + 1) {
        println("${intNumber} * ${i} = ${intNumber!! * i} ")
    }

}

