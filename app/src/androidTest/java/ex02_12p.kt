class Bird2{
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(_name: String, _wing: Int, _beak: String, _color: String){
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main(){
    val coco = Bird2("mybird", 2, "short", "blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
