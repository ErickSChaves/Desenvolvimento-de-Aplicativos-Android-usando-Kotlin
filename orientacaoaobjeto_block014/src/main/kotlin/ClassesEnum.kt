enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1){
        override fun toString() : String {
                return "Super baixa nao se preocupe"

        }
            },
    MEDIA(5), ALTA(10)
}


fun main(){

    for(p in Prioridade2.values()) {

        if (p.toString() == "MEDIA") {
            println("Esse e verdade")
        }

        println("$p - ${p.id} - ${p.ordinal}")
    }
}