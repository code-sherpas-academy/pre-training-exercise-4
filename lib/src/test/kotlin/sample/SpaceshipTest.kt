package sample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SpaceshipTest {

    @Test
    fun `spaceship A shoots at spaceship B, B health is decremented by 1`(){
        val spaceshipA = Spaceship(5,"A")
        val spaceshipB = Spaceship(5, "B")
        spaceshipA.shootAt(spaceshipB)
        assertThat(spaceshipB.getHealth()).isEqualTo(4)
    }

}
