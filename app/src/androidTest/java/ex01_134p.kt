fun main(){
    retFunc2()
}
fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit){ //inline이 제거됨
    out(a,b)
}

fun retFunc2(){
    println("start of retFunc")
    inlineLambda2(13,3) lit@{a,b ->
        val result = a+b
        if(result > 10) return@lit
        println("result: $result")
    }
    println("end of retFunc")
}