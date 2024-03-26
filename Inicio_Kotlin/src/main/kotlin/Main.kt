fun main(){

    var nome = "Erick"
    var idade = 13

    var character: Char = 'h'

    var str = """asdasdasdasd
        |sadasdasdasdasdas
        |dasdasdasdasd
        |asdasdasdasd
    """.trimMargin()


    println(nome + " Tem $idade anos")
    println()
    println(str + " essa frase tem ${str.length} Letras")
    println()


    ///////////////////////////////////

    fun calcularbonus(a: Int, b:Int, c:Int) {
        println("O bonus e de ${a + b * c}")
    }

    fun soma(a: Int, b: Int) = a + b

    println(calcularbonus(10, 20, 30))
    println()
    println(soma(2, 4))





}