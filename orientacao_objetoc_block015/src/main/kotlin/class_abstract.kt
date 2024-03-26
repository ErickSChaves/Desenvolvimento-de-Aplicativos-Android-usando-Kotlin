
abstract class Mamifero(var nome: String){

    var peso = 0f

    abstract fun falar()
    fun dormir(){
        println("Estou dormindo")
    }
}

class Cachorro(nome:String, peso: Float) : Mamifero(nome){

    init {
        this.peso = 100f
    }

    override fun falar() {
        println("au au")
    }
}

class Gato(nome:String) : Mamifero(nome){
    override fun falar() {
        println("miau")
    }

}

fun main() {

    Cachorro("Alemao", 12.5f).dormir()

}