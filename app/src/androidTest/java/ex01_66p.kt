fun main(){
    val a: Int = 128
    val b: Int = 128
    println(a == b) //true
    println(a === b) //ture

    val aa: Int= 128
    val bb: Int?= 128
    println(aa == bb) //true
    println(aa === bb) //false
}