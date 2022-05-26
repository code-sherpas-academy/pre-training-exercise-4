package sample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class LibraryTest {

    @Test
    fun foo() {
        assertThat(Library().foo()).isEqualTo("foo")
    }
}
