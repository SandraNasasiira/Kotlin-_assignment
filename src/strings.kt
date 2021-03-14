fun main() {
school()
    println(sentence("Sandra","20"))
    println(work("Roma"))
    me("Resty")
    me("sandra")


}
fun school(){
    var a= "Akirachix"
    print(a[0])
    print(a[2])
    println(a[3])

}
fun sentence(x:String,y:String):String {
 return ("Hi,my name is $x and I am $y years old" )
}
fun work(u:String):Int {
    return (u.length)
}
fun me(m:String){
    if (m=="Resty"){
        println("that's me")
    }
    else{
        println("that's not me")
    }
}