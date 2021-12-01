class Dog(
    private val food: String,
    private val location: String,
    private val isAngry: Boolean?) : Animal("Dog", food, location) {

    override fun makeNoise() {
        println("Woof! Woof!")
    }

    override fun eat() {
        when (isAngry) {
            null -> println("I like to eat $food.")
            true -> println("I'm angry if I'm not eating $food.")
            false -> println("Much more better if I eat $food.")
        }
    }
}