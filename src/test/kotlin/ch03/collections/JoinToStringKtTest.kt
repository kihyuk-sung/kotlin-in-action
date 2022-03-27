package ch03.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JoinToStringKtTest {
    @Test
    fun joinToString() {
        val list = listOf(1, 2, 3)
        assertThat(list.joinToString(separator = "; ", prefix = "[", postfix = "]")).isEqualTo("[1; 2; 3]")
    }
}
