interface maquina {

    fun ligar()
    fun desligar() {
        println("dsad")
    }
}

class computador() : maquina {
    override fun ligar() {}

}

interface interface1 {
    fun ola() {
        println("interface 1")
    }
}

interface interface2 {
    fun ola() {
        println("interface 2")
    }
}

class implementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }
}

