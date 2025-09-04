import kotlin.math.sqrt

open class Triangle(_name : String = "Triangle") : Shape(_name) {
	private var a : Int = 0
	private var b : Int = 0
	private var c : Int = 0

	fun setDimensions(a : Int, b : Int, c : Int) {
		this.a = a
		this.b = b
		this.c = c
	}

    override fun printDimensions() {
        println("Side A: $a\nSide B: $b\nSide C: $c")
    }

    override fun getArea() : Double {
        val sides = 0.5 * (a + b + c)
        return sqrt(sides * (sides- a) * (sides- b) * (sides - c))
    }


}	
