class Pessoa {
    var nome: String = "Tiago"

    var cpf: String = "000.000.000-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf" // Possível acessar variáveis colocando o $
}

fun main() {
    val tiago = Pessoa()

    println(tiago.nome)
    println(tiago.cpf)

    println(tiago.pessoaInfo())

    //println(tiago.Endereco().rua) // É preciso instanciar na declaração para poder acessar
}