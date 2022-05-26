package sample

class SpaceshipRepository {
    private val spaceships: MutableList<Spaceship> = MutableList(0) { Spaceship(0, "orion") }

    fun addSpaceship(spaceship: Spaceship) {
        spaceships.add(spaceship)
    }

    fun getSpaceships(): List<Spaceship> {
        return spaceships
    }
}