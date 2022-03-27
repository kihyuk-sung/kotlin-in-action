package ch03.user

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class UserKtTest {
    @Test
    fun saveUserTest() {
        Assertions.assertThatThrownBy {
            saveUser(User(1, "", ""))
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("Can't save user 1: empty Name")
    }
}
