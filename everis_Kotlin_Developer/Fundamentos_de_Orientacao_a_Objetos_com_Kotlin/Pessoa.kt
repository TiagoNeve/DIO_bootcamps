class Pessoa {
    var nome: String = "Tiago"
    var cpf: String = "000.000.000-00"

    inner class Endereco { //Classes internas
        var rua: String = "Rua: rua"

    }
}

fun main() {
    val tiago = Pessoa()

    println(tiago.nome)
    println(tiago.cpf)

    println(tiago.Endereco().rua) // É preciso instanciar na declaração para poder acessar
}