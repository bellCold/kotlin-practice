class Lambda {
}

/**
 * 1.Lambda
 * 람다식은 마치 value 처럼 다룰 수 있는 익명함수이다.
 * 1) 메소드의 파라미터로 넘겨줄수가있다.
 * 2) return 값으로 사용할수가있다.
 */

val square = { number: Int -> number * number }

val nameAge = { name: String, age: Int ->
    "hi my name is ${name}, ${age}years old"
}

fun main() {
//    print(square(12))
//    println(nameAge("jongchan", 30))
//    val a = "joyce said"
//    val b = "mac said"
//    println(a.pizzaIsGreat())
//    println(b.pizzaIsGreat())

//    val extendString = extendString("jongchan", 1000)
//    println(extendString)
//    println(calculateGrade(111))

    val lambda = { number: Double ->
        number == 5.234
    }

//    println(invokeLambda(lambda))
    println(invokeLambda { it > 2.22 })
}

// 확장 함수
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!!"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = { "I'am ${this} and ${it}years old" }
    return name.introduceMyself(age)
}

// 람다의 return

val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfact"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(5.234)
}

