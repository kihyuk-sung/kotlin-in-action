package ch03.strings

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class StringsKtTest {
    @Test
    fun lastChar() {
        Assertions.assertThat("Kotlin".lastChar()).isEqualTo('n')
    }

    @Test
    fun lastCharProperty() {
        Assertions.assertThat("Kotlin".lastChar).isEqualTo('n')
    }
}
