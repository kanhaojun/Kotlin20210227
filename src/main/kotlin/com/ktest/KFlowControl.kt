package com.ktest

import kotlin.random.Random as r
fun getLevel(score:Int) =when(score){
    in 90..100 ->"A"
    in 80..89 ->"B"
    in 70..79 ->"C"
    in 60..69 ->"D"
    else ->"E"

}

fun main( args: Array<String>){
    var  score = r.nextInt(101)
    val  pass = if (score >= 60)"Pass else" else "Fail"
    println("$score $pass")
    when(score){
        in 90..100 ->print("A")
        in 80..89 ->print("B")
        in 70..79 ->print("C")
        in 60..69 ->print("D")
        else ->print("E")
    }
    var level =when(score/10){
            in 90..100 ->"A"
            in 80..89 ->"B"
            in 70..79 ->"C"
            in 60..69 ->"D"
            else ->"E"

    }
    println(level)
    print(getLevel(score))
    for(i in 1..10 step 2){
        print("$i ")
    }
    println()
    for(i in 10 downTo 1){
        print("$i")
    }
    println()
    for(i in 10 until 1){ //until不包含10
        print("$i")
    }
    println()

    //有一個1~10的亂數，給使用者來猜，猜對Bingo,有五次機會
    //加入請猜小/大的提示
    val ans =r.nextInt(10)+1
    val max = 5
    for (i in 1..max){
            print("第 $i/$max 次 :請輸入數字:")
        //val  guess = Scanner(System.`in`)
        val guess =readLine()!!.toInt()
        if (guess == ans ) {
            println("Bingo")
            break
            }else if(guess > ans){
                println("請猜小的提示")
            }else {
                println("請猜大的提示")
            }

    }

}