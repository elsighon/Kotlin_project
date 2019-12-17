package Exercice2

fun main() {
    val animalerie = Animalerie()

    animalerie.nouvelAnimal(Perroquet())
    animalerie.nouvelAnimal(Chat())
    animalerie.nouvelAnimal(Chien())
    animalerie.nouvelAnimal(Perroquet())
    animalerie.nouvelAnimal(Chat())
    animalerie.nouvelAnimal(Chien())

    for (animal in animalerie.list){
        animal.parler()
        animal.quiSuisJe()
    }
}