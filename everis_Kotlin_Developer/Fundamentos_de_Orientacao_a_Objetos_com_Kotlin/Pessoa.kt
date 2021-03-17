class Pessoa {
    var nome: String = "Tiago"
    var cpf: String = "000.000.000-00"
}

fun main() {
    val tiago = Pessoa()

    println(tiago.nome)
    println(tiago.cpf)
}