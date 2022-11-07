open class Parent1
class Child1: Parent1()
class Cup<T>
fun main() {
    val obj1: Parent1 = Child1() //Parent 형식의 obj1은 Child로 형 변환될 수 있음
   /* val obj2: Child1 = Parent1() //Error! 하위 형식인 Child의 객체 obj2는 Parent로 변환되지 않음
    val obj3: Cup<Parent1> = Cup<Child1>() //Error! 자료형 형식이 일치하지 않음
    val obj4: Cup<Child1> = Cup<Parent1>() //Error! 자료형 형식이 일치하지 않음*/

    val obj2: Child1 = Child1() //Error! 하위 형식인 Child의 객체 obj2는 Parent로 변환되지 않음
    val obj3: Cup<Parent1> = Cup<Parent1>() //Error! 자료형 형식이 일치하지 않음
    val obj4: Cup<Child1> = Cup<Child1>() //Error! 자료형 형식이 일치하지 않음

    val obj5 = Cup<Child1>() //obj5는 Cup<Child> 형식이 됨
    val obj6: Cup<Child1> = obj5 //형식이 일치하므로 가능 !

}