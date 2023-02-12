fun main() {
    // 3. String Template

    val name = "David"
    val lastName = "Kim"
    println("my name is ${name + lastName} hi")
    println("is this true? ${1 == 0}")
    println("this is 2\$")
}

// 1.함수
fun hellWorld(): Unit {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

/**
 * val vs var
 * val == value (재할당 x)
 */
fun hi() {
    val a = 10
    var b = 9
    var name = "joyce"
}