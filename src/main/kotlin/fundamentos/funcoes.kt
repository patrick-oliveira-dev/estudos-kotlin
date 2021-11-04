package fundamentos

fun main() {
    dizOi(retornaNome(), 25)
    dizOi(idade = 25, nome = "Patrick")
}

fun retornaNome(): String {
    return "Patrick"
}

fun dizOi(nome: String, idade: Int) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}