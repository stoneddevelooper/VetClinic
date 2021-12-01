abstract class Animal(
    private val name: String,
    private val food: String,
    private val location: String){

    abstract fun makeNoise()
    abstract fun eat()
    fun sleep() {
        println("$name is sleeping...")
    }

    override fun toString(): String {
        return "\"name\": \"$name\",\n" +
                "\"food\": \"$food\",\n" +
                "\"location\": \"$location\"\n"
    }
}