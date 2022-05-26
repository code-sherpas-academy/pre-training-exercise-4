package sample

data class Spaceship(val health: Int) {

    init {
        if(health < 0 || health > 100) throw HealthOutOfRangeException()
    }

}
