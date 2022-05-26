package sample

class SpaceshipRepository {
    private val spaceships : MutableList<Spaceship> = MutableList<Spaceship>(0){
        Spaceship(0)
    }

    fun createSpaceship(health : Int) {
        spaceships.add(Spaceship(health))
    }

    fun getAllSpaceships() : MutableList<Spaceship> {
        return spaceships
    }
}