package sample

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class SpaceshipRepositoryTest {
    @Test
    fun `spaceship repository created successfully`() {
        val spaceshipRepository = SpaceshipRepository()

        Assertions.assertThat(spaceshipRepository).isNotNull
    }
}