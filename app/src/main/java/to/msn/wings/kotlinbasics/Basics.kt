package to.msn.wings.kotlinbasics

import java.lang.Math.floor

fun main() {
    val a = arrayOf(1,2,3)
    try{
        println(a[3])
    }catch(e:ArrayIndexOutOfBoundsException){
        println("配列の範囲外です")
    }catch(e:Exception){
        println("例外")
    }finally{
        println("終了")
    }
}


class Human{
    val name = "Taro"
    inner class Man{
        fun pri(){
            println("Man!")
            println(this@Human.name)
        }
    }
}