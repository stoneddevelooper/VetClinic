class Cat(
    private val food: String,
    private val location: String,
    private val isCute: Boolean?) : Animal("Cat", food, location) {

    override fun makeNoise() {
        println("Meoooow...")
    }

    override fun eat() {
        println("I prefer $food.")
    }

    fun doSmth() {
        when (isCute) {
            null -> println("Cat is going to do nothing.")
            false -> println("WARNING! Cat is going to bite you!")
            true -> println("Cat is going to lick your hand:)")
        }
    }
}