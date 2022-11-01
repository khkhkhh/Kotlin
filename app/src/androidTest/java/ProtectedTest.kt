open class Base1{ //최상위 선언 클래스에는 protected를 사용할 수 없음
    protected var i =1
    protected fun protectedFunc(){
        println(i)
        i+=1 //접근 허용
        println(i)
    }
    fun access(){
        protectedFunc() //접근 허용
    }
    protected class Nested //내부 클래스에서는 지시자 허용
}
class Derived : Base1(){
    fun test(base: Base): Int{
        protectedFunc() //Base클래스의 메서드 접근 가능
        return i //Base클래스의 프로퍼티 접근 가능
    }
}
fun main(){
    val base=Base1() //생성 가능
//    base.i //접근 불가
//    base.protectedFunc() //접근 불가
    base.access() //접근 가능
}