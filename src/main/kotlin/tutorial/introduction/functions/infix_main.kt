package tutorial.introduction.functions

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katarina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    val dion = Person()

    sophia likes claudia
    dion likes sophia

    sophia.showLikedPeople()
    dion.showLikedPeople()
}

class Person(private val name: String = "Dion") {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }

    fun showLikedPeople() {
        println(likedPeople)
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}
