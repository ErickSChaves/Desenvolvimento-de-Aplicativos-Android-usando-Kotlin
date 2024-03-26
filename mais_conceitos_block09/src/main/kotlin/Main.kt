


fun main() {

   //tratamento de exceção
    try {
        println("adsad".toInt())
    }catch (e: NumberFormatException){
        println("Esse valor nao e um numero")
    }catch (e: Exception){
        println("Algo de errado aconteceu")
    } finally {
        println("teste2")
    }

    println("teste")

    ////////////////////////////////////
    println()

    //o ponto de interrogação serve para dizer que um tipo de dado pode ser nulo sem causar algum erro
    val str: String? = null

    println(str?.length)

}