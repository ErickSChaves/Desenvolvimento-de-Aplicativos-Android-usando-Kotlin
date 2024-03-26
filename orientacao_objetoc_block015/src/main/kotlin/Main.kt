class Constante {
    companion object {
        val Table = "Pessoa"

        fun teste(){
            println("Sou um mtodo estatico")
        }
    }

    object Vendas {
        val table_name = "vendas"

        object colunas {
            val id = "id"
            val total = "total"
        }
    }

}

open class Maquina(val marca: String) {
    open fun minhaMarca(){
        println("Minha marca $marca")
    }
}

class Computador(marca: String, val nucleos: Int): Maquina(marca) {

    //override - sobreescrever
    override fun minhaMarca() {
        val id = 10
        super.minhaMarca()
    }

    fun ligar(){}
    fun processar(){}

    //sobrecarga
    fun overload(i: Int) = println("overload 1")
    fun overload(i: String) = println("overaload 2")
}

class Pessoa {
    lateinit var nome : String

    fun geradorDeNome() {
        nome = "dasdsa"
    }
}

fun main() {
    val c: Computador = Computador("apto", 10)
    with(c) {
        ligar()
        processar()
        minhaMarca()
    }

    ////////////////////

    println(Constante.Table)
    Constante.teste()
    Constante.Vendas.table_name

    /////////////////

    val p = Pessoa()
    p.geradorDeNome()





}