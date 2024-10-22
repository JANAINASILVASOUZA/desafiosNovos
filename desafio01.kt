// Classe base abstrata
abstract class Animal(val name: String) {
    abstract fun makeSound()
}

// Classe Dog que herda de Animal
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Woof!")
    }
}

// Classe Cat que herda de Animal
class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Meow!")
    }
}

// Função que recebe uma lista de Animal e invoca o método makeSound
fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        animal.makeSound()
    }
}

// Exemplo de uso
fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")

    val animals: List<Animal> = listOf(dog, cat)
    animalSounds(animals)
}
