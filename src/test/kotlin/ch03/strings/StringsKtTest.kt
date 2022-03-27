package ch03.strings

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringsKtTest {
    @Test
    fun lastChar() {
        assertThat("Kotlin".lastChar()).isEqualTo('n')
    }

    @Test
    fun lastCharProperty() {
        assertThat("Kotlin".lastChar).isEqualTo('n')
    }

    @Test
    fun split() {
        assertThat("1 2 3 4 5".split(" ")).containsExactlyElementsOf(listOf("1", "2", "3", "4", "5"))
        assertThat("12.345-6.A".split("[.-]".toRegex())).containsExactlyElementsOf(listOf("12", "345", "6", "A"))
    }
}
