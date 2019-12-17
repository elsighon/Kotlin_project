package Exercice2

class Animalerie {
    var list = mutableListOf<Animal>()

    fun nouvelAnimal(animal: Animal){
        list.add(animal)
    }


}