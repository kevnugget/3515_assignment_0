fun main(args: Array<String>) {
    val circle : Shape = Circle()
    val square : Shape = Square()
    val triangle : Shape = Triangle()
    val equilateralTriangle : Shape = EquilateralTriangle()

    print("Enter radius for circle: ")
    (circle as Circle).setDimensions(readln().toInt())
    println("Shape name: ${circle.name}")
    println("Dimensions: ${circle.printDimensions()}")
    println("Area: ${circle.getArea()}")

    print("Enter length and height for square as 'length height': ")
    val (length, height) = readln().split(' ').map{it.toInt()}
    (square as Square).setDimensions(length, height)
    println("Shape name: ${square.name}")
    println("Dimensions: ${square.printDimensions()}")
    println("Area: ${square.getArea()}")

    print("Enter sides for triangle as 'side_a_value side_b_value side_c_value': ")
    val (a, b, c) = readln().split(' ').map {it.toInt()}
    (triangle as Triangle).setDimensions(a, b, c)
    println("Shape name: ${triangle.name}")
    println("Dimensions: ${triangle.printDimensions()}")
    println("Area: ${triangle.getArea()}")

    print("Enter side for equilateral triangle: ")
    (equilateralTriangle as EquilateralTriangle).setDimensions(readln().toInt())
    println("Shape name: ${equilateralTriangle.name}")
    println("Dimensions: ${equilateralTriangle.printDimensions()}")
    println("Area: ${equilateralTriangle.getArea()}")

}