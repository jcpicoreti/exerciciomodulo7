fun main() {
    val myString = "ebaconline"
    val stringList = myString.toCharList()
    println(stringList)

    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println("É final de semana? ${UtilityHelper.isWeekend()}")

    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    println("É final de semana? ${UtilityHelper.isWeekend()}")
}