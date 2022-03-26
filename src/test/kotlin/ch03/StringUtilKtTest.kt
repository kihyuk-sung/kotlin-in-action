package ch03

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringUtilKtTest {
    @Test
    fun joinToString() {
        val list = listOf(1, 2, 3)

        assertThat(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
            .isEqualTo("(1; 2; 3)")
    }
}
