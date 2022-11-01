class Bird4(_name:String, _wing:Int, _beak:String, _color:String){
    var name:String=_name
    var wing:Int=_wing
    var beak:String=_beak
    var color:String=_color

    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
}
fun main(){
    val coco=Bird4("Youbird", 2, "long", "red")
    println("coco.name:${coco.name}, coco.wing:${coco.wing}")
    println("coco.color:${coco.color}, coco.beak:${coco.beak}")
}
