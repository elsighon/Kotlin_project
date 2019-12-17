package Exercice1

fun main (args: Array<String>){
    println("Entrez la valeur à trouver.")
    val value = readLine()
    println("vous devez maintenant deviner la valeur.")


    do {
        var find = readLine()
        if ("$value" == "$find"){
            println("Bravo, c'est la bonne valeur.")
        } else {
            if ("$value" < "$find") {
                println("C'est moins.")
            } else {
                println("C'est plus.")
            }
        }
    } while ("$value" != "$find")



}