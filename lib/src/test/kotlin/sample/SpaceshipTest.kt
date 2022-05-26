package sample

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SpaceshipTest {

    @Test
    fun `spaceship sets health correctly`() {
        val spaceship = Spaceship(health = 90)

        assertThat(spaceship.health).isEqualTo(90)
    }

    @Test
    fun `spaceship throws exception when health is over 100`() {
        val exception = Assertions.catchThrowable { Spaceship(health = 110) }

        assertThat(exception).isExactlyInstanceOf(HealthOutOfRangeException::class.java)
    }

    @Test
    fun `spaceship throws exception when health is below 0`() {
        val exception = Assertions.catchThrowable { Spaceship(health = -10) }

        assertThat(exception).isExactlyInstanceOf(HealthOutOfRangeException::class.java)
    }
}
