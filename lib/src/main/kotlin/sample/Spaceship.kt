package sample

class Spaceship(health: Int) {

    private var health: Int = health

    fun getHealth(): Int {
        return health
    }

    fun isAlive(): Boolean {
        return health > 0
    }
}
