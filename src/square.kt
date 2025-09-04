class Square(_name : String  ="Square") : Shape(_name) {
    private var length : Int = 0
    private var height : Int = 0

    fun setDimensions(length : Int, height : Int) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("The dimensions of this shape is $length x  $height")
    }

    override fun getArea() : Double {
        return (length * height).toDouble()
    }

}