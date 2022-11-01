class Bird3 constructor(_name: String, _wing:Int, _beak:String, _color:String){
    var name: String=_name
    var wing: Int=_wing
    var beak: String=_beak
    var color: String=_color

    fun fly()=println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main(){
    val  bird=Bird3("mybird", 2, "short", "blue")
    println("bird1.color: ${bird.color}")
    bird.fly()
    bird.sing(3)
}