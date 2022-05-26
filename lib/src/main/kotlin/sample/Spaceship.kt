package sample

data class Spaceship(val health: Int) {

    init {
        if(health > 100) throw MaxHealthException()
        if(health < 0) throw MinHealthException()
    }

}
