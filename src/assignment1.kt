

fun main(args: Array<String>) {

    var bytVar : Byte =1;
    var shortVar : Short =1;
    var intVar : Int =1;
    var floatVar : Float =1.0f;
    var doublVar : Double =1.0;
    var longVar : Long =1;
    var charVar : Char = '1';
    var stringVar : String = "1";
    var booleanVar :Boolean= true;
    var anyVar : Any  = 1;


    var bytVarstring : String ="1";
    var shortVarstring : String ="1";
    var intVarstring : String ="1";
    var floatVarstring : String ="1";
    var doublVarstring : String ="1";
    var longVarstring : String ="1";
    var charVarstring : String = "1";
    var booleanVarstring : String = "1";


    var bytVarFromString : Byte =  bytVarstring.toByte();
    var shortVarFromString : Short = shortVarstring.toShort();
    var intVarFromString : Int =  intVarstring.toInt();
    var floatVarFromString : Float = floatVarstring.toFloat();
    var doublVarFromString : Double = doublVarstring.toDouble();
    var longVarFromString : Long = longVarstring.toLong();
    //var charVarFromString : Char =  charVarstring.toCharArray();
    var booleanVarFromString : Boolean =  booleanVarstring.toBoolean();


    var bytVarIntoString : String =  bytVar.toString();
    var shortVarIntoString : String = shortVar.toString();
    var intVarIntoString : String=  intVar.toString();
    var floatVarIntoString : String = floatVar.toString();
    var doublVarIntoString : String = doublVar.toString();
    var longVarIntoString : String = longVar.toString();
    var charVarIntoString : String =  charVar.toString();
    var booleanVarIntoString : String = booleanVar.toString();


    var anyCheck : Any = "String";


    when (anyCheck) {
        is String -> {
            println(anyCheck.length)
        }

        is Int -> {
            println(anyCheck.plus(7))
        }

    }

//    var a : Int = 1;
//    var a : String = "1";

    var Int : Int = 12
    var public : Int =123

    var math : Int =94
    var science : Int =90
    var history : Int =74
    var english : Int =84
    var computer : Int =100


    println("marks in math ${math}")
    println("marks in science ${science}")
    println("marks in history ${history}")
    println("marks in english ${english}")
    println("marks in computer ${computer}")

    var marks = IntArray(5,{i -> i*0});

    for (i in 0 until marks.size){
        println("Enter the marks of ${i+1} subject:");
        var marksOfSubject : String? = readLine()
        if (marksOfSubject!=null)
            marks[i]=marksOfSubject.toInt()

    }

    for (i in 0 until  marks.size){
        println("The marks of ${i+1} subject:${marks[i]}")
    }


}
