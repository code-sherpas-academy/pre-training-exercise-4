package sample

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.catchThrowable
import org.junit.jupiter.api.Test


class SpaceshipTest {

    @Test
    fun `when spaceship shoots at target, then target's health is decreased by 1`(){
        val spaceship = Spaceship(5,"A")
        val target = Spaceship(5, "B")
        spaceship.shootAt(target)
        assertThat(target.getHealth()).isEqualTo(4)
    }

    @Test
    fun `fail when attempting to create spaceship with health below 0`() {
        val exception: Throwable = catchThrowable { Spaceship(-3, "Cris") }
        assertThat(exception).isExactlyInstanceOf(InvalidHealthParameterException::class.java)
    }

    @Test
    fun `if spaceship is not alive, then cannot shoot`() {
        val spaceship = Spaceship(0,"A")
        val target = Spaceship(5, "B")

        val exception = catchThrowable { spaceship.shootAt(target) }

        assertThat(exception).isExactlyInstanceOf(DeadSpaceshipException::class.java)
    }

}
