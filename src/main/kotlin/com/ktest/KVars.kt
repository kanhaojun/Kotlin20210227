package com.ktest
fun getPrice(): Int {
    return 100

}
fun main(args: Array<String>) {
    var x = 10; //可再指派變變數 var
    x = 11
    println(x)
    val y = 20 // 不可再指派變變數 val
    //y =11
    println(y)
    // var or val 變數名稱 :變數型態 =初始直
    val pi: Double = 3.14 // val pi =3.14
    // BMI 練習

    println(1 / 2)
    println(0.1 + 0.1 + 0.1)

    val h = 170.0
    val w = 60.0
    val bmi = w / Math.pow(h / 100, 2.0)
    println(bmi)
    println("bmi:%.2f".format(bmi))
    println("bmi: $bmi")
    println("bmi: ${bmi *2}")
    var price = 100
    println("cost =${price *0.4}")
    println("cost =${getPrice() *0.4}")
    //簡單轉型
    var a :Int  = 10
    var b :Short = a.toShort()
    println ("$a $b")
    var e:Float =1.23f
    var intMax =Int.MAX_VALUE // Int 相當於Integer
    // example
    var chinese:String ="100"
    var english:String ="90"
    var math:String? ="80" // 問號放後面可能會有空值
    //math =null
    // 請算出總分
    var sum=chinese.toInt() + english.toInt() + math?.toIntOrNull()!! //雙驚嘆號自行處理
    println("sum = $sum") //println(sum)
    val c:Int ="100".toInt()
    println(c)
    val d:Int ="abc".toIntOrNull() ?: 0
    println(d)
    val f:Int? =null?.toIntOrNull() ?:-1
    println(f)
}