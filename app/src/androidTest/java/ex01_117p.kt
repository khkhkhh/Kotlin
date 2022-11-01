fun main(){
    var data: Any=10
    when (data){
        is String -> println("data is String") //data가 문자열 타입이면
        20, 30 -> println("data is 20 or 30") //data가 20 또는 30이면
        in 1..10 -> println("data is 1..10") //data가 1~10의 값이면
        else -> println("data is not valid")
    }
}