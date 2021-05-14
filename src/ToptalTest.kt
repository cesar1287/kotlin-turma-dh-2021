import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters.firstInMonth
import java.time.temporal.TemporalAdjusters.lastInMonth
import java.time.temporal.WeekFields
import java.util.*
import kotlin.math.nextUp

fun main() {
    //print(solution(2014, "April", "May", "Wednesday"))
    println(getChange(3.14, 1.99))
    println(getChange(4.0, 3.14))
    println(getChange(0.45, 0.34))
    println(findWord(listOf("I>N","A>I","P>A","S>P")))
}

fun solution(Y: Int, A: String, B: String, W: String): Int {
    val now = LocalDate.now()
    val weekFields = WeekFields.of(Locale.getDefault())
    val firstMonday = now
        .withYear(Y)
        .withMonth(getNumberOfTheMonth(A))
        .with(firstInMonth(DayOfWeek.MONDAY))
    val lastSunday = now
        .withYear(Y)
        .withMonth(getNumberOfTheMonth(B))
        .with(lastInMonth(DayOfWeek.SUNDAY))
    val weekOfTheYearBeginning = firstMonday.get(weekFields.weekOfWeekBasedYear())
    val weekOfTheYearEnding = lastSunday.get(weekFields.weekOfWeekBasedYear())
    return weekOfTheYearEnding - weekOfTheYearBeginning
}

fun getNumberOfTheMonth(month: String): Int {
    return when(month) {
        "January" -> 1
        "February" -> 2
        "March" -> 3
        "April" -> 4
        "May" -> 5
        "June" -> 6
        "July" -> 7
        "August" -> 8
        "September" -> 9
        "October" -> 10
        "November" -> 11
        "December" -> 12
        else -> -1
    }
}

fun solution(N: Int, A: IntArray, B: IntArray): Boolean {
    val graphPair = mutableSetOf<Pair<Int, Int>>()
    val auxPair = mutableSetOf<Pair<Int, Int>>()

    A.forEachIndexed { index, actualValue ->
        val secondValue = B[index]
        val pair = if (actualValue > secondValue) {
            Pair(secondValue, actualValue)
        } else {
            Pair(actualValue, secondValue)
        }

        graphPair.add(pair)
    }
    for (num in 1 until N) {
        auxPair.add(Pair(num, num+1))
    }

    var cont = 0
    auxPair.forEach {
        if (graphPair.contains(it)) {
            cont++
        }
    }

    return cont == auxPair.size
}

fun solution(A: IntArray): Int {
    val min = A.minOrNull() ?: 0
    val max = A.maxOrNull() ?: 0

    return when {
        max <= 0 -> {
            1
        }
        min == 1 -> {
            var aux = 2
            var response = 0
            while (aux < max + 1) {
                if (!A.contains(aux)) {
                    response = aux
                    break
                }
                aux++
            }
            response
        }
        else -> {
            (min) - 1
        }
    }
}

fun solution(S: String): String {
    val regex = Regex("[^A-Za-z0-9]")
    val result = regex.replace(S, "")
    val response = StringBuilder()
    if (result.length % 3 == 1) {
        val finalString = result.takeLast(4)
        val initialString = result.take(result.length - 4)
        val initialList = initialString.chunked(3)
        val finalList = finalString.chunked(2)
        initialList.forEach {
            response.append(it)
            response.append("-")
        }
        finalList.forEach {
            response.append(it)
            response.append("-")
        }
    } else {
        val list = result.chunked(3)
        list.forEach {
            response.append(it)
            response.append("-")
        }
    }

    return response.toString().dropLast(1)
}

fun solution(A: Array<String>, B: Array<String>, P: String): String {
    val auxList = mutableListOf<String>()
    B.forEachIndexed { index, s ->
        if (s.contains(P)) {
            auxList.add(A[index])
        }
    }
    auxList.sort()
    return if (auxList.isEmpty()) {
        "NO CONTACT"
    } else {
        auxList.first()
    }
}

fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()

fun getChange(M: Double, P: Double): List<Int> {
    var change = M - P
    val listOfCoins = listOf(1.0, 0.5 , 0.25, 0.1, 0.05, 0.01)
    val auxList = mutableListOf<Int>()
    listOfCoins.forEach{ number ->
        var cont = 0
        while (change - number >= 0) {
            change -= number
            change = change.round(2)
            cont++
        }
        auxList.add(cont)
        cont = 0
    }

    return auxList.reversed()
}

fun findWord(list: List<String>): List<String> {
    val result = mutableListOf<String>()
    list.forEach {
        val precedence = it.split(">")
        val first = it.first().toString()
        val last = it.last().toString()
        val indexFirst = result.indexOf(first)
        val indexLast = result.indexOf(last)
        if (indexLast == 0) {
            result.add(0, first)
        } else {
            result.add(first)
            result.add(last)
        }
    }
    return result
}