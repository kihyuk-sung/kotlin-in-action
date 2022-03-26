package ch03

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringUtilKtTest {
    private val separator = "; "
    private val prefix = "("
    private val postfix = ")"

    @Test
    fun joinToString() {
        val list = listOf(1, 2, 3)

        assertThat(joinToString(list, separator = separator, prefix = prefix, postfix = postfix))
            .isEqualTo("(1; 2; 3)")
    }

    @Test
    fun joinToStringJava() {
        val list = listOf(1, 2, 3)
        assertThat(StringUtilJava.joinToString(list, separator, prefix, postfix))
            .isEqualTo("(1; 2; 3)")
    }
}
