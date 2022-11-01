fun main(){
    retFunc1()
}
fun retFunc1(){
    println("start of retFunc")
    inlineLambda(13, 3, fun( a, b){
        val result = a+b
        if(result > 10) return
        println("result: $result")
    }) //inlineLambda()함수의 끝
    println("end of retFunc")
}