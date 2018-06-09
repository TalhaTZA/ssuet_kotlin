/**
 * Created by lab2 on 03-Jun-18.
 */


fun main(args: Array<String>) {
    Q1()
    Q2()
    Q3()
    Q4()
    Q5()


}

fun Q1(){
    var array = arrayOf(1,2,3,4,5)

    for(i in array)
    {
        println(i)
    }


}

fun Q2(){
    var array = arrayOf(1,2,3,4,5)

    println("Find the number to search")
    var num = readLine()!!.toInt()

    if(num in array)
    {
        println("number found")

    }
    else
    {
        println("number not found")
    }
}

fun Q3(){
    println("Enter the size of array")
    var num = readLine()!!.toInt()

    var array = Array(num,{i->i*0})
    for(i in array)
        println(i)
}

fun Q4(){
    var sum=0;
    var array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for(i in array)
    {
        sum+=i
    }

    println("the sum is : ${sum}")

}

fun Q5(){
    println("Enter the size of array")
    var num = readLine()!!.toInt()

    var array = Array(num,{i->i*0})

    for((i,v) in array.withIndex()){
        println("Enter ${i+1} value :")
        num=readLine()!!.toInt()
        array[i]=num
    }

    var min=array[0]
    var max=array[0]

    for (value in array)
    {
        if(value>max)
            max=value

        if(value<min)
            min=value
    }

    println("The max is : ${max}")
    println("The min is : ${min}")

}

