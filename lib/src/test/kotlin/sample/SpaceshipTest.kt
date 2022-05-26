package sample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SpaceshipTest {

    @Test
    fun `when spaceship shoots at target, then target's health is decreased by 1`(){
        val spaceship = Spaceship(5,"A")
        val target = Spaceship(5, "B")
        spaceship.shootAt(target)
        assertThat(target.getHealth()).isEqualTo(4)
    }

}
