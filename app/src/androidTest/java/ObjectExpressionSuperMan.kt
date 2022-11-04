open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Taling with people.")
    open fun fly() = println("Flying in the air.")
}
fun main(){
    val pretendedMan = object: Superman() { //(1) object 표현식으로 fly()구현의 재정의
        override fun fly() = println("I'm not a real superman. I can't fly!")
     }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}