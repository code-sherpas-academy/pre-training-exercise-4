package sample

class Spaceship(health: Int, name: String) {

    private var health: Int = health
    private var name: String = name

    fun getHealth(): Int {
        return health
    }

    fun getName(): String {
        return name
    }

    fun isAlive(): Boolean {
        return health > 0
    }
}
