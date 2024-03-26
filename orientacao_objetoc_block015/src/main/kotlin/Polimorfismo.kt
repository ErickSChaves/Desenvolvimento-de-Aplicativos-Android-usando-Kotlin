interface Funcionario {
    fun calculabonus()
}

class Gerente : Funcionario {
    override fun calculabonus() {
       println("Bonus: 500")
    }

}

class Tecnico : Funcionario {
    override fun calculabonus() {
        println("Bonus: 200")
    }

}

fun calculo(funcionario : Funcionario){
    funcionario.calculabonus()
}



fun main() {

    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()

    calculo(f1)
    calculo(f2)

}