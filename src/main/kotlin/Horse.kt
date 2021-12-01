class Horse(
    private val food: String,
    private val location: String,
    private val gender: Gender) : Animal("Horse", food, location) {

    override fun makeNoise() {
        when (gender) {
            Gender.MALE -> println("Igogo!")
            Gender.FEMALE -> println("Igogoooo...")
        }
    }

    override fun eat() {
        println("As for me $food - the best!")
    }

    enum class Gender {
        MALE,
        FEMALE
    }
}