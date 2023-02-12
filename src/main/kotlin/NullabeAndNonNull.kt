import java.util.*

class NullableAndNonNull {
}

fun main() {
    ignoreNulls("null")
}

// 7. Nullable / NonNull

fun nullCheck() {
    //NPE :NULL pointer Exception

    var name = "jongchan"

    var nullName: String? = null

    var nameInUpperCase = name.uppercase(Locale.getDefault())

    var nullNameInUpperCase = nullName?.uppercase(Locale.getDefault())

    // ?:
    var lastName: String? = null

    println("${name} ${lastName ?: "hi"}")

    // !!
}

fun ignoreNulls(str: String?) {
    val upper = str?.uppercase(Locale.getDefault())

    val email: String? = "xxxx@naver.com"
    // nonnull -> lambdar
    email?.let {
        println("my email is ${it}")
    }
}