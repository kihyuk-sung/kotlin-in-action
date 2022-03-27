package ch03.user

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class UserKtTest {
    @Test
    fun saveUserTest() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            saveUser(User(1, "", ""))
        }
    }
}
