class maquina (var marca: String) {


    //getters e setters sao desnecessarios ja que o kotlin faz sozinho por padrao


    var nucleos: Int = 0
        get() {
            println("get foi chamada")
            return field
        }
        set(value) {
            println("set foi chamada")
            field = value
        }

    fun ligar(){
    }

    fun desligar(){
    }

    fun processar(){
    }
}

fun main() {
    var m = maquina("xpto")
    println(m.nucleos)
    m.nucleos = 10


    //a palavra with te permite chamar os metodos sem ser necessario uma variavel
    with(m) {
        ligar()
        desligar()
        processar()
    }
}