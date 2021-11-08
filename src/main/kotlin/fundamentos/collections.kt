package fundamentos

fun main() {


//Declarar lista do tipo inteiro

    var lista = mutableListOf(1, 2, 3, 4, 6)
    println(lista)
    lista.add(8)
    println(lista)
    lista.add(1)
    println(lista)
    lista.remove(1)
    println(lista)
    //Embaralha a lista
    lista.shuffle()
    println(lista)
    //val pares = lista.filter { it % 2 == 0 }

    //println(pares)

    //pegar um determinado index da lista
    //println(lista[0])
    //println(lista.get(0))
}

//Lista não mutavel, é uma lista onde seus valores não podem ser alterados posteriormente

var listaNaoMutavel = listOf(1, 2, 3)