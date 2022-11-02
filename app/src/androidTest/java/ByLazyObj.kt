class Person4(val name: String, val age: Int)
fun main(){
    var isPersonInstantiated: Boolean = false //(1) 초기화 확인 용도

    val person: Person4 by lazy { //lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person4("Kim", 23) //(3) 이 부분이 Lazy 객체로 반환 됨
    }
    val personDelegate = lazy {Person4("Hong", 40)} //(4) 위임 변수를 사용한 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}") //(5) 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") //(6) 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}