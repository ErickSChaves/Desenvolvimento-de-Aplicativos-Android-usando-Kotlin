class pessoa1

class pessoa2 (var nome: String, var anoNascimento: Int)


class pessoa3 (var nome: String){

    var ano : Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }

    fun saudacao(){
        println("Ola, meu nome e $nome")
    }

    fun saudacao2(){
        println("Ola, meu nome e $nome e tenho $ano anos")
    }
}



fun main(args: Array<String>) {

    val pessoa: pessoa3 = pessoa3("Gabriel")
    val pessoa2: pessoa3 = pessoa3("Gabriel", 18)
    println(pessoa.nome)

    pessoa.saudacao()
    pessoa2.saudacao2()

}