fun main(args: Array<String>) {
    val animals: Collection<Animal> = listOf(
        Dog("bones", "Madrid", null),
        Cat("milk", "Moscow", true),
        Horse("apples", "Miami", Horse.Gender.FEMALE))

    val vet = Vet()
    animals.forEach(vet::treatAnimal)

    for (animal in animals) {
        animal.eat()
        animal.makeNoise()
        animal.sleep()
        if (animal is Cat) {
            animal.doSmth()
        }
        println()
    }
}