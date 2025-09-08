abstract class Shape (name1 : String) : Dimensionable {
    val name = name1

    open fun getArea() : Double {
        return 0.0
    }
}
