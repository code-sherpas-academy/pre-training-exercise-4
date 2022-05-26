package sample

data class Spaceship(val health: Int) {

    init {
        if(health < MIN_HEALTH || health > MAX_HEALTH) throw HealthOutOfRangeException()
    }

    companion object {
        const val MAX_HEALTH = 100
        const val MIN_HEALTH = 0
    }

}
