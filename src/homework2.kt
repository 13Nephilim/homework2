fun main(){
    var n1 = Point(55,20)
    var n2 = Point(55, 20)
    println(n1.toString())
    println(n1.equals(n2))
    println(n1.გადაადგილება(16,-13))


}

class Point constructor(var x:Int, var y:Int) {
    var initx = 0
    var inity = 0

    init {
        initx = this.x
        inity = this.y
    }

    override fun toString(): String {
        return "$x, $y"
    }

    fun equal(n1: Point, n2: Point): Boolean {
        return (n1.x == n2.x && n1.y == n2.y)
    }
    fun გადაადგილება(a: Int, b: Int): String {
        x += a
        y += b
        initx += a
        inity += b
        return "\n X: $x, Y: $y"
    }


}
// მეორე დავალება
class Fraction {
    var numerator: Double = 0.0
    var denominator: Double = 0.0

    fun printFraction() {
        println("$this.numerator} / ${this.denominator}")
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }

    fun შეკრება(dennum:Fraction): Any {
        println(dennum.numerator + dennum.denominator)
        return dennum.numerator + dennum.denominator
    }

    fun გამრავლება(dennum: Fraction): Any {
        println(dennum.numerator * dennum.denominator)
        return dennum.numerator * dennum.denominator
    }
}