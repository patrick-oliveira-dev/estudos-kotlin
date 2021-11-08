package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int) {

    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Patrick", "Rua Ivo Goulart, 127", 25)

        }
        fun criarApartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Patrick", "Rua Ivo Goulart, 127", 25)
    }
}

fun main() {
    //chamando uma classe normal
    var segundaClasse = SegundaClasse("Rafaela", "Ivo Goulart, 127", 24).criarComValoresPadrao()

    //chamando um companion object

    var minhaClasse = MinhaClasse.criarComValoresPadrao()

    var minhaClasseLoader = MinhaClasse.criarApartirDeSegundaClasse(segundaClasse)

}