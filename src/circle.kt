class Circle(_name : String = "Circle") : Shape(_name) {
	private var radius: Int = 0

	fun setDimensions(radius : Int) {
		this.radius = radius
	}

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea() : Double {
        return (radius * radius * Math.PI)
    }

}
