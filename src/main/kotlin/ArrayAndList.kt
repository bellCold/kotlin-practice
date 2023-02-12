fun main() {
    forAndWhile()
}

// 5. Array and List
// Array
// List 1. List 2. MutableList
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "a", 3.4)
    val list2 = listOf(1, "a", 3.4)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

fun forAndWhile() {
    val students = arrayListOf("kim", "jong", "chan")

    for ((index, name) in students.withIndex() ) {
        println("${index + 1}번째 학생의 이름 : ${name}")
    }

    for (name in students) {
        println("${name}")
    }

    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    for (i in 1..10 step 2) {
    }
    for (i in 10 downTo 1) {
    }
    for (i in 1 until 100) { // 1..99

    }

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}
