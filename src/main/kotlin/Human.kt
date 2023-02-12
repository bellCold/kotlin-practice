open class Human(val name: String = "defaultName") {
    init {
        println("New human has been born!!")
    }

    constructor(name: String, age: Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    open fun eatingCake() {
        println("this is yummyy")
    }
}

class Korean : Human() {
    override fun eatingCake() {
        super.eatingCake()
        println("한국인의 밥상")
        println("my name is ${name}")
    }
}

fun main() {
    Korean().eatingCake()
}