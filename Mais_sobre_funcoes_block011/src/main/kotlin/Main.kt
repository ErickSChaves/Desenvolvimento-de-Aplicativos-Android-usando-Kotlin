fun media(vararg notas: Float) {

    if(notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }

        println("A media e: ${soma/notas.size}")
    }
}

fun <T> media2(vararg valores: T) {
    for (valor in valores){
        println(valor)
    }
}



fun main() {

    media(10f, 8f)

    println()

    media2(1f, 5.2, "dsadas")

}