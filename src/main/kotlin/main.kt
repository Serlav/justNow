fun main() {
    agoToText(15)
    agoToText(120)
    agoToText(5 * 60)
    agoToText(59 * 60)
    agoToText(2 * 60 * 60)
    agoToText(4 * 60 * 60)
    agoToText(5 * 60 * 60)
    agoToText(25 * 60 * 60)
    agoToText(3 * 24 * 60 * 60)
    agoToText(4 * 24 * 60 * 60)
}

fun agoToText(second: Int) {
    when (second) {
        in 0..60 -> println("был(а) в сети только что")
        in 61..60 * 60 -> secondToMinute(second)
        in 60 * 60 + 1..24 * 60 * 60 -> secondToHour(second)
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> println("был(а) в сети сегодня")
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }
}

fun secondToMinute(second: Int): String {

    val minute = when (second / 60) {
        1, 21, 31, 41, 51 -> " минуту назад"
        in 2..4 -> " минуты назад"
        else -> " минут назад"
    }
    println("был(а) в сети " + (second / 60) + minute)
    return minute
}

fun secondToHour(second: Int): String {
    val hour = when (second / 3600) {
        1, 21 -> " час назад"
        in 2..4 -> " часа назад"
        else -> " часов назад"
    }
    println("был(а) в сети " + (second / 3600) + hour)
    return hour
}