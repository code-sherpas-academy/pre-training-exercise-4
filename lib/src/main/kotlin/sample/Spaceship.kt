package sample

class Spaceship(health: Int, name: String) {

    private var health: Int = health
    private var name: String = name

    init {
        if(health < 0) throw InvalidHealthParameterException(health)
    }

    fun getHealth(): Int {
        return health
    }

    fun getName(): String {
        return name
    }

    fun isAlive(): Boolean {
        return health > 0
    }

    fun shootAt(target: Spaceship) {
        if(!this.isAlive()) throw DeadSpaceshipException()

        if(target.isAlive()) target.health--
    }
}
