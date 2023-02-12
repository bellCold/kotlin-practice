class Human(val name: String = "defaultName") {
    init {
        println("New human has been born!!")
    }

    constructor(name: String, age: Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    fun eatingCake() {
        println("${this.name} this is yummyy")
    }
}

fun main() {
    val human = Human()
    human.eatingCake()
    Human("jongchan", 20).eatingCake()
}