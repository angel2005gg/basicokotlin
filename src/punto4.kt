fun main() {
    val amanda = Person("Amanda", 33, "playing tennis", null)
    val atiqah = Person("Atiqah", 28, "climbing", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Hobby: $hobby")
        if (referrer == null) {
            println("Doesn't have a referrer\n")
        } else {
            println("Has a referrer named ${referrer.name}, who likes ${referrer.hobby}.")
        }
    }
}
