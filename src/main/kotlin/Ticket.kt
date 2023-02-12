data class Ticket(val company: String, val name: String, var date: String, var seatNumber: Int)
// toString(), hashCode(), equals(), copy() Lombok?

class NormalTicket(val company: String, val name: String, var date: String, var seatNumber: Int)

fun main() {
    val ticketA = Ticket("koreanAir", "bellCold", "2023-02-12", 14)
    val ticketB = NormalTicket("koreanAir", "bellCold", "2023-02-12", 14)
    println(ticketA)
    println(ticketB)
}