fun maioridade(idade: Int): Boolean {
    return idade >= 18
}

fun operacaoWhen(a: Int, b: Int, c: String){
    /*
    when (c) {
        "Soma" -> return a + b

        "Subtracao" -> {
            return a - b
        }

        else -> {
            println("Operacao incorreta")
            return 0
        }

    }
*/
    when {
        a in 1..99 && b > 0 -> {
            println("Seculo")
        }
    }
}



fun calculdarbonus(cargo: String, salario: Float): Float {

    return if (cargo == "Cordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Senior") {
        salario * 0.5f
    } else {
        salario * 2
    }

}

fun main() {



    val valor = 10

    val str = if(valor == 10) "Sim" else "Nao"

    //Operador Elvis
    val test: Int? = null
    val op: Int = test ?: 100


    println(maioridade(17))
    println()
    println(calculdarbonus("Cordenador", 100000f))
    println()
    println(str)
    println()
    println(op)
    println()

    //laco de repeticao


    //for
    for(i in 0..100 step 5){
        if(i != 80){
            print("$i ")
        }
    }

    println()

    for(j in 100 downTo 0){
        print("$j ")
    }

    println()

    //while
    var i: Int = 0
    while (i <= 100){
        print("$i ")
        i++

        if(i > 50)
            break
    }

}