data class Customer1(var name: String, var email: String){
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email){
        job = _job
    }
}
val cus1 = Customer1("Sean", "sean@mail.com")
val cus2 = Customer1("Sean", "sean@mail.com")
fun main(){
    val name2 = cus1.component1()
    val email2 = cus1.component2()
    println("name = $name2, email = $email2")
}