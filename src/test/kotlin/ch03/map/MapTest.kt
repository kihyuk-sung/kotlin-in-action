package ch03.map

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MapTest {
    @Test
    fun map() {
        val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
        assertThat(map[1]).isEqualTo("one")
    }

    @Test
    fun infix() {
        assertThat(1.to("one")).isEqualTo(1 to "one")
    }
}
